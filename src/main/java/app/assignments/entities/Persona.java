package app.assignments.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Persona {

	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private long version;
}