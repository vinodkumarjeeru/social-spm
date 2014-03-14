

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="images/MaleImg.jpg">
        <link rel="stylesheet" href="css/socialapp.css">
        <title>Change password</title>

    </head>
    <%@include file="navbarUser.jsp"%>
    <body>
        <br><br>
        <div class="container" style="position: absolute;">
            <div class="panel panel-primary" id="Pan">
                <div class="panel-heading">
                    <div class="text-center panel-title">
                        <strong>Change Your Password</strong>
                    </div>
                </div>
                <div class="panel-body">
                    <form action="${pageContext.request.contextPath}/changePassword" method="post">
                        <div class="form-group">
                            <label>Email</label>
                            <input type="email" class="form-control" name="email" value="${user.email }" readonly="readonly">
                            <c:if test="${not empty emailError }">
                                <h6>
                                    <font color="red"><c:out value="${emailError }" /></font>
                                </h6>
                            </c:if>
                        </div>
                        <div class="form-group">
                            <label>Current Password</label>
                            <input type="password" class="form-control" name="currentPassword">
                            <c:if test="${not empty invalidDetails }">
                                <h6>
                                    <font color="red"><c:out value="${invalidDetails }" /></font>
                                </h6>
                            </c:if>
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


    </body>
</html>
