/**
 *
 * @author Asus
 */
public class Estudiante {
    
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcularPromedio();
    }

   
    public void calcularPromedio() {
        this.promedio = (this.nota1 + this.nota2 + this.nota3) / 3.0;
    }

    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante("Ana Perez", 8.5, 9.0, 7.8);
        Estudiante est2 = new Estudiante("Carlos Gomez", 6.0, 5.5, 6.2);
        Estudiante est3 = new Estudiante("Maria Lopez", 4.0, 4.5, 3.8);
        Estudiante est4 = new Estudiante("Juan Torres", 7.0, 7.5, 8.0);
        Estudiante est5 = new Estudiante("Lucia Ramirez", 5.0, 6.0, 5.8);

        Estudiante[] estudiantes = {est1, est2, est3, est4, est5};
        int aprobadosCount = 0;

       
        for (Estudiante est : estudiantes) {
            String estado;
            
           
            if (est.promedio >= 7.0) {
                estado = "Aprobado";
                aprobadosCount++;
            } else if (est.promedio >= 5.0) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }

            
            System.out.printf("%s : %.2f - %s\n", est.nombre, est.promedio, estado);
        }

        
        System.out.println("\nNumero total de estudiantes que aprobaron: " + aprobadosCount);
    }
}


```text
run:
Ana Perez : 8,43 - Aprobado
Carlos Gomez : 5,90 - Supletorio
Maria Lopez : 4,10 - Reprobado
Juan Torres : 7,50 - Aprobado
Lucia Ramirez : 5,60 - Supletorio

Numero total de estudiantes que aprobaron: 2
BUILD SUCCESSFUL (total time: 0 seconds)
```


