import java.util.*;

public class Festival {
	private String nombre;
	private String patrocinador;
	ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
	
	
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public void addActuacion(Actuacion a) {
		// TODO Auto-generated method stub
		this.actuaciones.add(a);
	}
	public void addActuacion(String nombre, int duracion){
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		
		this.actuaciones.add(a);
	}
	
	public void mostrarInfo(){
		System.out.println(getNombre());
		System.out.println("----------------");
		System.out.println("Patrocinado por " + getPatrocinador());
		System.out.println("----------------");
		Iterator<Actuacion> i = actuaciones.iterator();
		
		while(i.hasNext()){
			String infoActuacion = i.next().getInfo();
			System.out.println(infoActuacion);
		}
	}
}
