  
 <%-- --   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
   <img src="<%=request.getContextPath()%>/images/logo.png" />
     
 
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"> 
                
<%-- <spring:url value="/resources/js/validation.js" var="MyJS1" />
<script src="${MyJS1}"></script>
 --%><%-- 
  <script src="<c:url value="/resources/js/validation.js" />"></script>


                <body>
                <h1>Spring MVC CSS Demo</h1>
             
             
             <a href="" onclick="call();">GO</a>
                </body>  --%>
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
  <head>
    <base href="./">
    <meta charset="utf-8">
    <title>Admin</title>
    <!-- Icons-->
    <!-- Main styles for this application-->
    <link href="<c:url value="/resources/css/style.css" />"  rel="stylesheet">
    <link href="<c:url value="/resources/vendors/pace-progress/css/pace.min.css" />" rel="stylesheet">
    
  </head>
  <body class="app flex-row align-items-center">
  ${msg}
  
  <form action="check" method="post">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-8">
          <div class="card-group">
            <div class="card p-4">
              <div class="card-body">
                <h1>Login</h1>
                <p class="text-muted">Sign In to your account</p>
                
                <div class="input-group mb-3">
                  <div class="input-group-prepend">
                    <span class="input-group-text">
                      <i class="icon-user"></i>
                    </span>
                  </div>
                  <input class="form-control" type="text" name="name" placeholder="Username">
                </div>
                <div class="input-group mb-4">
                  <div class="input-group-prepend">
                    <span class="input-group-text">
                      <i class="icon-lock"></i>
                    </span>
                  </div>
                  <input class="form-control" type="password" name="password" placeholder="Password">
                </div>
                <div class="row">
                  <div class="col-6">
                    <button class="btn btn-primary px-4" type="submit">Login</button>
                  </div>
                  <div class="col-6 text-right">
                    <button class="btn btn-link px-0" type="button">Forgot password?</button>
                  </div>
                </div>
              </div>
            </div>
            
          </div>
        </div>
      </div>
    </div>
    </form>
    <!-- CoreUI and necessary plugins-->
    </body>
</html>
                
                
                   