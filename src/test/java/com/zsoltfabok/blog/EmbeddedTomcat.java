package com.zsoltfabok.blog;

import java.io.File;
import java.io.IOException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.commons.io.FileUtils;

public class EmbeddedTomcat {
  private Tomcat tomcat;

  public void start() {
    try {
      tomcat = new Tomcat();
      // If I don't want to copy files around then the base directory must be '.'
      String baseDir = ".";
      tomcat.setPort(8090);
      tomcat.setBaseDir(baseDir);
      tomcat.getHost().setAppBase(baseDir);
      tomcat.getHost().setDeployOnStartup(true);
      tomcat.getHost().setAutoDeploy(true);
      tomcat.start();
    } catch (LifecycleException e) {
      throw new RuntimeException(e);
    }
  }

  public void stop() {
    try {
      tomcat.stop();
      tomcat.destroy();
      // Tomcat creates a work folder where the temporary files are stored
      FileUtils.deleteDirectory(new File("work"));
      FileUtils.deleteDirectory(new File("tomcat.8080"));
    } catch (LifecycleException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void deploy(String appName) {
    tomcat.addWebapp(tomcat.getHost(), "/" + appName, "src/main/webapp");
  }

  public String getApplicationUrl(String appName) {
    return String.format("http://%s:%d/%s", tomcat.getHost().getName(),
        tomcat.getConnector().getLocalPort(), appName);
  }

  public boolean isRunning() {
      return tomcat != null;
  }
}
