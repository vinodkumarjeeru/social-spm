
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
        <title>List Districts</title>
        <style type="text/css">
            body{
                position: relative;
                top: 100px;

            }
            .etbody{
                padding: 15px;
            }

        </style>
    </head>
    <%@include file="navbar_admin.jsp"%>
    <body>
        <div class="container">
            <div class="row">

                <table class="table table-striped table-hover table-responsive">

                    <thead>
                        <tr>
                            <th> District Id</th>
                            <th> District Name</th>
                            <th> District Headquarters</th>
                            <th> District Map</th>
                        </tr>
                    </thead>   
                    <tbody >

                    </tbody>
                </table>
            </div>
        </div>


    </body>
</html>
