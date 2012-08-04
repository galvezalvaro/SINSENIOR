package com.mycompany.servicio;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.modelo.Persona;

public class PersonaServiceTests {

	//Sujeto de prueba es?
	PersonaService service;
	
	public PersonaServiceTests(){
		//creo una fabrica de objetos
		ApplicationContext  
			fabrica = 
				new ClassPathXmlApplicationContext("/fabrica-test.xml");
		
		service =fabrica.getBean("personaService", PersonaService.class);
		
		
	}
	
	@Test
	public void deberiaValidarPorDni(){
		Persona persona = service.consultarPersona("87551203");
		assertNotNull(persona);
		assertEquals("87551203", persona.getDni());
		
	}
	
	
	
}
