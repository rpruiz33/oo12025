package modelotp1;

public class Medico {

	private String nombre;
	
	public Medico(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public float calcularIMC(Paciente paciente) {
		float imc = paciente.getPeso() / (paciente.getEstatura() * paciente.getEstatura());
		return imc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
