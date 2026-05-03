import org.example.Carrito;
import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {
    @Test
    public void carritoVacio(){
        //Organizar
        Carrito carritoPrueba1= new Carrito();
        //Actuar
        boolean estaVacio = carritoPrueba1.estaVacio();
        //Verifica
        assertEquals(true,estaVacio);
    }

    @Test
    public void agregarProductoaCarrito(){
        //Organizar
        Carrito carritoPrueba2= new Carrito();
        Producto productoPruebaCarrito1 = new Producto("Arroz",11000,5);
        //Actuar
        carritoPrueba2.agregar(productoPruebaCarrito1);
        int cantidadEnCarrito =carritoPrueba2.cantidadDeProductos();
        //Verificar
        assertEquals(1, cantidadEnCarrito);
    }

    @Test
    public void totalSumadePrecios(){
        //Organizar
        Carrito carritoPrueba3= new Carrito();
        Producto productoPruebaCarrito2 = new Producto("Frijol", 2300,2);
        Producto productoPruebaCarrito3 = new Producto("Lentejas", 1200,1);
        //Actuar
        carritoPrueba3.agregar(productoPruebaCarrito2);
        carritoPrueba3.agregar(productoPruebaCarrito3);
        double totalCarritoPruebas = carritoPrueba3.calcularTotal();
        //Verificar
        assertEquals(3500,totalCarritoPruebas);
    }
    @Test
    public void carritoNoEstaVacio(){
        //Organizar
        Carrito carritoPrueba4=new Carrito();
        Producto productoPruebaCarrito4 = new Producto("Leche", 5000,4);
        //Actuar
        carritoPrueba4.agregar(productoPruebaCarrito4);
        boolean estaVacio=carritoPrueba4.estaVacio();
        //Verificar
        assertEquals(false,estaVacio);
    }

    @Test
    public void totalCarritoVacioEs0(){
        //Organizar
        Carrito carritoPrueba5=new Carrito();
        //Actuar
        double totalCarrito = carritoPrueba5.calcularTotal();
        //Verificar
        assertEquals(0,totalCarrito);
    }

    //Prueba Libre
    // El tamaño del carrito es 0 cuando no tiene objetos
    @Test
    public void tamano0CuandoNoTiene(){
        //Organizar
        Carrito carritoPrueba6= new Carrito();
        //Actuar
        int cantidadEnCarrito =carritoPrueba6.cantidadDeProductos();
        //Verificar
        assertEquals(0, cantidadEnCarrito);
    }

}
