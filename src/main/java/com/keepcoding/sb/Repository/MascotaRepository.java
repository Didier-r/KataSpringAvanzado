package com.keepcoding.sb.Repository;


import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.keepcoding.sb.entity.Mascota;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Long> {
	
	Optional<Mascota> findByName(String name);

	List<Mascota> findAll();
	
	@Query(value = "SELECT m FROM Mascota m ORDER BY m.fechaNac DESC")
    List<Mascota> findTop20ByOrderByFechaNacDesc();
}
