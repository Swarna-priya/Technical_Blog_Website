<%@page import="com.tech.blog.entities.User"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Posts"%>
<%@page import="com.tech.blog.helper.ConectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>


<div class="row">

    <%
        
//        User uuu=(User)session.getAttribute("currentUser");
//        
       Thread.sleep(1000);
        PostDao d = new PostDao(ConectionProvider.getConnection());
        
       int cid = Integer.parseInt(request.getParameter("cid"));
        List<Posts> posts = null;
       if (cid == 0) {
           posts = d.getAllPosts();
       } else {
          posts = d.getPostByCatId(cid);
       }
       
       if (posts.size() == 0) {
           out.println("<h3 class='display-3 text-center'>No Posts in this category..</h3>");
           return;
        }
        
        for (Posts p : posts) {
    %>
    <div class="col-md-6 mt-2">
        <div class="card">
            <img class="card-img-top" src="blog_pics/<%= p.getpPic()%>" alt="Card image cap">
            <div class="card-body">
                <b><%= p.getpTitle()%></b>
                <p><%= p.getpContent()%></p>
            <!--<p><%=p.getpCode()%> </p>-->
            </div>
            <div class="card-footer primary-background text-center">
                <a href="show_blog_page.jsp?post_id=<%=p.getpId()%>" class="btn btn-outline-light btn-sm">Read More...</a>
                <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-o-up"></i><span>10</span></a>
                <a href="#!" class="btn btn-outline-light btn-sm"><i class="fa fa-commenting-o"></i><span>20</span></a>
                <span onclick="deletePost('<%=p.getpId()%>');" data-postId="<%=p.getpId()%>" class="btn btn-outline-light btn-sm"><i class="fa fa-trash-o"></i></span>
            </div>
        </div>
    </div>
    <%}%>
</div>
            


