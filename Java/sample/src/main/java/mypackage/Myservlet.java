package mypackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/myservlet")
	public class Myservlet extends HttpServlet {

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
			  String p_co = request.getParameter("p_co"); 
			  String d_co = request.getParameter("d_co");
			//  String d_res = request.getParameter("d_res");
			//  String p_res = request.getParameter("p_res");
			    
			String button = request.getParameter("button");

			if ("button1".equals(button)) 
			{
				String resultadoenc = Codificar(p_co);
				 request.setAttribute("d_res", resultadoenc);
			} else if ("button2".equals(button)) 
			{
				String resultadodec = encode(d_co);
				 request.setAttribute("p_res", resultadodec);
			} 

			request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
		}
		
		public String Codificar(String entradaOriginal) {
			String resultado = "";

			String cadenaCodificada = Base64.getEncoder().encodeToString(entradaOriginal.getBytes());

			System.out.println("codificado: " + cadenaCodificada);

			byte[] bytesDecodificados = Base64.getDecoder().decode(cadenaCodificada);
			String cadenaDecodificada = new String(bytesDecodificados);
			resultado = cadenaCodificada;
			System.out.println("decodificado: " + cadenaDecodificada);
			return resultado;
		}

		public String encode(String s) {
			String respuesta = "error";
			try {
				respuesta = new String(Base64.getEncoder().encode(s.getBytes("UTF8")), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return respuesta;
		}

	

	}


