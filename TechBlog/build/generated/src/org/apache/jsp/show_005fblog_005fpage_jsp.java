package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.dao.LikeDao;
import java.text.DateFormat;
import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import java.util.ArrayList;
import com.tech.blog.entities.Category;
import com.tech.blog.entities.Posts;
import com.tech.blog.dao.PostDao;
import com.tech.blog.helper.ConectionProvider;
import com.tech.blog.entities.User;

public final class show_005fblog_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    User user = (User) session.getAttribute("currentUser");

    if (user == null) {
        response.sendRedirect("Login_Page.jsp");
    }


      out.write('\n');

int postId=Integer.parseInt(request.getParameter("post_id"));
PostDao d = new PostDao(ConectionProvider.getConnection());
 Posts p = d.getPostByPostId(postId);


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print(p.getpTitle());
      out.write("</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"CSS/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 98%, 70% 92%, 31% 88%, 1% 98%, 0 0);\n");
      out.write("            }\n");
      out.write("            .post-title{\n");
      out.write("                font-weight: 100;\n");
      out.write("                font-size: 30px;\n");
      out.write("            }\n");
      out.write("            .post-content{\n");
      out.write("                font-weight: 100;\n");
      out.write("                font-size: 25px\n");
      out.write("            }\n");
      out.write("            .post-date{\n");
      out.write("                font-style: italic;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .post-user-info{\n");
      out.write("                font-size:20px;\n");
      out.write("                font-weight:200;\n");
      out.write("            }.row-user{\n");
      out.write("                border: 1px solid red;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(IMG/bgImg.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-dark primary-background \">\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"> <span class=\"fa fa-asterisk\"></span>Tech Blog</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"profile.jsp\">  <span class=\"fa fa-bell\"></span> Learn Code <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <span class=\"fa fa-check-square\"></span>   Categories\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Project implementation</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Data structure</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"> <span class=\" fa fa-address-card-o\"></span>\n");
      out.write("                            Contact Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\"data-toggle=\"modal\" data-target=\"#add-post-modal\" > <span class=\" fa fa-address-card-o\"></span>\n");
      out.write("                            Do Post</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"Login_Page.jsp\"> <span class=\" fa fa-user-circle\"></span>\n");
      out.write("                            Login</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"navbar-nav mr-right\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" data-toggle=\"modal\" data-target=\"#profile-modal\"> <span class=\" fa fa-user-circle\"></span>\n");
      out.write("                            ");
      out.print( user.getName());
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </li>  \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"LogoutServlet\"> <span class=\" fa fa-user-plus\"></span>\n");
      out.write("                            Logout</a>\n");
      out.write("                    </li> \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("             <!--main contained of body-->\n");
      out.write("             \n");
      out.write("             <div class=\"container\">\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                     <div class=\"col-md-8 offset-md-2\">\n");
      out.write("                         <div class=\"card-header primary-background text-white\">\n");
      out.write("                             <h4 class=\"post-title\">");
      out.print( p.getpTitle() );
      out.write("</h4>\n");
      out.write("                         </div>\n");
      out.write("                     </div>\n");
      out.write("                         <div class=\"card-body\">\n");
      out.write("                           <img class=\"card-img-top my-2\" src=\"blog_pics/");
      out.print( p.getpPic());
      out.write("\" alt=\"Card image cap\">\n");
      out.write("                           \n");
      out.write("                           <div class=\"row my-3 row-user\">\n");
      out.write("                               <div class=\"col-md-8\">\n");
      out.write("                                   ");
UserDao ud =new UserDao(ConectionProvider.getConnection());
      out.write("\n");
      out.write("                                   <p class=\"post-user-info\"><a href=\"#!\"> ");
      out.print( ud.getUserByUserId(p.getuserId()).getName());
      out.write("</a> has Posted :</p>\n");
      out.write("                               </div>\n");
      out.write("                               <div class=\"col-md-4\">\n");
      out.write("                                   <p class=\"post-date\">");
      out.print(DateFormat.getDateTimeInstance().format(p.getpDate()));
      out.write("</p>\n");
      out.write("                               </div>\n");
      out.write("                           </div>\n");
      out.write("\n");
      out.write("                             <p class=\"post-content\">");
      out.print( p.getpContent());
      out.write("</p>\n");
      out.write("                             <br>\n");
      out.write("                             <br>\n");
      out.write("                             <div class=\"post-code\">\n");
      out.write("                                  <pre>");
      out.print( p.getpCode());
      out.write("</pre>\n");
      out.write("                             </div>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                      \n");
      out.write("\n");
      out.write("                             \n");
      out.write("                            \n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"card-footer primary-background\">\n");
      out.write("                              ");

                                LikeDao ld = new LikeDao(ConectionProvider.getConnection());
                            
      out.write("\n");
      out.write("                <a href=\"#!\" class=\"btn btn-outline-light btn-sm\"><i class=\"fa fa-thumbs-o-up\"></i><span>10</span></a>\n");
      out.write("                 <a href=\"#!\" class=\"btn btn-outline-light btn-sm\"><i class=\"fa fa-commenting-o\"></i><span>20</span></a>\n");
      out.write("                         </div>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             <!--end of contained-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("         ");

            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        
      out.write("\n");
      out.write("        <div class=\"alert ");
      out.print( m.getCasClass());
      out.write("\" role=\"alert\">\n");
      out.write("            ");
      out.print( m.getContent());
      out.write("\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

                session.removeAttribute("msg");
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <!-MAIN BODY OF THE PAGE->\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row mt-4\">\n");
      out.write("                    <!--first col-->\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <!--categories-->\n");
      out.write("                        <div class=\"list-group\">\n");
      out.write("                            <a href=\"#\" onclick=\"getPosts(0, this)\"  class=\" c-link list-group-item list-group-item-action active\">\n");
      out.write("                                All Posts\n");
      out.write("                            </a>\n");
      out.write("                            <!--categories-->\n");
      out.write("\n");
      out.write("                            ");
                                
                                PostDao post = new PostDao(ConectionProvider.getConnection());
                                ArrayList<Category> list1 = d.getAllCategories();
                                for (Category cc : list1) {

                            
      out.write("\n");
      out.write("                            <a href=\"#\" onclick=\"getPosts(");
      out.print( cc.getcId());
      out.write(", this)\" class=\" c-link list-group-item list-group-item-action\">");
      out.print( cc.getName());
      out.write("</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");
                                        }

                            
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--second col-->\n");
      out.write("                    <div class=\"col-md-8\" >\n");
      out.write("                        <!--posts-->\n");
      out.write("                        <div class=\"container text-center\" id=\"loader\">\n");
      out.write("                            <i class=\"fa fa-refresh fa-4x fa-spin\"></i>\n");
      out.write("                            <h3 class=\"mt-2\">Loading...</h3>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"container-fluid\" id=\"post-container\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header primary-background text-white text-center\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Tech Blog</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"container text-center\">\n");
      out.write("                          <img src=\"pics/");
      out.print( user.getProfile());
      out.write("\" class=\"img-fluid\" style=\"border-radius:50%;max-width: 150px;;\" >\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <h5 class=\"modal-title mt-3\" id=\"exampleModalLabel\">");
      out.print( user.getName());
      out.write("</h5>\n");
      out.write("                            <!--details-->\n");
      out.write("                            <div id=\"profile-details\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <table class=\"table\">\n");
      out.write("\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">ID :</th>\n");
      out.write("                                            <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Email :</th>\n");
      out.write("                                            <td>");
      out.print( user.getEmail());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Gender :</th>\n");
      out.write("                                            <td>");
      out.print( user.getGender());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Status :</th>\n");
      out.write("                                            <td>");
      out.print( user.getAbout());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">Register on :</th>\n");
      out.write("                                            <td>");
      out.print( user.getDateTime().toString());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--profile edit-->\n");
      out.write("                            <div id=\"profile-edit\" style=\"display: none\">\n");
      out.write("                                <h3 class=\"mt-2\">Please Edit Carefully</h3>\n");
      out.write("                                <form action=\"EditServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>ID :</td>\n");
      out.write("                                            <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Email :</td>\n");
      out.write("                                            <td><input type=\"email\" class=\"form-control\" name=\"user_email\" value=\"");
      out.print( user.getEmail());
      out.write("\"></input></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Name :</td>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"user_name\" value=\"");
      out.print( user.getName());
      out.write("\"></input></td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Password :</td>\n");
      out.write("                                            <td><input type=\"password\" class=\"form-control\" name=\"user_password\" value=\"");
      out.print( user.getPassword());
      out.write("\"></input></td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Gender :</td>\n");
      out.write("                                            <td>");
      out.print( user.getGender().toUpperCase());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>About :</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <textarea name=\"user_about\" class=\"form-control\" id=\"\" rows=\"5\">\n");
      out.write("                                                    ");
      out.print( user.getAbout());
      out.write("\n");
      out.write("                                                </textarea>\n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>New Profile Pic  :</td>\n");
      out.write("                                            <td><input type=\"file\" name=\"image\" class=\"form-control\"></input>\n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn-primary btn-outline-light\">\n");
      out.write("                                            Save\n");
      out.write("                                        </button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button id=\"edit-profile-botton\" type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--profile end -->\n");
      out.write("        <!--add post modal-->\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"add-post-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Provide the post details..</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <form id=\"add-post-form\" action=\"AddPostServlet\" method=\"post\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <select class=\"form-control\" name=\"cid\">\n");
      out.write("                                    <option selected disabled>---Select Category---</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        PostDao postd = new PostDao(ConectionProvider.getConnection());
                                        ArrayList<Category> list = postd.getAllCategories();
                                        for (Category c : list) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print( c.getcId());
      out.write('"');
      out.write('>');
      out.print( c.getName());
      out.write("</option>\n");
      out.write("\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input name=\"pTitle\" type=\"text\" placeholder=\"Enter post Title\" class=\"form-control\"/>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea name=\"pContent\" class=\"form-control\" style=\"height: 200px;\" placeholder=\"Enter your content\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <textarea name=\"pCode\" class=\"form-control\" style=\"height: 200px;\" placeholder=\"Enter your program (if any)\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Select your pic..</label>\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"file\" name=\"pic\"  >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"container text-center\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-outline-primary\">Post </button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--End of post modal-->\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("                                $(document).ready(function () {\n");
      out.write("                                let editStatus = false;\n");
      out.write("                                $('#edit-profile-botton').click(function () {\n");
      out.write("                                if (editStatus == false) {\n");
      out.write("                                $('#profile-details').hide()\n");
      out.write("                                        $('#profile-edit').show()\n");
      out.write("                                        editStatus = true;\n");
      out.write("                                $(this).text(\"Back\");\n");
      out.write("                                } else {\n");
      out.write("                                $('#profile-details').show()\n");
      out.write("                                        $('#profile-edit').hide()\n");
      out.write("                                        editStatus = false;\n");
      out.write("                                $(this).text(\"Edit\");\n");
      out.write("                                }\n");
      out.write("                                })\n");
      out.write("                                });\n");
      out.write("    </script>\n");
      out.write("    <!--Now add post js -->\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function (e) {\n");
      out.write("        $(\"#add-post-form\").on(\"submit\", function (event) {\n");
      out.write("        event.preventDefault();\n");
      out.write("        console.log(\"you have clicked on submit\");\n");
      out.write("        let form = new FormData(this);\n");
      out.write("        //now requesting to server\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"AddPostServlet\",\n");
      out.write("            type: 'POST',\n");
      out.write("            data: form,\n");
      out.write("            processData: false,\n");
      out.write("            contentType: false,\n");
      out.write("            success: function (data, textStatus, jqXHR) {\n");
      out.write("                console.log(data);\n");
      out.write("                if (data.trim() == 'done') {\n");
      out.write("                    swal(\"Good Job1!\", \"saved successfully\", \"success\");\n");
      out.write("                } else {\n");
      out.write("                    swal(\"Error!!\", \"Something went wrong try again...\", \"error\");\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                swal(\"Error!!\", \"Something went wrong try again...\", \"error\");\n");
      out.write("            },\n");
      out.write("        })\n");
      out.write("        })\n");
      out.write("        })\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
