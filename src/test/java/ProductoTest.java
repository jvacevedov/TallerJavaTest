import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {


    @Test
    void verificarPrecios(){
        //Organizar
        Producto productoPrueba = new Producto("Prueba", 3300,3);
        //Actuar
        Double precio=productoPrueba.getPrecio();
        // Verificar
        assertEquals(3300,precio);
    }
    @Test
    void verificarDisponibilidad(){
        //Organizar
        Producto productoPrueba2 = new Producto("Prueba2", 1500,0);
        //Actuar
        boolean esDisponible = productoPrueba2.estaDisponible();
        //Verificar
        assertEquals(false,esDisponible);
    }
    @Test
    void verificarStock(){
        //Organizar
        Producto productoPrueba3 = new Producto("Prueba3", 2800,3);
        //Actuar
        productoPrueba3.reducirStock(2);
        // Verificar
        assertEquals(1,productoPrueba3.getStock());
    }
    @Test
    void verificarReducirStockError(){
        //Organizar
        Producto productoPrueba4 = new Producto("Prueba4", 5300,2);
        //Actuar
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class, ()->{
                productoPrueba4.reducirStock(4);});
        //Verificar
        assertEquals("Stock insuficiente",exception.getMessage());
    }

    //Prueba libre
    // Manda error crear producto co stock negativo
    @Test
    void verificarCrearProductoNegativo(){
        //Actuar
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class, ()->{
            Producto productoPrueba5 = new Producto("Prueba5", 3300,-5);
        });
        //Verificar
        assertEquals("El stock no puede ser negativo",exception.getMessage());
    }
    @Test
    void verificarCrearProductoPrecioNegativo(){
        //Actuar
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class, ()->{
            Producto productoPrueba6 = new Producto("Prueba", -23450,3);
        });
        //Verificar
        assertEquals("El precio no puede ser negativo",exception.getMessage());
    }


}
