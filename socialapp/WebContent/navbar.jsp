<nav class="navbar navbar-fixed-top navbar-default navbar-inverse">
	<div class="navbar-header">
            <a href="#" class="navbar-brand" id="BrandName"><%=this.getServletContext().getInitParameter("appName")%></a>
		<button type="button" class="navbar-toggle" data-target="#LoggIn">
			<a href="#myModal" data-toggle="modal"
				class="btn-sm btn-success text-success" id="LogIn">Log In</a>
		</button>
		<button type="button" data-toggle="collapse" class="navbar-toggle"
			data-target="#NavbarCollapse">
			<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button>


	</div>
	<div id="NavbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="City.html">City</a></li>
			<li><a href="#">Sports</a></li>
			<li class="dropdown"><a href="#" data-toggle="dropdown">Politics<b
					class="caret"></b></a>

				<ul class="dropdown-menu">

					<li class="dropdown"><a href="#" data-toggle="dropdown"
						class="dropdown-toggle">Parliament</a>

						<ul class="dropdown-menu" data-toggle="dropdown">
							<li>Test</li>
						</ul></li>




					<li><a href="#">Assembly</a></li>
				</ul></li>
			<li><a href="#">Movies</a></li>

		</ul>
		<strong id="LoggIn" class="collapse navbar-collapse"><span
			class="pull-right" style="padding: 10px"><a href="#myModal"
				data-toggle="modal" class="btn-sm btn-success text-success"
				id="LogIn">Log In</a></span></strong>
	</div>


</nav>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header bg-primary">
				<div class="modal-title ">
					Sign In <span class="close btn" data-dismiss="modal"
						id="CloseModal_CSS">&times;</span>
				</div>
			</div>

			<input type="hidden" id="ctx"
				value="${pageContext.request.contextPath}" />
                        <div class="modal-body" style="height: 380px;">
				<form role="role" id="signInForm">


					<div id="info">
						<span
							class="glyphicon glyphicon-warning-sign text-danger text-center"></span>&nbsp;&nbsp;&nbsp;<span
							class="text-danger">Invalid User Name/Password</span>
					</div>
					<br />

					<div class="form-group" id="lblUserName">

						<label for="UserName" class="control-label">E-Mail</label> <input
							type="text" class="form-control" placeholder="E-Mail"
							name="email" id="email">
					</div>

					<div class="form-group" id="lblPassword">
						<label for="Password" class="control-label">Password</label> <input
							type="password" class="form-control" placeholder="Password"
							name="password" id="password">
					</div>

				</form>

				<div class="form-group">
					<button class="btn btn-sm btn-primary" id="btnSignIn">Sign
						In</button>
					<button class="btn btn-sm btn-danger" id="btnClear">Clear</button>
					<div style="float: right">
						<a href="forgotPassword.jsp" class="">Forgot Password</a>
					</div>
				</div>


				<div id="ajaxLoad">
					<img src='images/ajax-loader.gif' />&nbsp;Please Wait ..
				</div>
				<br />

				<div class="form-group">
					<label><a
						href="${pageContext.request.contextPath}/login.htm"><img
							src="images/active_404.png"></a></label> <label style="float: right;" ><button
                                                                class="btn btn-lg btn-primary" id="btnRegisterInfoHub" type="button" data-loading-text="Please Wait ....">Register
							With InfoHub</button></label>
				</div>


			</div>
		</div>

	</div>



</div>




</div>

<script type="text/javascript" src="js/social.js"></script>
<script type="text/javascript">
	jQuery(document).ready(SocialApp.initHome());
</script>

<script type="text/javascript">
	SocialApp.CONTEXT = '${pageContext.request.contextPath}';
</script>
