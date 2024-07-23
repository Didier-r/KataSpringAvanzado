package com.keepcoding.sb.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.sb.entity.Mascota;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Long> {
	
	Optional<Mascota> findByName(String name);

	List<Mascota> findAll();
}
