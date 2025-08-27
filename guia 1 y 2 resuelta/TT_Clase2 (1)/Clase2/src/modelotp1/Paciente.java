package modelotp1;

public class Paciente {

	private long dni;
	private String nombre;
	private String apellido;
	private float peso;
	private float estatura;

	public Paciente(String nombre, String apellido, long dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Paciente(String nombre, String apellido, long dni, float peso, float estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		setPeso(peso);
		this.estatura = estatura;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	
	public boolean equals(Paciente paciente) {
		return this.dni == paciente.getDni();
	}

	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre +
				", apellido=" + apellido + ", peso=" + peso +
				", estatura=" + estatura + "]";
	}
	
	
}
