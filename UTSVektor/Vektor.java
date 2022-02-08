package UTSVektor;

public class Vektor {
    private double[] element;
    private int size;

    public Vektor(double[] element){
        this.element = element;
        this.size = element.length;
    }

    public double jlhVektor(){
        double result = 0.0 ;
        for (int i = 0 ; i< this.size;i++){
            result += this.element[i];
        }
        return result;
    }

    public Vektor kurangVektorKonst(double konstanta){
        Vektor vektor = new Vektor(this.element);
        for(int i = 0; i < this.size;i++){
            vektor.element[i]=this.element[i]-konstanta;
        }
        return vektor;
    }

    public Vektor kuadratVektor(){
        Vektor vektor = new Vektor(this.element);
        for(int i = 0; i < this.size;i++){
            vektor.element[i]=this.element[i]*this.element[i];
        }
        return vektor;
    }

    public double hitungMean(){
        double mean = this.jlhVektor();
        return mean/this.size;
    }

    public double hitungVarians(){
        double varians = 0.0;
        varians = (((this.kurangVektorKonst(this.hitungMean())).kuadratVektor()).jlhVektor())/(this.size-1);
        return varians;
    }

}
