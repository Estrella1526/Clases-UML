import java.util.*;

/**
 * 
 */
public class Tienda {

    /**
     * Default constructor
     */
    public Tienda() {
    }

    /**
     * 
     */
    public string Nombre;

    /**
     * 
     */
    public string Direccion;

    /**
     * 
     */
    public string telefono;

    /**
     * @param nombre 
     * @param direccion 
     * @param telefono
     */
    public void Tienda(string nombre, string direccion, string telefono) {
        // TODO implement here
    }

    /**
     * @return
     */
    public string obtenerNombre() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public string obtenerDireccion() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public string obtenerTelefono() {
        // TODO implement here
        return null;
    }

    /**
     * @param nombre 
     * @return
     */
    public void establecerNombre(string nombre) {
        // TODO implement here
        return null;
    }

    /**
     * @param direccion 
     * @return
     */
    public void establecerDireccion(string direccion) {
        // TODO implement here
        return null;
    }

    /**
     * @param direccion 
     * @return
     */
    public void establecerDireccion(string direccion) {
        // TODO implement here
        return null;
    }

}

/**
 * 
 */
public class Productos extends Tienda {

    /**
     * Default constructor
     */
    public Productos() {
    }

    /**
     * 
     */
    public int Codigos;

    /**
     * 
     */
    private string nombre;

    /**
     * 
     */
    private TipoProducto tipo;

    /**
     * 
     */
    private Fecha fecha_expiracion;

    /**
     * 
     */
    private string fabricante;

    /**
     * 
     */
    public int cantidad_inventario;

    /**
     * 
     */
    public float precio_unitario;

    /**
     * @return
     */
    public int obtenerCodigo() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public string obtenerNombre() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public TipoProducto obtenerTipo() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Fecha obtenerFechaExpiracion() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public string obtenerFabricante() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int obtenerCantidadInventario() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public float obtenerPrecioUnitario() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @param codigo 
     * @return
     */
    public void establecerCodigo(int codigo) {
        // TODO implement here
        return null;
    }

    /**
     * @param nombre 
     * @return
     */
    public void establecerNombre(string nombre) {
        // TODO implement here
        return null;
    }

    /**
     * @param tipo 
     * @return
     */
    public void establecerTipo(TipoProducto tipo) {
        // TODO implement here
        return null;
    }

    /**
     * @param fecha_expiracion 
     * @return
     */
    public void establecerFechaExpiracion(Fecha fecha_expiracion) {
        // TODO implement here
        return null;
    }

    /**
     * @param fabricante 
     * @return
     */
    public void establecerFabricante(string fabricante) {
        // TODO implement here
        return null;
    }

    /**
     * @param cantidad_inventario 
     * @return
     */
    public void establecerCantidadInventario(int cantidad_inventario) {
        // TODO implement here
        return null;
    }

    /**
     * @param precio_unitario 
     * @return
     */
    public void establecerPrecioUnitario(float precio_unitario) {
        // TODO implement here
        return null;
    }

}
/**
 * 
 */
public class Tipo productos extends Productos {

    /**
     * Default constructor
     */
    public Tipo productos() {
    }

    /**
     * 
     */
    public void CARNES;

    /**
     * 
     */
    public void FRUTA;

    /**
     * 
     */
    public void ENLATADO;

    /**
     * 
     */
    public void LACTEOS;

    /**
     * @return
     */
    public int obtenercarnes() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int cuantasfrutas() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int cuantosenlatados() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public int cuantoslacteos() {
        // TODO implement here
        return 0;
    }

}