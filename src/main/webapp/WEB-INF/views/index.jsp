<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
  <head>
    <title>App</title>
  </head>
  <body>
    <form name="input" action="munge" method="post">
      your text:
      <input id="text" type="text" name="text" />
      <input id="submit" type="submit" value="Submit" />
    </form>
    <c:if test="${munged != null}">
      munged:&nbsp;<span id="munged">${munged}</span>&nbsp;<span id="original">(${original})</span>
    </c:if>
  </body>
</html>