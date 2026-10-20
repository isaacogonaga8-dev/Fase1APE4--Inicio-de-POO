/**
 *
 * @author Asus
 */
public class Producto {
   
    String nombre;
    double precio;
    int stock;

 
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

   
    public void vender(int cantidad) {
        if (this.stock >= cantidad) {
            this.stock -= cantidad;
        } else {
            this.stock = 0; 
        }
    }

    public static void main(String[] args) {
        
        Producto p1 = new Producto("Camiseta", 15.50, 10);
        Producto p2 = new Producto("Pantalón", 30.00, 6);
        Producto p3 = new Producto("Zapatos", 45.00, 4);
        Producto p4 = new Producto("Gorra", 10.00, 8);

        Producto[] inventario = {p1, p2, p3, p4};

        
        System.out.println("--- Listado Inicial de Productos ---");
        for (Producto p : inventario) {
            System.out.println(p.nombre + " : $" + p.precio);
        }

       
        p1.vender(3);
        p2.vender(3);

        System.out.println("\n--- Estado después de las ventas y control de stock ---");
        double valorTotalInventario = 0;

        
        for (Producto p : inventario) {
            
            if (p.stock < 5) {
                System.out.println(p.nombre + " : $" + p.precio + " (Stock actual: " + p.stock + ") - Reponer");
            } else {
                System.out.println(p.nombre + " : $" + p.precio + " (Stock actual: " + p.stock + ")");
            }

            
            valorTotalInventario += (p.precio * p.stock);
        }

       
        System.out.printf("\nValor total del inventario: $%.2f\n", valorTotalInventario);
    }
}




![Salida del programa de inventario](img/inventario.png)
