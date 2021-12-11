package clases.empleado;


import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla {
	
	
	private String especialidad;
	private int numeroDeConsultorio;
	
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		especialidad=JOptionPane.showInputDialog("Ingrese su especialidad");
		do {
			setConfirmacion(true);
			
		
		try {
			numeroDeConsultorio=Integer.parseInt(JOptionPane.showInputDialog("Num consultorio"));
			
		} catch (Exception e) {
		
			JOptionPane.showMessageDialog(null, "Se acepta solo datos numericos");
			setConfirmacion(false);
		}
		}while(isConfirmacion()!=true);
		
	}
	
	
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getNumeroDeConsultorio() {
		return numeroDeConsultorio;
	}
	public void setNumeroDeConsultorio(int numeroDeConsultorio) {
		this.numeroDeConsultorio = numeroDeConsultorio;
	}
	
	
	
	

}
