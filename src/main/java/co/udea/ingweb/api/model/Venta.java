package co.udea.ingweb.api.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Ventas")

public class Venta {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha")
    private Date fecha;

    @JoinColumn(name = "id_empleado")
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Empleado empleado;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "valor")
    private double valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
