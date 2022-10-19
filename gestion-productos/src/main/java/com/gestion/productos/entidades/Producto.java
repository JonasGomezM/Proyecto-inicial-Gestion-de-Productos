package com.gestion.productos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(nullable = false, length = 60)
	private Long id;
	
	@Column(nullable = false, length = 60)
	private String hecho_en;
	
	@Column(nullable = false, length = 60)
	private String marca;
	
	@Column(nullable = false, length = 60)
	private String nombre;
	
	@Column(nullable = false, length = 60)
	private String precio;

	public Producto() {
	}

	public Producto(Long id, String hecho_en, String marca, String nombre, String precio) {
		this.id = id;
		this.hecho_en = hecho_en;
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHecho_en() {
		return hecho_en;
	}

	public void setHecho_en(String hecho_en) {
		this.hecho_en = hecho_en;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	

	

}
