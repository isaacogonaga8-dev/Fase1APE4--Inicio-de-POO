/**
 *
 * @author Asus
 */
public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    double peso;

    
    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public static void main(String[] args) {
       
        Mascota m1 = new Mascota("Chocolate", "Perro", 4, 22.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.0);
        Mascota m3 = new Mascota("Sbobby", "Perro", 6, 26.0);

        Mascota[] listaMascotas = {m1, m2, m3};

        
        System.out.println("--- Listado de Mascotas ---");
        for (Mascota m : listaMascotas) {
            if (m.peso > 20) {
                System.out.println(m.nombre + " : " + m.especie + " : " + m.peso + " kg - Revisar peso");
            } else {
                System.out.println(m.nombre + " : " + m.especie + " : " + m.peso + " kg");
            }
        }

        
        Mascota m4 = m1;
        m4.edad += 1;

        System.out.println("\nEdad actual de m1: " + m1.edad);
    }
}




![Salida del programa de mascotas](img/mascotas.png)
