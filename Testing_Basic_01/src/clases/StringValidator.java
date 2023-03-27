package clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringValidator {

	//	Borrar espacios en blanco.	
	public String eliminarEspacios(String cadena) {
		
		String entrada = cadena.trim();
		String salida = "";
		
		List<String> lista = Arrays.asList(entrada.split(" "));
		salida = lista.stream().collect(Collectors.joining()); // podemos evitar colocar "Collectors." importando estaticamente [ import static java.util.stream.Collectors.*; ]
		
		System.out.println(" -> entrada: " + cadena + " -> " + lista.toString() +" -> salida: " + salida); // <---------
		
		return salida;
		
	}
	
	//	Borrar números.
	public String eliminarNumeros(String cadena) {
		
		String salida = cadena;
		List<Character> lista = new ArrayList<>();
		
		for (char c : cadena.toCharArray()) {
			lista.add(c);
		}

		for (int i = 0; i < lista.size(); i++) {
			if(Character.isDigit(lista.get(i))) {
				lista.remove(i);
				i--;
			}
		}
		salida = lista.stream().map(String::valueOf).collect(Collectors.joining()); 
		System.out.println(" -> entrada: " + cadena + " --> " + lista.toString() +" -> salida: " + salida); // <---------
		
		return salida;
	}
	
	//	Convertir a mayúsculas.
	public String convertirAMayusculas(String cadena) {
		String salida = cadena.toUpperCase();
		System.out.println(" -> entrada: " + cadena + " --> " + "salida: " + salida); // <---------
		return salida;
	}
	
	// Eliminar espacios, numeros y convertirlo a MAYUSCULAS
	public String aplicarLosTresMetodos(String cadena) {
		return convertirAMayusculas(eliminarNumeros(eliminarEspacios(cadena)));
	}
	
}
