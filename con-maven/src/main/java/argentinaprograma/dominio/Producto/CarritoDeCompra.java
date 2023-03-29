package argentinaprograma.dominio.Producto;

import argentinaprograma.dominio.Persona.Persona;

public class CarritoDeCompra {
private Persona comprador;
private ItemDeCarrito item1;
private ItemDeCarrito item2;
private ItemDeCarrito item3;


    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona persona) {
        this.comprador = comprador;
    }

    public ItemDeCarrito getItem1() {
        return item1;
    }

    public void setItem1(ItemDeCarrito item1) {
        this.item1 = item1;
    }

    public ItemDeCarrito getItem2() {
        return item2;
    }

    public void setItem2(ItemDeCarrito item2) {
        this.item2 = item2;
    }

    public ItemDeCarrito getItem3() {
        return item3;
    }

    public void setItem3(ItemDeCarrito item3) {
        this.item3 = item3;
    }

    public double precioFinal(){
        double precio =0.0;

        if (this.item1 != null){
            precio += this.item1.precioDelItem();
        }
        if (this.item2 != null){
            precio += this.item1.precioDelItem();
        }
        if (this.item3 != null){
            precio += this.item1.precioDelItem();
        }
        return precio;

}

}
