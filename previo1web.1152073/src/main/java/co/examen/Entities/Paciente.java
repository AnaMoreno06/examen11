package co.examen.Entities;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@Entity
@NamedQuery(name = "Usuario.findAll", query = "SELECT s FROM Usuario s")
public class Paciente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String apellido;
	private String documento;
	private String email;
	private String genero;
	private String fechaDeNacimiento;
	private String Direccion;
	private String telefono;
	private double peso;
	private double estatura;
	public Paciente(String nombre, String email, String apellido, String documento, String genero, String fechaDeNacimiento, String Direccion, String altura, double estatura, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.email = email;
		this.genero = genero;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.Direccion = Direccion;
		this.telefono= telefono;
		this.peso = peso;
		this.estatura = estatura;
		
	}
	
	
}