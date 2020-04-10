package co.udea.ingweb.api.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Ajustes")
public class Ajuste {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "motivo")
    private String motivo;

    @Column(name = "cantidad")
    private int cantidad;

    @JoinColumn(name = "id_producto", nullable = false)
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Producto producto;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "tipo")
    private String tipo;

    public Ajuste(String motivo, int cantidad, Producto producto, Date fecha, String tipo) {
        this.motivo = motivo;
        this.cantidad = cantidad;
        this.producto = producto;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public Ajuste() {
        super();
    }
}
