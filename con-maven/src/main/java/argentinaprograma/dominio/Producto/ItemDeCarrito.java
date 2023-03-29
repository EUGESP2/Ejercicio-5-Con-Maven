package argentinaprograma.dominio.Producto;

public class ItemDeCarrito {
private Producto producto;
private int cantidad;

    public ItemDeCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public  double precioDelItem(){
        return this.producto.getPrecio() * this.cantidad;
    }
}
