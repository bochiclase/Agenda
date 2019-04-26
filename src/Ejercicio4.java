import java.util.*;

public class Ejercicio4 {

		public static void main(String[] args) {
			Scanner r = new Scanner (System.in);
			String cadena = "";
			char c;
			Set<Character> almacen = new HashSet<Character>();
			String [] partes = new String [1];
			Map <String, String> mapa = new HashMap<String,String>();
			
			do {
				System.out.println("Para introducir en la Agenda nombre-telefono");
				System.out.println("Para buscar numeros en la Agenda buscar:nombre");
				System.out.println("Introduce");
				cadena = r.nextLine();
				
			for(int i =0; i<cadena.length(); i++) {
			    c = cadena.charAt(i);
				almacen.add(c);
			}
				if (almacen.contains('-')) {
					partes = cadena.split("-");
					String  nombre = partes[0]; 
					String numero = partes[1]; 
					mapa.put(nombre,numero);
					System.out.println("El numero se guardó en la agenda correctamente");
					nombre = null;
					numero = null;
					almacen.clear();
					
				}
				
				 if (almacen.contains(':')) {
					partes = cadena.split(":");
					String  numero = partes[0]; 
					String nombre = partes[1]; 
					
						if (mapa.containsKey(nombre)) {
							System.out.println(nombre + " -> " + mapa.get(nombre));
							nombre = null;
							numero = null;
							almacen.clear();

							
						}
						else {
							System.out.println("El nombre no esta ni se le espera ;) ");
							nombre = null;
							numero = null;
							almacen.clear();
						}
					
				}
				
				 
			} while (!cadena.equals("fin"));
			System.out.print("Has Salido de la Agenda");
			r.close();
	}
		

}
