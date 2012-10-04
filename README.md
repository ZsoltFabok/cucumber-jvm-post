This repository contains the java code I created while I was writing my posts about cucumber-jvm. Each post has its different branch:

 - **http://www.zsoltfabok.com/blog/2011/12/cucumber-jvm-preparation/** ([episode_1](https://github.com/ZsoltFabok/cucumber-jvm-post/tree/episode_1)): it is about the basics of BDD and cucumber and how to set up an eclipse project for executing cucumber features from java
 - **http://www.zsoltfabok.com/blog/2011/12/cucumber-jvm-more-scenarios/** ([episode_2](https://github.com/ZsoltFabok/cucumber-jvm-post/tree/episode_2)): the series continues with *scenarios* and with a couple of ideas on how to use them
 - **http://www.zsoltfabok.com/blog/2012/01/cucumber-jvm-di/** ([episode_3](https://github.com/ZsoltFabok/cucumber-jvm-post/tree/episode_3)): in this episode I'm introducing *Spring* and dependency injection
 - **http://zsoltfabok.com/blog/2012/03/cucumber-jvm-mocking/** ([episode_4](https://github.com/ZsoltFabok/cucumber-jvm-post/tree/episode_4)): there is testing without mocking. This episode shows how to use *mockito* with *cucumber-jvm*
 - **http://zsoltfabok.com/blog/2012/09/cucumber-jvm-web-with-spring-mvc/** ([episode_5](https://github.com/ZsoltFabok/cucumber-jvm-post/tree/episode_5)): a huge step forward: introducing MVC and full-stack testing
 - **http://zsoltfabok.com/blog/2012/09/cucumber-jvm-hooks/** ([episode_6](https://github.com/ZsoltFabok/cucumber-jvm-post/tree/episode_6)): I'm using hooks for the sake of cleaner test code

### Building, configuring and running

I'm using [ivy](http://ant.apache.org/ivy/) for managing the project dependencies, so after cloning the repository you have to run ivy:
```bash
 % ivy
```
and install the [ivyDE plugin](http://ant.apache.org/ivy/ivyde/index.html).

Building the project:
```bash
 % ant compile
```

You may have a different location for `ivy` therefore the location of the `ivy.jar` is configurable via the `build.properties` file. Use the example `build.properties_example` for setting it properly.

Running the test cases:
```bash
 % ant test
```

Cleaning up:
```bash
 % ant clean
```