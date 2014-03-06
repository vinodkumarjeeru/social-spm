
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="images/active_404.png">
        <link rel="stylesheet" href="css/navbar_admin.css">
        <title>Create District</title>

    </head>
    <style type="text/css">
        #CreateDistrict{
            position: relative;
            top: 100px;
            left: 10px;
        }
    </style>
    <%@include file="navbar_admin.jsp"%>    
    <body>


        <div class="container" id="CreateDistrict">

            <div class="panel panel-group panel-primary">
                <div class="panel-heading bg-primary">
                    <div class="panel-title text-center">
                        <b>Create District Details </b>
                    </div>

                </div>
                <div class="panel-body">
                    <form class="form-group">
                        <div class="form-group">
                            <label class="text-left">District Name</label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="text-left">District Headquarters </label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="text-left">State </label>
                            <input type="text" class="form-control">
                        </div>

                    </form>
                    <div class="form-group">
                        <button type="button" class="btn btn-success">Submit</button>
                        <button type="button" class="btn btn-danger">Reset</button>
                    </div>

                </div>
            </div>


        </div>


    </body>
</html>
