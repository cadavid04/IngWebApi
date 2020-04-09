package co.udea.ingweb.api.model;

import javax.persistence.*;
import java.util.Date;

public class Producto {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "precio_de_compra")
    private int precioCompra;

    @Column(name = "fecha_de_creacion")
    private Date fechaCreacion;

    @JoinColumn(name = "id_categoria", nullable = false)
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Categoria categoria;

}
