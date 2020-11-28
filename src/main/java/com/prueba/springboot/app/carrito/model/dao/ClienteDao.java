package com.prueba.springboot.app.carrito.model.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.prueba.springboot.app.carrito.model.entity.Cliente;

@RepositoryRestResource(path="clientes")
public interface ClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	public Cliente findByDni(String dni);
}
