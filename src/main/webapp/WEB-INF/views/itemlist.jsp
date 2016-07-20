<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
	<h1>Example for Spring MVC Excel Export</h1>

	<h2>Items List</h2>

	<h3><a href="./export">Export</a></h3>
<form:form method="post" action="./export" modelAttribute="itemList">
	<table border="1px" cellpadding="8px">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Price</td>
			<td>Quantity</td>
			
		</tr>

		<c:forEach items="${itemList}" var="item">
			<tr>
                                <td><c:out value="${item.id}" /></td>
				<td><c:out value="${item.itemName}" /></td>
				<td><c:out value="${item.price}" /></td>
				<td><c:out value="${item.quantity}" /></td>
				
			</tr>
		</c:forEach>
	</table>
    <input type="submit" value="Save" />
</form:form>

</body>
</html>
