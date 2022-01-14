package mypackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 String button = request.getParameter("button");

	        if ("button1".equals(button)) {
	         //   myClass.method1();
	        } else if ("button2".equals(button)) {
	           // myClass.method2();
	        }
	        
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/*
	@WebServlet("/myservlet")
	public class Myservlet extends HttpServlet {

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       // MyClass myClass = new MyClass();
	        String button = request.getParameter("button");

	        if ("button1".equals(button)) {
	         //   myClass.method1();
	        } else if ("button2".equals(button)) {
	           // myClass.method2();
	        } else if ("button3".equals(button)) {
	           // myClass.method3();
	        } else {
	            // ???
	        }

	        request.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(request, response);
	    }

	}
	*/
	
	

}
