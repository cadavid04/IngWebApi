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

    @JoinColumn(name = "id_perfil", nullable = false)
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Perfil perfil;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
