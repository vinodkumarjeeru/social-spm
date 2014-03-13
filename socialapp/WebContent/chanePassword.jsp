<%-- 
    Document   : chanePassword
    Created on : 12 Mar, 2014, 11:04:21 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
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
                        <form class="">
                            <div class="form-group">
                                <label>Email</label>
                                <input type="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Current Password</label>
                                <input type="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>New Password</label>
                                <input type="password" class="form-control">
                            </div>

                            <div class="form-group">
                                <input type="submit" value="Submit" data-loading-text="Please Wait...." class="btn btn-primary">
                                <input type="button" value="Reset" class="btn btn-danger">

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
