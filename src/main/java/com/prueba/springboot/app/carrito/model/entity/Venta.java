package com.prueba.springboot.app.carrito.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6127812622408558891L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenta;
	
	private Long idCliente;
	private Date fecha;
	
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Producto> productos;
	
	public Long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}