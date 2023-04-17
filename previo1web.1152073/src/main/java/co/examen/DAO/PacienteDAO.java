package co.examen.DAO;

import java.sql.Connection;
import java.util.List;

import co.examen.Entities.Paciente;
import co.examen.Utils.Conexion;

public class PacienteDAO {
	  private Connection connection;

	  public PacienteDAO(Connection connection) {
	    this.connection = connection;
	  }

	  public void crearPaciente(Paciente paciente) {
	    
	  }

	  public Paciente leerPaciente(int id) {
		return null;
	    
	  }

	  public void actualizarPaciente(Paciente paciente) {
	   
	  }

	  public void eliminarPaciente(int id) {
	    
	  }

	  public List<Paciente> listarPacientes() {
		return null;
	
	  }

	public void insert(Paciente paciente) {
	
		
	}

	public Paciente[] list() {
		
		return null;
	}
	}


