package com.keepcoding.sb.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.keepcoding.sb.entity.Mascota;
import com.keepcoding.sb.service.MascotaService;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

	@Autowired
	MascotaService mascotaService;
	
	@GetMapping("/{id}")
	public Optional<Mascota> MostrarMascotaId(@PathVariable Long id){
	    return mascotaService.MostrarMascotaId(id);
	}

	@GetMapping("/{name}")
    public Optional<Mascota> BuscarMascotaPorNombre(@PathVariable String name) {
        return mascotaService.BuscarMascotaPorNombre(name);
    }

}
