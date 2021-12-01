<%-- 
    Document   : RegisterVaccine
    Created on : Dec 1, 2021, 12:41:32 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Vaccine</title>
    </head>
    <body>
       <div style="display: grid; place-items: center; margin:50px;  ;padding: 20px; border-radius: 10px;">
        <div  style="display: flex;align-items: center; justify-content: center; margin:10px;color: #fff; ">
           
        </div>

        <form action="RegisterVaccineServlet" style="width: 40%; background-color: white;border: 1px solid whitesmoke; padding: 10px;box-shadow: 
        rgba(100, 100, 111, 0.2) 0px 7px 29px 0px; border-radius: 10px;">
            
            
        <div style="display: flex;align-items: center; justify-content: center;">
            <h5 style="align-items: center;">Register new vaccine</h5>
        </div>

            <div class="m-3">
                <label for="exampleFormControlInput1" class="form-label">Vaccine Name</label>
                <input type="name" class="form-control" name="name">
            </div>

              <div class="m-3">
                <label for="exampleFormControlInput1" class="form-label">Quantity</label>
                <input type="quantity" class="form-control m-2" name="quantity">
              </div>
            
                  <div class="m-3">

                      <input type="hidden" class="form-control m-2" name="redirect" value="true">
              </div>
            

              <div class="m-3 "  style="margin:20px 0;">
                  <button type="submit" class="btn btn-primary pt-3 m-2 btn-block">Register Vaccine</button>
              </div>
            
                        <a href="SystemAdministratorServlet">Back</a>
    
        </form>

    </div>
    </body>
</html>
