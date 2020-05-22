package co.udea.ingweb.api.DTO;

import java.util.Date;

public class ReporteDTO {
    Date fecha;
    Integer venta;
    Double valorTotal;
    String empleado;
    String cliente;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getVenta() {
        return venta;
    }

    public void setVenta(Integer venta) {
        this.venta = venta;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
