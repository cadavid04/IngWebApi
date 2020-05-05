package co.udea.ingweb.api.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Ventas")

public class Venta {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha")
    private Date fecha;

    @JoinColumn(name = "id_empleado")
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Empleado empleado;

    @Column(name = "id_cliente")
    private int idCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "valor")
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
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
