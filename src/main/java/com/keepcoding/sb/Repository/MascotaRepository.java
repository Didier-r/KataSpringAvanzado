package com.keepcoding.sb.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.sb.entity.Mascota;

@Repository
public interface MascotaRepository extends CrudRepository<Mascota, Long> {
	

}
