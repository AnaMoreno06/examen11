package co.examen.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.empresa.tess.dao.*;
import co.empresa.tess.modelo.*;
import co.examen.Entities.Paciente;
/**
 * Servlet implementation class usuarioServlet
 */
@WebServlet("/")
public class PacienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private Paciente PacienteDao; 
    /**
     * @see HttpServlet#HttpServlet()
     */
      public PacienteServlet() {
          super();
          // TODO Auto-generated constructor stub
      }

  	/**
  	 * @see Servlet#init(ServletConfig)
  	 */
  	public void init(ServletConfig config) throws ServletException {
  		this.PacienteDao = new PacienteDao();
  	}

  	/**
  	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		// TODO Auto-generated method stub
  		String action = request.getServletPath();
  		try {
  			
  		switch(action) {
  		case "/new":
  			showNewForm(request,response);
  		     break;	
  		case "/insert":
  			insertarusuario(request,response);
  			break;
  		case "/delete":
  			eliminarusuario(request,response);
  			break;
  		case "/edit":
  			showEditForm(request,response);
  			break;
  		case "/update":
  			actualizarusuario(request,response);
  			break;
  	default:
  		listausuario(request,response);
  	break;
  		}
  		}catch(SQLException e) {
  			throw new ServletException(e);
  		}
  		
  	}

	/**
  	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  	 */
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		// TODO Auto-generated method stub
  		doGet(request, response);
  	}

  	
  	private void insertarusuario(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException ,SQLException, IOException {
	String nombre = request.getParameter("nombre");
	String email = request.getParameter("email");
	String documento = request.getParameter("documento");
	String genero = request.getParameter("genero");
	String fechaDeNacimiento  = request.getParameter("fechaDeNacimiento");
	String Direccion  = request.getParameter("Direccion");
	String telefono = request.getParameter("telefono");
	String peso = request.getParameter("peso");
	String estatura = request.getParameter("estatura");
	
	Paciente usuario = new Paciente(nombre, email, documento,genero,fechaDeNacimiento,Direccion,telefono,peso,0, estatura);
	
	PacienteDao.insert(usuario);

	response.sendRedirect("list");
}


private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
	     
		RequestDispatcher dispatcher = request.getRequestDispatcher("usuario.jsp");
		dispatcher.forward(request,response);
		}
private void showEditForm(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
	   int id = Integer.parseInt(request.getParameter("id"));
	   paciente Pacientectial = PacienteDao.select(id);
	   request.setAttribute("usuario", PacienteActial);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Paciente.jsp");
		dispatcher.forward(request,response);
		}
private void actualizarusuario(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException,SQLException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));
String  nombre = request.getParameter("nombre");
String email = request.getParameter("email");
String pais = request.getParameter("pais");

Paciente usuario = new Paciente (id,nombre, email, pais);

PacienteDao.update(usuario);

response.sendRedirect("list");
}
private void eliminarusuario(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException,SQLException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));

PacienteDao.delete(id);

response.sendRedirect("list");
}
private void listausuario(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException,SQLException, IOException {
        List <Paciente> listausuario = PacienteDao.selectAll();
        request.setAttribute("listausuario", listausuario);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("Pacientelist.jsp");
		dispatcher.forward(request,response);
}


}
	
