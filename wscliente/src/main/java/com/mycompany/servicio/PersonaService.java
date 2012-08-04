package com.mycompany.servicio;

import com.mycompany.modelo.Persona;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface PersonaService {

	
	public Persona consultarPersona(@WebParam(name = "codigoPersona") 
											String dni);
}
