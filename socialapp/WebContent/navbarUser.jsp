<nav class="navbar navbar-fixed-top navbar-default navbar-inverse">
	<div class="navbar-header">
		<a href="#" class="navbar-brand" id="BrandName"> <%=this.getServletContext().getInitParameter("appName")%>
		</a>
		<button type="button" data-toggle="collapse" class="navbar-toggle"
			data-target="#NavbarCollapse">
			<span class="icon-bar"></span> <span class="icon-bar"></span> <span
				class="icon-bar"></span>
		</button>
		<img
			src="${pageContext.request.contextPath}/userImage?email=${user.email}"
			class="img-circle navbar-toggle" height="45px" width="45px"
			data-toggle="collapse" class="navbar-toggle"
			data-target="#newNavbarcollapse">




	</div>
	<div id="NavbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">City</a></li>
			<li><a href="#">Sports</a></li>
			<li class="dropdown"><a href="#" data-toggle="dropdown">Politics<b
					class="caret"></b></a>

				<ul class="dropdown-menu">

					<li class="dropdown"><a href="#">Parliament</a>
					<li><a href="#">Assembly</a></li>
				</ul></li>
			<li><a href="#">Movies</a></li>

		</ul>
		<div class="pull-right collapse navbar-collapse"
			style="width: max-content">
			<span class="navbar-brand text-center"><strong> <c:out
						value="${user.firstName}" /> <c:out value="${user.lastName}" />
			</strong></span> <span class="pull-right text-center"
				style="position: relative; top: 5px; left: -10px;"><b><img
					src="${pageContext.request.contextPath}/userImage?email=${user.email}"
					class="img-circle" id="UserImage" height="40px" width="40px"
					data-toggle="collapse" data-target="#fullUserOptions"> </b></span>

		</div>


	</div>


	<div id="newNavbarcollapse" class="collapse">
		<ul class="list-unstyled nav navbar-nav">
			<li><a
				href="${pageContext.request.contextPath}/profile?action=view&email=${user.email}">Change
					Profile</a></li>
			<li><a href="${pageContext.request.contextPath}/sign-out">Logout</a></li>
			<li><a
				href="${pageContext.request.contextPath}/profile?email=${user.email}">Change
					Display Picture</a></li>
			<li><a
				href="${pageContext.request.contextPath}/changePassword?action=view">Change
					Password</a></li>
		</ul>
	</div>

</nav>

<div id="fullUserOptions" class="collapse pull-right well"
	style="position: relative; top: -20px; left: 65px; width: fit-content; z-index: 100;">

	<ul class="nav nav-tabs list-unstyled list-inline"
		style="width: max-content; padding: 20px;">
		<li>
			<ul class="nav nav-stacked">
				<img
					src="${pageContext.request.contextPath}/userImage?email=${user.email}"
					height="100px" width="100px">
				<li class="sr-only">break</li>
				<li><i><a
						href="${pageContext.request.contextPath}/profile?email=${user.email}"
						class="btn-link">Change Picture</a></i></li>
			</ul>
		</li>
		<li class="sr-only">break</li>
		<li class="sr-only">break</li>
		<li class="sr-only">break</li>
		<li class="sr-only">break</li>
		<li class="sr-only">break</li>
		<li class="sr-only">break</li>
		<li class="pull-right">
			<ul class="nav nav-stacked list-unstyled ">
				<li><b> <a
						href="${pageContext.request.contextPath}/profile?action=view&email=${user.email}"
						class="btn btn-primary"> Change Profile</a></b></li>
				<li class="sr-only">break</li>
				<li class="sr-only">break</li>
				<li><b> <a
						href="${pageContext.request.contextPath}/changePassword?action=view"
						class="btn btn-primary">Change Password</a></b></li>
				<li class="sr-only">break</li>
				<li class="sr-only">break</li>
				<li><b><a
						href="${pageContext.request.contextPath}/sign-out"
						class="btn btn-danger">Logout</a></b></li>
			</ul>
		</li>


	</ul>

</div>







