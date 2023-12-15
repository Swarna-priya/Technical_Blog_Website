<%-- 
    Document   : index.jsp
    Created on : 24 Nov, 2023, 5:58:37 PM
    Author     : 91850
--%>

<%@page import="com.tech.blog.helper.ConectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" crossorigin="anonymous">
        <link href="CSS/myStyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 98%, 70% 92%, 31% 88%, 1% 98%, 0 0);
            }
        </style>
    </head>
    <body>

        <%@include file ="NavBar.jsp" %>
        <!--//banner-->
        <div class="cotainer-flud p-0 m-0">
            <div class="jumbotron primary-background text-white">
                <div class="container" >
                    <h3 class="display-3">Welcome to tech-Blog</h3>
                    <h3 > Tech Blog </h3>
                    <p>Welcome to technical blog,world of technology.
                        A programming language is usually described in terms of its syntax (form) and semantics (meaning). These are usually defined by a formal language
                    </p>
                    <p>A language usually has at least one implementation in the form of a compiler or interpreter, allowing programs written in the language to be executed.</p>
                    <button class="btn btn-outline-light btn-lg"><span class="fa fa-external-link fa-user-plus"></span> start ! its Page</button>
                    <a href="Login_Page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle fa-spin"></span>Login</a>

                </div> 
            </div>

        </div>
        <!--//Cards-->
        <div class="container">
            <div class="row mb-2">
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java programming language</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn primary-background text-white">Read More</a>
                        </div>
                    </div>   
                    
                </div>  
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java programming language</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn primary-background text-white">Read More</a>
                        </div>
                    </div>   
                    
                </div> 
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java programming language</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn primary-background text-white">Read More</a>
                        </div>
                    </div>   
                    
                </div>  
            </div>
      <!--2nd Row-->
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java programming language</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn primary-background text-white">Read More</a>
                        </div>
                    </div>   
                    
                </div>  
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java programming language</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn primary-background text-white">Read More</a>
                        </div>
                    </div>   
                    
                </div> 
                <div class="col-md-4">
                    <div class="card" >

                        <div class="card-body">
                            <h5 class="card-title">Java programming language</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn primary-background text-white">Read More</a>
                        </div>
                    </div>   
                    
                </div>  
            </div>

        </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>



    </body>
</html>
