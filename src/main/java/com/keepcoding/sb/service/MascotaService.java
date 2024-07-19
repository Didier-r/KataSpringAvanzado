package com.keepcoding.sb.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.sb.Repository.MascotaRepository;
import com.keepcoding.sb.entity.Mascota;

@Service
public class MascotaService {

	@Autowired
	MascotaRepository mascotaRepository;
	
	public Optional<Mascota> MostrarMascotaId(Long id){
		return mascotaRepository.findById(id);
	}
	
}
