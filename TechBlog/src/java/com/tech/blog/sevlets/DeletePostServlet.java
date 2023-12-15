package com.tech.blog.sevlets;

import com.tech.blog.dao.PostDao;
import com.tech.blog.helper.ConectionProvider;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeletePostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the post ID to delete from the request parameter or wherever it's stored
        int postId = Integer.parseInt(request.getParameter("postId"));

        PostDao postDao = new PostDao(ConectionProvider.getConnection());
        boolean deletionStatus = postDao.deletePost(postId);

        if (deletionStatus) {
            // Post deleted successfully
            response.getWriter().write("Post deleted successfully!");
        } else {
            // Deletion failed or post not found
            response.getWriter().write("Unable to delete post or post not found!");
        }
    }
    
    // You can also handle doGet() if you want to support deletion via GET requests
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
