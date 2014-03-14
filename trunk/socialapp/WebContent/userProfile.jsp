
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.js"></script>
<script src="js/social.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/active_404.png">
<title>User Registration</title>

</head>
<style type="text/css">
#ProfileUser {
	position: relative;
	top: 100px;
	left: 10px;
}

#fname,#lname,#mname {
	width: 300px;
}
</style>

<body>

	<nav class="navbar navbar-fixed-top navbar-default navbar-inverse">
		<div class="navbar-header">
			<a href="#" class="navbar-brand"><%=this.getServletContext().getInitParameter("appName")%></a>
		</div>
		<ul class="pull-right navbar-brand list-unstyled">
			<li><a href="userHome.jsp" class="text-success btn btn-success"
				id="HomeLink">Home</a></li>
		</ul>

	</nav>


	<div class="container" id="ProfileUser">

		<div class="panel panel-group panel-primary">
			<div class="panel-heading bg-primary">
				<div class="panel-title text-center">
					<b>Your Profile</b>
				</div>

			</div>
			<div class="panel-body">

				<div class="form-group pull-right">
					<img
						src="${pageContext.request.contextPath}/userImage?email=${user.email}"
						class="img-responsive" style="width: 95px; height: 95px;">
				</div>
				<form class="form-group" method="post"
					action="${pageContext.request.contextPath}/profile">
					<div class="form-group pull-left">
						<label>First Name </label> <input type="text" class="form-control"
							id="fname" name="firstName" value="${user.firstName}">
						<c:if test="${not empty firstNameError }">
							<h6>
								<font color="red"><c:out value="${firstNameError }" /></font>
							</h6>
						</c:if>

						<label>Last Name</label> <input type="text" class="form-control"
							id="lname" name="lastName" value="${user.lastName }">
						<c:if test="${not empty lastNameError }">
							<h6>
								<font color="red"><c:out value="${lastNameError }" /></font>
							</h6>
						</c:if>


					</div>
			</div>

			<div class="panel-body">
				<div class="form-group">
					<label> E-mail </label> <input type="email" class="form-control"
						name="email1" value="${user.email}" id="email" readonly="readonly">

				</div>

				<div class="form-group">
					<label>Your District </label> <input list="districts" type="text"
						class="form-control" name="district" value="${user.district}"
						id="districtReg">
					<datalist id="districts">

						<option value="Adilabad"</option>
						<option value="Anantapur"></option>
						<option value="Chittoor"></option>
						<option value="East Godavari"></option>
						<option value="Guntur"></option>
						<option value="Hyderabad"></option>
						<option value="Karimnagar"></option>
						<option value="Khammam"></option>
						<option value="Krishna"></option>
						<option value="Kurnool"></option>
						<option value="Mahabubnagar"></option>
						<option value="Medak"></option>
						<option value="Nalgonda"></option>
						<option value="Nizamabad"></option>
						<option value="Prakasam PSR"></option>
						<option value="Nellore"></option>
						<option value="Ranga Reddy"></option>
						<option value="Srikakulam"></option>
						<option value="Visakhapatnam"></option>
						<option value="Vizianagaram"></option>
						<option value="Warangal"></option>
						<option value="West Godavari"></option>
						<option value="YSR Kadapa"></option>

					</datalist>
					<c:if test="${not empty districtError }">
						<h6>
							<font color="red"><c:out value="${districtError }" /></font>
						</h6>
					</c:if>


				</div>
				<div class="form-group">
					<label>Your Phone Number </label> <input type="tel"
						class="form-control" name="mobile" value="${user.mobile}"
						id="mobile">
					<c:if test="${not empty mobileError }">
						<h6>
							<font color="red"><c:out value="${mobileError }" /></font>
						</h6>
					</c:if>

				</div>
				<div class="form-group">
					<label>Security Questions</label> <select class="form-control"
						name="securityQuestion" id="securityQuestion"
						value="${user.securityQuestion}">
						<option>Security Question</option>
						<option>What is the name of your favorite childhood
							friend?</option>
						<option>What is the name of your favorite childhood
							friend?</option>
						<option>What was your dream job as a child?</option>
						<option>What time of the day were you born?</option>
						<option>Who was your childhood hero?</option>
						<option>In what year was your father born?</option>

					</select>
					<c:if test="${not empty secQuestionError }">
						<h6>
							<font color="red"><c:out value="${secQuestionError }" /></font>
						</h6>
					</c:if>

				</div>
				<div class="form-group">
					<label>Answer</label> <input type="text" class="form-control"
						name="answer" value="${user.answer}" id="answer">

					<c:if test="${not empty answerError }">
						<h6>
							<font color="red"><c:out value="${answerError }" /></font>
						</h6>
					</c:if>
				</div>


				<div class="form-group">
					<input type="submit" class="btn btn-success" value="Update"
						name="action">
					<button type="button" class="btn btn-danger">Reset</button>
					<c:if test="${not empty updateMessage }">
						<h4 class="text-muted">
							<c:out value="${updateMessage }" />
						</h4>
					</c:if>

				</div>
				</form>
			</div>
		</div>


	</div>


</body>
</html>
