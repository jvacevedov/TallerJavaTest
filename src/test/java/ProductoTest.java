import org.example.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    Producto productoPrueba = new Producto("Prueba", 3300,3);
    @Test
    void verificarPrecios(){
        assertEquals(3300,productoPrueba.getPrecio());
    }
    @Test
    void verificarDisponibilidad(){
        assertEquals(true,productoPrueba.estaDisponible());
    }
    @Test
    void verificarStock(){
        productoPrueba.reducirStock(2);
        assertEquals(1,productoPrueba.getStock());
    }
    @Test
    void verificarReducirStockError(){
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class, ()->{
                productoPrueba.reducirStock(4);});
        assertEquals("Stock insuficiente",exception.getMessage());
    }
    @Test
    void verificarCrearProductoNegativo(){
        IllegalArgumentException exception=assertThrows()
    }


}
