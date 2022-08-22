
package com.proyectoIntegrador.portfolioLAM.Interface;

import com.proyectoIntegrador.portfolioLAM.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    //eliminar un objeto buscandolo por id
    public void deletePersona (Long id);
    
    //buscar una persona por ID
    public Persona findPersona (Long id);
    
}
