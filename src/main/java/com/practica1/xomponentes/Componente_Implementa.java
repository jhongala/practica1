package com.practica1.xomponentes;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implementa implements Componente_Dependencia{



	@Override
	public String leer_teclado() {
		System.out.println("Porfavor ingresa un numbre");
		Scanner leer=new Scanner(System.in);
		return leer.nextLine();
	}

	@Override
	public void salida_mesaje(String mensaje) {
		System.out.println(mensaje);
		
	}

}
