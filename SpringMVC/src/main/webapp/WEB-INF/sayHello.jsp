<%--If you are using the old JSP 1.2 descriptor, defined by DTD
The EL is disabled or ignored by default, you have to enable it manually, 
so that it will outputs the value store in the  model. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%@ page isELIgnored="false" %>
</head>
<body>
Name of my Favourite actor is : ${Actor.name}
Name of my Favourite movie is : ${Actor.favMovie}
</body>
</html>