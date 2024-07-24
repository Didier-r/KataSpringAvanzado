package com.keepcoding.sb.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;



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

	@GetMapping("/buscar/{name}")
    public Optional<Mascota> BuscarMascotaPorNombre(@PathVariable String name) {
        return mascotaService.BuscarMascotaPorNombre(name);
    }
	@PostMapping()
	public Mascota SubirMascota(@RequestBody Mascota mascota) {
		return this.mascotaService.SubirMascota(mascota);
	}
	@GetMapping
	public List<Mascota> MostrarTodasMascotas(){
		return mascotaService.MostrarTodasMascotas();
	}
	@GetMapping("/mas-jovenes")
    public List<Mascota> obtenerMascotasMasJovenes() {
        return mascotaService.listar20MascotasMasJovenes();
    }
	@GetMapping("/mascotas")
    public Page<Mascota> obtenerMascotas(
            @RequestParam(defaultValue = "0") int pagina,
            @RequestParam(defaultValue = "5") int tamanio) {
        return mascotaService.obtenerMascotasPorPagina(pagina, tamanio);
    }
}
