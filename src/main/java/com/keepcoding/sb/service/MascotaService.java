package com.keepcoding.sb.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.keepcoding.sb.Repository.MascotaRepository;
import com.keepcoding.sb.entity.Mascota;

import jakarta.persistence.EntityNotFoundException;

@Service
public class MascotaService {

	@Autowired
	MascotaRepository mascotaRepository;
	
	
	public Optional<Mascota> MostrarMascotaId(Long id){
		return mascotaRepository.findById(id);
	}
	public Optional<Mascota> BuscarMascotaPorNombre(String name) {
        return mascotaRepository.findByName(name);
    }
	public Mascota SubirMascota(Mascota mascota) {
		return mascotaRepository.save(mascota);
	}
	public List<Mascota> MostrarTodasMascotas(){
		return mascotaRepository.findAll();
	}
	public List<Mascota> listar20MascotasMasJovenes() {
        return mascotaRepository.findTop20ByOrderByFechaNacDesc();
    }
	public Page<Mascota> obtenerMascotasPorPagina(int numeroPagina, int tamanioPagina) {
        Pageable pageable = PageRequest.of(numeroPagina, tamanioPagina);
        return mascotaRepository.findAll(pageable);
    }

	public void eliminarMascota(Long id) {
        if (mascotaRepository.existsById(id)) {
            mascotaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Mascota no encontrada con el ID: " + id);
        }
    }
}
