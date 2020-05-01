package co.udea.ingweb.api.model;

import javax.persistence.*;

@Entity
@Table(name = "Perfiles")
public class Perfil {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

}
