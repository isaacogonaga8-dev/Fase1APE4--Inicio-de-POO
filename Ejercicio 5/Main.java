/**
 *
 * @author Asus
 */
class Libro {
    String titulo;
    String autor;
    boolean disponible;

    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
}


class Socio {
    String nombre;
    int librosPrestados;

    public Socio(String nombre, int librosPrestados) {
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        
        Libro l1 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", true);
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", true);
        Libro l3 = new Libro("El principito", "Antoine de Saint-Exupery", true);
        Libro l4 = new Libro("1984", "George Orwell", true);

      
        Socio s1 = new Socio("Maria Perez", 0);
        Socio s2 = new Socio("Juan Gomez", 0);

      
        l1.disponible = false;
        s1.librosPrestados += 2;

        l2.disponible = false;
        

        
        l3.disponible = false;
        s2.librosPrestados += 1;

        
        Libro[] listaLibros = {l1, l2, l3, l4};
        Socio[] listaSocios = {s1, s2};

        
        System.out.println("--- Estado de los Libros ---");
        int librosDisponiblesCount = 0;
        for (Libro libro : listaLibros) {
            String estadoLibro = libro.disponible ? "Disponible" : "Prestado";
            System.out.println(libro.titulo + " : " + estadoLibro);
            if (libro.disponible) {
                librosDisponiblesCount++;
            }
        }

       
        System.out.println("\n--- Estado de los Socios ---");
        for (Socio socio : listaSocios) {
            System.out.println(socio.nombre + " : " + socio.librosPrestados);
        }

        
        System.out.println("\nLibros que quedan disponibles: " + librosDisponiblesCount);
    }
}



![Salida del programa de biblioteca](img/biblioteca.png)
