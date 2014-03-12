<%-- 
    Document   : changePassword
    Created on : 12 Mar, 2014, 11:04:21 AM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="images/MaleImg.jpg">
<link rel="stylesheet" href="css/socialapp.css"
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change password</title>
    </head>
    <body>
        <%@include file="navbarUser.jsp"%>
        <div class="container">
            <div class="jumbotron">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <div class="text-center panel-title">
                            <strong>Change Your Password</strong>
                        </div>
                    </div>
                    <div class="panel-body">
                        <form class="" action="${pageContext.request.contextPath}/changePassword" method="post">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control" name="email">
                                <c:if test="${not empty emailError }">
							<h6>
								<font color="red"><c:out value="${emailError }" /></font>
							</h6>
						</c:if>
                            </div>
                            <div class="form-group">
                                <label>Current Password</label>
                                <input type="password" class="form-control" name="currentPassword">
                                <c:if test="${not empty currentPasswordError }">
							<h6>
								<font color="red"><c:out value="${currentPasswordError }" /></font>
							</h6>
						</c:if>
                            </div>
                            <div class="form-group">
                                <label>New Password</label>
                                <input type="password" class="form-control" name="newPassword">
                                <c:if test="${not empty newPasswordError }">
							<h6>
								<font color="red"><c:out value="${newPasswordError }" /></font>
							</h6>
						</c:if>
                            </div>

                            <div class="form-group">
                                <input type="submit" value="Change" data-loading-text="Please Wait...." class="btn btn-primary" name="action">
                                <input type="button" value="Reset" class="btn btn-danger">
                                <c:if test="${not empty passwordUpdateMessage }">
						<h4 class="text-muted">
							<c:out value="${passwordUpdateMessage }" />
						</h4>
					</c:if>
                                
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
