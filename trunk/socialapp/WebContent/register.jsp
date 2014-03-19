
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
#Register {
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
			<li><a href="index.jsp" class="text-success btn btn-success"
				id="HomeLink">Home</a></li>
		</ul>

	</nav>


	<div class="container" id="Register">

		<div class="panel panel-group panel-primary">
			<div class="panel-heading bg-primary">
				<div class="panel-title text-center">
					<b>Register </b>
				</div>

			</div>
			<div class="panel-body">
				<form class="form-group" method="post" enctype="multipart/form-data"
					action="${pageContext.request.contextPath}/register">
					<div class="form-group">
						<label>Your Name </label>
						<div class="input-group">
							<input type="text" class="form-control" placeholder="First Name"
								id="fname" name="firstName" value="${param.firstName}">
							<c:if test="${not empty firstNameError}">
								<h6>
									<font color="red"><c:out value="${firstNameError }" />
									</font>
								</h6>
							</c:if>
							<input type="text" class="form-control" placeholder="Last Name"
								id="lname" name="lastName" value="${param.lastName }">
							<c:if test="${not empty lastNameError}">
								<span class="text-danger help-block"> <font color="red"><c:out
											value="${lastNameError }"></c:out> </font>
								</span>
							</c:if>

						</div>
					</div>
					<div class="form-group">
						<label> E-mail </label> <input type="email" class="form-control"
							name="email" placeholder="E-Mail" id="email">
						<c:if test="${not empty emailExistError}">
							<h6>
								<font color="red"><c:out value="${emailExistError}" /></font>
							</h6>
						</c:if>
						<c:if test="${not empty mailIdError}">
							<h6>
								<font color="red"><c:out value="${mailIdError }"></c:out>
								</font>
							</h6>
						</c:if>

					</div>
					<div class="form-group">
						<label>Password </label> <input type="password"
							class="form-control" name="password" placeholder="Password"
							id="password">
						<c:if test="${not empty newPasswordError}">
							<h6>
								<font color="red"><c:out value="${newPasswordError }"></c:out>
								</font>
							</h6>
						</c:if>
					</div>
					<div class="form-group">
						<label>Confirm Password</label> <input type="password"
							class="form-control" name="confirmPassword"
							placeholder="Confirm Password" id="confirmPassword">
						<c:if test="${ not empty errMsg}">
							<p class="help-block" style="color: red;">
								<c:out value="${errMsg}" />
							</p>
						</c:if>
						<c:if test="${not empty rePasswordError}">
							<h6>
								<font color="red"><c:out value="${rePasswordError }"></c:out>
								</font>
							</h6>
						</c:if>
						<c:if test="${not empty checkPasswordError}">
							<h6>
								<font color="red"><c:out value="${checkPasswordError }"></c:out>
								</font>
							</h6>
						</c:if>

					</div>
					<div class="form-group">
						<label>Your District </label> <input list="districts" type="text"
							class="form-control" name="districtName" placeholder="District"
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
						<c:if test="${not empty districtError}">
							<h6>
								<font color="red"><c:out value="${districtError}"></c:out>
								</font>
							</h6>
						</c:if>

					</div>
					<div class="form-group">
						<label>Your Phone Number </label> <input type="tel"
							class="form-control" name="mobile" placeholder="Phone Number"
							id="mobile">
						<c:if test="${not empty mobileNumberError}">
							<h6>
								<font color="red"><c:out value="${mobileNumberError}"></c:out>
								</font>
							</h6>
						</c:if>
					</div>
					<div class="form-group">
						<label>Security Questions</label> <select class="form-control"
							name="securityQuestion" id="securityQuestion">
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
						<c:if test="${not empty secQuestionError}">
							<h6>
								<font color="red"><c:out value="${secQuestionError}"></c:out>
								</font>
							</h6>
						</c:if>

					</div>
					<div class="form-group">
						<label>Answer</label> <input type="text" class="form-control"
							name="answer" placeholder="Answer" id="answer">
						<c:if test="${not empty givenAnswerError}">
							<h6>
								<font color="red"><c:out value="${givenAnswerError}"></c:out>
								</font>
							</h6>
						</c:if>

					</div>

					<div class="form-group">
						<label>Your Profile Picture</label> <input type="file"
							class="form-control" name="profilePicture"
							placeholder="Profile Picture" id="profilePicture">

					</div>



					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Submit">
						<button type="button" class="btn btn-danger">Reset</button>
						<c:if test="${not empty msg}">
							<h4>
								<c:out value="${msg}" />
								<a href="#">Sign In</a> to access Your Account.
							</h4>
						</c:if>
					</div>
				</form>
			</div>
		</div>


	</div>


</body>
</html>
