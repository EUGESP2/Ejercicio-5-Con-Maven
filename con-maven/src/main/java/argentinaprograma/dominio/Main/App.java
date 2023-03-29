package argentinaprograma.dominio.Main;

import argentinaprograma.dominio.Persona.Persona;
import argentinaprograma.dominio.Producto.CarritoDeCompra;
import argentinaprograma.dominio.Producto.ItemDeCarrito;
import argentinaprograma.dominio.Producto.Producto;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Persona unaPersona = new Persona("Eugenio", "Provenzano");

        Producto cepilloDientes = new Producto("f1620","Cepillo de Dientes","500.0");
        Producto pastaDeDientes = new Producto("F3420","Pasta de Dientes","620.0");

        ItemDeCarrito cepillos = new ItemDeCarrito(cepilloDientes,2);
        ItemDeCarrito pastadental = new ItemDeCarrito(pastaDeDientes,1);

        CarritoDeCompra carritoDeEuge = new CarritoDeCompra();
        carritoDeEuge.setCompradpr(unaPersona);
        carritoDeEuge.setItem1(cepillos);
        carritoDeEuge.setItem2(pastadental);

        System.out.println(carritoDeEuge.precioFinal());


    }
}
