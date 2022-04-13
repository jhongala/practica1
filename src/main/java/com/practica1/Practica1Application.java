package com.practica1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practica1.xomponentes.Componente_Dependencia;

@SpringBootApplication
public class Practica1Application implements CommandLineRunner{

	Componente_Dependencia componente_Dependencia;
	
	public Practica1Application(Componente_Dependencia componente_Dependencia) {
		this.componente_Dependencia=componente_Dependencia;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Practica1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		String nombre=this.componente_Dependencia.leer_teclado();
		this.componente_Dependencia.salida_mesaje(nombre);
	}

}
