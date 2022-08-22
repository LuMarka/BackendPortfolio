
package com.proyectoIntegrador.portfolioLAM.Security.Repository;

import com.proyectoIntegrador.portfolioLAM.Security.Entity.Rol;
import com.proyectoIntegrador.portfolioLAM.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
     Optional<Rol> findByRolNombre(RolNombre rolNombre);  
}

