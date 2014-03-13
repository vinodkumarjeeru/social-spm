
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" href="images/active_404.png">
        <link rel="stylesheet" href="css/navbar_admin.css">
        <title>Administrator Home</title>
    </head>
    <%@include file="navbar_admin.jsp"%>
    <body>
        <div class="container">
            <br><br><br>



            <div class="text-center">
                <div class="bg-info" style="width: fit-content;">
                    <ul class="nav nav-pills">
                        <li><a href="adminPolitparliCreate.jsp">Create</a></li>
                        <li><a href="#">Update</a></li>
                        <li><a href="#">List</a></li>
                    </ul>
                </div>

            </div>
        </div>


    </body>
</html>
