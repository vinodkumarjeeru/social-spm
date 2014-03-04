<nav class="navbar navbar-fixed-top navbar-default navbar-inverse">
	<div class="navbar-header">
		<a href="#" class="navbar-brand" id="BrandName"> InfoHub </a>
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
			<div class="modal-body">
				<form role="role">

					<div class="form-group">

						<label for="UserName">E-Mail</label> <input type="text"
							class="form-control">
					</div>

					<div class="form-group">
						<label for="Password">Password</label> <input type="password"
							class="form-control">
					</div>

					<div class="form-group">
						<a href="#" class="btn btn-sm btn-primary">Sign In</a> <a href="#"
							class="btn btn-sm btn-danger">Clear</a>
					</div>

					<div class="form-group">
						<label><a href="${pageContext.request.contextPath}/login.htm"><img src="images/active_404.png"></a></label>
					</div>


				</form>


			</div>
		</div>

	</div>



</div>
</div>


