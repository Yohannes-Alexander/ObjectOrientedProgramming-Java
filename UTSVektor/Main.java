package UTSVektor;


public class Main {
    public static void main(String[] args) {
        double[] element = {1.0,5.3,4.6,5.0,7.1,2.4};
        Vektor vektor = new Vektor(element);
        System.out.println("The variance value of the vector is " +vektor.hitungVarians());
    }
}
