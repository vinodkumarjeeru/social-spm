<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.js"></script>
<script src="js/social.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<link rel="icon" href="images/active_404.png">
<title>Forgot Password</title>
<style type="text/css">
#Register {
	position: relative;
	top: 100px;
	left: 10px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-fixed-top navbar-default navbar-inverse">
		<div class="navbar-header">
			<a href="#" class="navbar-brand">Infohub</a>
		</div>
		<ul class="pull-right navbar-brand list-unstyled">
			<li><a href="index.jsp" class="text-success btn btn-success">Home</a></li>
		</ul>

	</nav>



	<div class="container" id="Register">

		<div class="panel panel-group panel-primary">
			<div class="panel-heading bg-primary">
				<div class="panel-title text-center">
					<b>Password Recovery </b>
				</div>

			</div>
			<div class="panel-body">
				<form class="form-group" method="post"
					action="${pageContext.request.contextPath}/getPassword">

					<div class="form-group">
						<label> E-mail </label> <input type="email" class="form-control"
							name="email" placeholder="E-Mail"
							value="<%=(request.getParameter("email") != null) ? (request
					.getParameter("email")) : ""%>">
						<c:if test="${not empty emailError}">
							<span class="help-block text-danger"><font color="red">
									<c:out value="${emailError}" />
							</font></span>
						</c:if>
					</div>

					<div class="form-group">
						<label>Security Questions</label> <select class="form-control"
							name="securityQuestion">
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
							<span class="help-block text-danger"> <font color="red"><c:out /></font>
							</span>
						</c:if>
					</div>

					<div class="form-group">
						<label>Answer</label> <input type="text" class="form-control"
							name="answer" placeholder="Answer">
						<c:if test="${not empty answerError}">
							<span class="help-block text-danger"> <font color="red"><c:out
										value="${answerError }"></c:out></font>
							</span>
						</c:if>
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Submit">
						<button type="button" class="btn btn-danger">cancel</button>
					</div>
				</form>
			</div>
		</div>


	</div>

</body>
</html>