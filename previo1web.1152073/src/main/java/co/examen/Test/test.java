package co.examen.Test;

import co.examen.DAO.PacienteDAO;
import co.examen.Entities.Paciente;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PacienteDAO sDao = new PacienteDAO(null);
		
		sDao.insert(new Paciente(0, "prueba previo", "preuba@gmail.com", null, null, null, null, null, null, 0, 0));
		
		for(Paciente s: sDao.list())
			System.out.println(s.toString());
	}

}
