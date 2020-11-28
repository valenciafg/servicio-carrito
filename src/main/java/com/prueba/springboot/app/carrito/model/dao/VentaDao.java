package com.prueba.springboot.app.carrito.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.prueba.springboot.app.carrito.model.entity.Venta;

@RepositoryRestResource(path="ventas")
public interface VentaDao extends PagingAndSortingRepository<Venta, Long>{

}
