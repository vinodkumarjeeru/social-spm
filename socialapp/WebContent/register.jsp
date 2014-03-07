
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.js"></script>
<script src="js/social.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta charset=UTF-8">
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
			<a href="#" class="navbar-brand">Infohub</a>
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
								id="fname" name="firstName"> <input type="text"
								class="form-control" placeholder="Last Name" id="lname"
								name="lastName">

						</div>
					</div>
					<div class="form-group">
						<label> E-mail </label> <input type="email" class="form-control"
							name="email" placeholder="E-Mail" id="email"> <span
							class="help-block text-danger">Please enter ur usrname</span>
					</div>
					<div class="form-group">
						<label>Password </label> <input type="password"
							class="form-control" name="password" placeholder="Password"
							id="password">
					</div>
					<div class="form-group">
						<label>Confirm Password</label> <input type="password"
							class="form-control" name="confirmPassword"
							placeholder="Confirm Password" id="confirmPassword">
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
					</div>
					<div class="form-group">
						<label>Your Phone Number </label> <input type="tel"
							class="form-control" name="mobile" placeholder="Phone Number"
							id="mobile">
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
					</div>
					<div class="form-group">
						<label>Answer</label> <input type="text" class="form-control"
							name="answer" placeholder="Answer" id="answer">

					</div>

					<div class="form-group">
						<label>Your Profile Picture</label> <input type="file"
							class="form-control" name="profilePicture"
							placeholder="Profile Picture" id="profilePicture">

					</div>



					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Submit">
						<button type="button" class="btn btn-danger">Reset</button>
					</div>
				</form>
			</div>
		</div>


	</div>


</body>
</html>
