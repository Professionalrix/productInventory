<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>	
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stock Ledger</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	
		<div class ="container">
		<form:form action="stockLedger" method="post" modelAttribute="stockLedger">
		<div class="row">
			<div class="col-2 mt-4">
				<label for="fromDate">From Date:</label> <form:input type="date"
				id="fromdate" path="fromDate" name="fromDate"/> 
			
			</div>
			<div class="col-2 mt-4">
				<label for="toDate">To Date:</label> <form:input type="date"
				id="toDate" path="toDate" name="toDate"/> 
			
			</div>
				<div class="col-2 mt-4">
					<label for="productName">Product Name:</label> 
					<form:select name="productId" path="productId">
						<c:forEach items="${productList}" var="product">
							<option value="${product.id} ">${product.productName}</option>
						</c:forEach>
					</form:select>

				</div>
				<div class="col-2 mt-4">
					<label for="productName">Store Name:</label>
					 <form:select name="storeId" path="storeId">
						<c:forEach items="${storeList}" var="store">
							<option value="${store.id}">${store.name}</option>
						</c:forEach>
					</form:select>

				</div>

				<div class="col-3 mt-5">
				<button type="submit" class="btn btn-primary">Submit</button>
			
			</div>
			
		</div>
		
		</form:form>
	


	</div>
	
	<!-- stock ledger -->
	
	<div class="container-fluid mt-3">
	
	  <table class="table table-striped table-advance table-hover">
                <tbody>
                  <tr>
                    <th><i class="icon_profile"></i> Product Code</th>
                    <th><i class="icon_calendar"></i>Product Name</th>
                    <th><i class="icon_mail_alt"></i> Unit</th>
                    <th><i class="icon_pin_alt"></i> Op.Stock</th>
                    <th><i class="icon_mobile"></i> In.Qty</th>
                    <th><i class="icon_cogs"></i> Out.Qty</th>
                     <th><i class="icon_cogs"></i>Cls Stock</th>
                     <th><i class="icon_cogs"></i>Supplier/Manufacture</th>
                  </tr>
                
                
                  <tr>
                    <td>Mario Norris</td>
                    <td>2010-02-08</td>
                    <td>mildred@hour.info</td>
                    <td>Amarillo</td>
                    <td>945-547-5302</td>
                   <td>945-547-5302</td>
                  </tr>
                </tbody>
              </table>
	
	</div>
	
	
		 
		 
	

</body>
</html>