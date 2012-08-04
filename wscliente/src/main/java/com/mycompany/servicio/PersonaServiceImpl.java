package com.mycompany.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.mycompany.modelo.Persona;



@WebService(endpointInterface="com.mycompany.servicio.PersonaService")
public class PersonaServiceImpl implements PersonaService {

	
	private List<Persona> personas;
	
	
	public PersonaServiceImpl(){
		personas = obtenerPersonas();
	}
	
	public Persona consultarPersona(String codigoPersona) {
		for (Persona persona : personas) 
		{
			if(persona.getDni().equals(codigoPersona))
			{
				return persona;
			}
		}

        return null;
	}
	
	public List<Persona> obtenerPersonas(){
		List<Persona> personasPrueba = new ArrayList<Persona>();
		
        Persona persona1 = new Persona();
        persona1.setDni("12548794");
        persona1.setNombre("Carolina");
        persona1.setApellidoPaterno("Romero");
        persona1.setApellidoMaterno("Pizarro");
        persona1.setDireccion("Alameda los misioneros 664");
        persona1.setTelefono("5752045");
        persona1.setTipoPersona("N");
		
        Persona persona2 = new Persona();
        persona2.setDni("15715458");
        persona2.setNombre("Andres");
        persona2.setApellidoPaterno("Deza");
        persona2.setApellidoMaterno("Villacorta");
        persona2.setDireccion("Psje. Octavio Bernal 120 dpto F");
        persona2.setTelefono("4602787");
        persona2.setTipoPersona("N");        
        
        Persona persona3 = new Persona();
        persona3.setDni("87551203");
        persona3.setNombre("Pedro");
        persona3.setApellidoPaterno("Torres");
        persona3.setApellidoMaterno("Diez");
        persona3.setDireccion("Av. La Molina 432");
        persona3.setTelefono("4339812");
        persona3.setTipoPersona("N");
        
        
        personasPrueba.add(persona1);
        personasPrueba.add(persona2);
        personasPrueba.add(persona3);
        
		return personasPrueba;
	}

}
