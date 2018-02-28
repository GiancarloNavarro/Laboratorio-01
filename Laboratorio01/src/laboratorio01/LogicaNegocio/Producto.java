package laboratorio01.LogicaNegocio;

/**
 *
 * @author casca
 */
public class Producto {

    public Producto(String codigo, String nombreProducto, double precio, int importado, String tipo) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.importado = importado;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getImportado() {
        return importado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setImportado(int importado) {
        this.importado = importado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", importado=" + importado + ", tipo=" + tipo + '}';
    }

    private final String codigo;
    private String nombreProducto;
    private double precio;
    private int importado;
    private String tipo;
}
