package co.udea.ingweb.api.model;

import javax.persistence.*;

public class Perfil {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @JoinColumn(name = "id_empleado", nullable = false)
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Categoria categoria;
}
