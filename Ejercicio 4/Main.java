/**
 *
 * @author Asus
 */
public class Cuenta {
    
    String titular;
    double saldo;

  
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        
        Cuenta c1 = new Cuenta("Ana", 200);
        Cuenta c2 = new Cuenta("Carlos", 350);

        
        int meses1 = 0;
        System.out.println("--- Cuenta de " + c1.titular + " ---");
        while (c1.saldo < 500) {
            c1.saldo += 50;
            meses1++;
            System.out.println(c1.titular + " : " + c1.saldo);
        }
        System.out.println("Meses que necesito " + c1.titular + ": " + meses1 + "\n");

        
        int meses2 = 0;
        System.out.println("--- Cuenta de " + c2.titular + " ---");
        while (c2.saldo < 500) {
            c2.saldo += 50;
            meses2++;
            System.out.println(c2.titular + " : " + c2.saldo);
        }
        System.out.println("Meses que necesito " + c2.titular + ": " + meses2);
    }
}
