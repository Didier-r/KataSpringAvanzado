package com.keepcoding.sb.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Mascota")
public class Mascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)
	private Long id;
	private String name;
	private Date  fechaNac;
	private String raza;
	private float peso;
	private boolean tiene_chip;
	private String url_foto;
	
}
