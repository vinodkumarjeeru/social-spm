
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <title>Create Assembly</title>

    </head>
    <style type="text/css">
        #CreateDistrict {
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
                        <b>Create Assembly Constituency</b>
                    </div>

                </div>
                <div class="panel-body">
                    <form class="form-group">
                        <div class="form-group">
                            <label>Assembly Constituency Name</label> <input type="text"
                                                                class="form-control">

                        </div>
                        <div class="form-group">
                            <label>District </label> <input list="districts" type="text"
                                                                 class="form-control" name="districtName" placeholder="District"
                                                                 >
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
                            <input type="submit" class="btn btn-success" value="Submit">
                            <button type="button" class="btn btn-danger">Reset</button>
                        </div>
                    </form>
                </div>
            </div>


        </div>


    </body>
</html>
