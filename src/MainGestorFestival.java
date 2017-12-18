import java.io.*;
import java.util.*;

public class MainGestorFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear una actuacion por programacion
		Actuacion a1 = new Actuacion();
		a1.setNombreGrupo("Red Hot Chilli Peppers");
		a1.setDuracion(120);
		
		//crear una actuacion con inputs del teclado
		Actuacion a2 = new Actuacion();
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce nombre del grupo");
		a2.setNombreGrupo(scan.nextLine());
		System.out.println("Introduce duracion");
		a2.setDuracion(Integer.parseInt(scan.nextLine()));
		
		System.out.println("El grupo es " + a2.getNombreGrupo()+ " la duracion del concierto ha sido " + a2.getDuracion());
		
		//crear una actuacion leyendo desde fichero
		File fichero = new File("D:/Jon Valdes/Entornos de desarrollo/Trabajos eclipse/Grupos.txt");
		Scanner scanF = null;
		
		try{
			scanF = new Scanner(fichero);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String linea = scanF.nextLine();
		String[] partes = linea.split(",");
		
		Actuacion a3 = new Actuacion();
		a3.setNombreGrupo(partes[0]);
		a3.setDuracion(Integer.parseInt(partes[1]));
		
		//Crear un festival por programacion con tres actuaciones
		Festival festival1 = new Festival();
		System.out.println("Introduce un nombre para el festival");
		festival1.setNombre(scan.nextLine());
		System.out.println("Introduce nombre del patrocinador");
		festival1.setPatrocinador(scan.nextLine());
		ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
		actuaciones.add(a1);
		actuaciones.add(a2);
		actuaciones.add(a3);
		
		festival1.setActuaciones(actuaciones);
		
		festival1.addActuacion("Linkin Park", 95);
		
		festival1.mostrarInfo();
		
		festival1.getActuaciones();
		
		festival1.setActuaciones(null);
		
		festival1.mostrarInfo();
		
		festival1.addActuacion("El reno renardo", 100);
		
	}

	
}
