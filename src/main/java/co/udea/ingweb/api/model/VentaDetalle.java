package co.udea.ingweb.api.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "ventas_detalle")

public class VentaDetalle implements Serializable {

    @Id
    @JoinColumn(name = "id_venta")
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Venta venta;

    @Id
    @JoinColumn(name = "id_producto")
    @ManyToOne(optional = false,  fetch = FetchType.EAGER)
    private Producto producto;

    @Column(name = "cantidad")
    private int Cantidad;

    @Column(name = "valor_unitario")
    private double valorUnitario;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
