package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public Cliente finOne(Long id);
	public void delete(Long id);

}
