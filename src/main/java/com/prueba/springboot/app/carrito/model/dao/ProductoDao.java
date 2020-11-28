package com.prueba.springboot.app.carrito.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.prueba.springboot.app.carrito.model.entity.Producto;

@RepositoryRestResource(path="productos")
public interface ProductoDao extends PagingAndSortingRepository<Producto, Long>{

}
