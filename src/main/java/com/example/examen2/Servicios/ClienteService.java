package com.example.examen2.Servicios;

import java.util.List;

import com.example.examen2.Modelos.Cliente;

public interface ClienteService {

    public List<Cliente> ObtenerTodosClientes(); 

    
    

    public Cliente guardarCliente(Cliente cliente);

    public Cliente ObtenerCliente(int id);


    
        
    }
