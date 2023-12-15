<%-- 
    Document   : show_blog_page
    Created on : 1 Dec, 2023, 8:29:33 PM
    Author     : 91850
--%>
<%@page import="com.tech.blog.dao.LikeDao"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.tech.blog.dao.UserDao"%>
<%@page import="com.tech.blog.entities.Message"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.Category"%>
<%@page import="com.tech.blog.entities.Posts"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.helper.ConectionProvider"%>
<%@page import="com.tech.blog.entities.User"%>
<%@page errorPage="error.jsp" %>

<%
    User user = (User) session.getAttribute("currentUser");

    if (user == null) {
        response.sendRedirect("Login_Page.jsp");
    }

%>
<%
int postId=Integer.parseInt(request.getParameter("post_id"));
PostDao d = new PostDao(ConectionProvider.getConnection());
 Posts p = d.getPostByPostId(postId);

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=p.getpTitle()%></title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="CSS/myStyle.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 98%, 70% 92%, 31% 88%, 1% 98%, 0 0);
            }
            .post-title{
                font-weight: 100;
                font-size: 30px;
            }
            .post-content{
                font-weight: 100;
                font-size: 25px
            }
            .post-date{
                font-style: italic;
                font-weight: bold;
            }
            .post-user-info{
                font-size:20px;
                font-weight:200;
            }.row-user{
                border: 1px solid red;
                padding: 15px;
            }
            body{
                background-image: url(Img/bakImg.avif);
                background-size: cover;
                background-attachment: fixed;
            }
        </style>
    </head>
    <body>
         <nav class="navbar navbar-expand-lg navbar-dark primary-background ">
            <a class="navbar-brand" href="index.jsp"> <span class="fa fa-asterisk"></span>Tech Blog</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="profile.jsp">  <span class="fa fa-bell"></span> Learn Code <span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="fa fa-check-square"></span>   Categories

                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Programming Language</a>
                            <a class="dropdown-item" href="#">Project implementation</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Data structure</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"> <span class=" fa fa-address-card-o"></span>
                            Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"data-toggle="modal" data-target="#add-post-modal" > <span class=" fa fa-address-card-o"></span>
                            Do Post</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Login_Page.jsp"> <span class=" fa fa-user-circle"></span>
                            Login</a>
                    </li>

                </ul>

                <ul class="navbar-nav mr-right">
                    <li class="nav-item">
                        <a class="nav-link" href="#" data-toggle="modal" data-target="#profile-modal"> <span class=" fa fa-user-circle"></span>
                            <%= user.getName()%>
                        </a>
                    </li>  
                    <li class="nav-item">
                        <a class="nav-link" href="LogoutServlet"> <span class=" fa fa-user-plus"></span>
                            Logout</a>
                    </li> 
                </ul>
            </div>
        </nav>
             <!--main contained of body-->
             
             <div class="container">
                 <div class="row">
                     <div style="margin-left:200px;" class="col-md-8 offset-md-3 mt-2">
                         <div class="card-header primary-background text-white">
                             <h4 style="text-align:center;" class="post-title"><%= p.getpTitle() %></h4>
                         </div>
                     </div>
                         <div class="card-body">
                             <div style="text-align:center;">
                                 <img class="card-img-top my-2 img-fluid img-thumbnail " style="height:400px;width:600px; margin-right: auto" src="blog_pics/<%= p.getpPic()%>" alt="Card image cap">
                             </div>
                           <div class="row my-3 row-user">
                               <div class="col-md-8">
                                   <%UserDao ud =new UserDao(ConectionProvider.getConnection());%>
                                   <p class="post-user-info"><a href="#!"><%=ud.getUserByUserId(p.getuserId()).getName()%></a> has Posted :</p>
                               </div>
                               <div class="col-md-4">
                                   <p class="post-date"><%=DateFormat.getDateTimeInstance().format(p.getpDate())%></p>
                               </div>
                           </div>

                             <p class="post-content"><%= p.getpContent()%></p>
                             <br>
                             <br>
                             <div class="post-code">
                                  <pre><%= p.getpCode()%></pre>
                             </div>
                            

                      

                             
                            
                         </div>
                         <div class="card-footer primary-background">
                              <%
                                LikeDao ld = new LikeDao(ConectionProvider.getConnection());
                            %>
                <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-o-up"></i><span>10</span></a>
                 <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-commenting-o"></i><span>20</span></a>
                 
                 
                         </div>
                 </div>
                 
             </div>
             
             
             <!--end of contained-->

        
         <%
            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        %>
        <div class="alert <%= m.getCasClass()%>" role="alert">
            <%= m.getContent()%>
        </div> 


        <%
                session.removeAttribute("msg");
            }

        %>

        <!-MAIN BODY OF THE PAGE->
        
        <!-- Modal -->
        <div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header primary-background text-white text-center">
                        <h5 class="modal-title" id="exampleModalLabel">Tech Blog</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">
                          <img src="pics/<%= user.getProfile()%>" class="img-fluid" style="border-radius:50%;max-width: 150px;;" >

                            <br>
                            <h5 class="modal-title mt-3" id="exampleModalLabel"><%= user.getName()%></h5>
                            <!--details-->
                            <div id="profile-details">


                                <table class="table">

                                    <tbody>
                                        <tr>
                                            <th scope="row">ID :</th>
                                            <td><%= user.getId()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Email :</th>
                                            <td><%= user.getEmail()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Gender :</th>
                                            <td><%= user.getGender()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Status :</th>
                                            <td><%= user.getAbout()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Register on :</th>
                                            <td><%= user.getDateTime().toString()%></td>

                                        </tr>
                                    </tbody>
                                </table>
                            </div>

                            <!--profile edit-->
                            <div id="profile-edit" style="display: none">
                                <h3 class="mt-2">Please Edit Carefully</h3>
                                <form action="EditServlet" method="post" enctype="multipart/form-data">
                                    <table class="table">
                                        <tr>
                                            <td>ID :</td>
                                            <td><%= user.getId()%></td>
                                        </tr>
                                        <tr>
                                            <td>Email :</td>
                                            <td><input type="email" class="form-control" name="user_email" value="<%= user.getEmail()%>"></input></td>
                                        </tr>
                                        <tr>
                                            <td>Name :</td>
                                            <td><input type="text" class="form-control" name="user_name" value="<%= user.getName()%>"></input></td>

                                        </tr>
                                        <tr>
                                            <td>Password :</td>
                                            <td><input type="password" class="form-control" name="user_password" value="<%= user.getPassword()%>"></input></td>

                                        </tr>
                                        <tr>
                                            <td>Gender :</td>
                                            <td><%= user.getGender().toUpperCase()%></td>

                                        </tr>
                                        <tr>
                                            <td>About :</td>
                                            <td>
                                                <textarea name="user_about" class="form-control" id="" rows="5">
                                                    <%= user.getAbout()%>
                                                </textarea>
                                            </td>

                                        </tr>
                                        <tr>
                                            <td>New Profile Pic  :</td>
                                            <td><input type="file" name="image" class="form-control"></input>
                                            </td>

                                        </tr>


                                    </table>
                                    <div class="container">
                                        <button type="submit" class="btn-primary btn-outline-light">
                                            Save
                                        </button>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button id="edit-profile-botton" type="button" class="btn btn-primary">Edit</button>
                    </div>
                </div>
            </div>
        </div>
        <!--profile end -->
        <!--add post modal-->
        <!-- Button trigger modal -->

        <!-- Modal -->
        <div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Provide the post details..</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <form id="add-post-form" action="AddPostServlet" method="post">
                            
                            <div class="form-group">
                                <select class="form-control" name="cid">
                                    <option selected disabled>---Select Category---</option>

                                    <%
                                        PostDao postd = new PostDao(ConectionProvider.getConnection());
                                        ArrayList<Category> list = postd.getAllCategories();
                                        for (Category c : list) {
                                    %>
                                    <option value="<%= c.getcId()%>"><%= c.getName()%></option>

                                    <%
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="form-group">
                                <input name="pTitle" type="text" placeholder="Enter post Title" class="form-control"/>
                            </div>

                            <div class="form-group">
                                <textarea name="pContent" class="form-control" style="height: 200px;" placeholder="Enter your content"></textarea>
                            </div>
                            <div class="form-group">
                                <textarea name="pCode" class="form-control" style="height: 200px;" placeholder="Enter your program (if any)"></textarea>
                            </div>
                            <div class="form-group">
                                <label>Select your pic..</label>
                                <br>
                                <input type="file" name="pic"  >
                            </div>

                            <div class="container text-center">
                                <button type="submit" class="btn btn-outline-primary">Post </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>





        <!--End of post modal-->

    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
    <script>
                                $(document).ready(function () {
                                let editStatus = false;
                                $('#edit-profile-botton').click(function () {
                                if (editStatus == false) {
                                $('#profile-details').hide()
                                        $('#profile-edit').show()
                                        editStatus = true;
                                $(this).text("Back");
                                } else {
                                $('#profile-details').show()
                                        $('#profile-edit').hide()
                                        editStatus = false;
                                $(this).text("Edit");
                                }
                                })
                                });
    </script>
    <!--Now add post js -->
    <script>
        $(document).ready(function (e) {
        $("#add-post-form").on("submit", function (event) {
        event.preventDefault();
        console.log("you have clicked on submit");
        let form = new FormData(this);
        //now requesting to server
        $.ajax({
            url: "AddPostServlet",
            type: 'POST',
            data: form,
            processData: false,
            contentType: false,
            success: function (data, textStatus, jqXHR) {
                console.log(data);
                if (data.trim() == 'done') {
                    swal("Good Job1!", "saved successfully", "success");
                } else {
                    swal("Error!!", "Something went wrong try again...", "error");
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                swal("Error!!", "Something went wrong try again...", "error");
            },
        })
        })
        })
    </script>
    </body>
</html>
