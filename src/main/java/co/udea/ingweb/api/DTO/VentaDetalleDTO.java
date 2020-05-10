package co.udea.ingweb.api.DTO;

public class VentaDetalleDTO {

    private int idVenta;
    private String Producto;
    private int cantidad;
    private double valorUnitario;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String idProducto) {
        this.Producto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
