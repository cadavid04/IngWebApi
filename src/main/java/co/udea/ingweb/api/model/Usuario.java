package co.udea.ingweb.api.model;

import javax.persistence.*;


@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "pass")
    private String pass;

    @JoinColumn(name = "id_empleado", nullable = false)
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Empleado empleado;
}
