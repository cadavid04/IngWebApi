package co.udea.ingweb.api.DTO;
import java.util.Date;

public class AjusteDTO {
    private int id;
    private String motivo;
    private String tipo;
    private int cantidad;
    private Date fecha;
    private String productoDTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProductoDTO() {
        return productoDTO;
    }

    public void setProductoDTO(String productoDTO) {
        this.productoDTO = productoDTO;
    }

    public AjusteDTO() {
    }

    public AjusteDTO(int id, String motivo, String tipo, int cantidad, Date fecha, String productoDTO) {
        this.id = id;
        this.motivo = motivo;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.productoDTO = productoDTO;
    }
}


