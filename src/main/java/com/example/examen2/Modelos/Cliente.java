package com.example.examen2.Modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @Column(name="codigocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCliente;

    @Column(name="nombre")
    String nombre;

    @Column(name="apellido")
    String apellido;

    @Column(name="fechaingreso")
    Date fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "idtipocliente")
    private TipoCliente tipoCliente;






    
}




