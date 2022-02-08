
/**
 *
 * @author Ruben Siregar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vektor v1 = new Vektor(3);
        v1.inputElemen();
        
        System.out.println("---------------------------------------");
        System.out.println("Varians: "+v1.hitungVarians());
        System.out.println("Standar Devisiasi: "+v1.hitungSD());
        System.out.println("---------------------------------------");
    }
    
}
