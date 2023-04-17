package co.examen.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.examen.DAO.PacienteDAO;
import co.examen.Entities.Paciente;

public class PacienteController {
	  private PacienteDAO pacienteDAO;

	  public PacienteController(PacienteDAO pacienteDAO) {
	    this.pacienteDAO = pacienteDAO;
	  }

	  public void registrarPaciente(HttpServletRequest request, HttpServletResponse response) {
	    Paciente paciente;
		
	    pacienteDAO.crearPaciente(paciente);
	    
	  }

	  public void actualizarPaciente(HttpServletRequest request, HttpServletResponse response) {
	    Paciente paciente;
	    pacienteDAO.actualizarPaciente(paciente);
	  }

	  public void eliminarPaciente(HttpServletRequest request, HttpServletResponse response) {
	    int id;
		pacienteDAO.eliminarPaciente(id);
	    
	  }

	  public void mostrarListaPacientes(HttpServletRequest request, HttpServletResponse response) {
	  
}