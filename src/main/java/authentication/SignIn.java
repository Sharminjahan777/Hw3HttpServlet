package authentication;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignIn",urlPatterns = "login")
public class SignIn extends HttpServlet {
    public String message;

    public void init() throws ServletException {
        System.out.println("......Servlet initializing.....");
        message = "Welcome to Web World!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>" + message + "<h1");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (userName.equalsIgnoreCase("sharmin") && password.equalsIgnoreCase("abc123")) {
            response.setContentType("text/html");

            PrintWriter printWriter = response.getWriter();
            printWriter.println("<h1>" + "You are authorized user. Welcome to Servlet Demo !");

        } else {
            response.setContentType("text/html");

            PrintWriter printWriter = response.getWriter();
            printWriter.println("<h1>" + "You are not authorized user. So You are not Welcome to Servlet Demo !");

        }



    }

    public void destroy(){

        System.out.println(".....Servlet is destroying now ");
    }
}





