import java.util.Scanner;
/**
 *
 * @author Ruben Siregar
 */
public class Vektor {
    public int n;
    public double[]v;
    
    Vektor(int n){
        this.n=n;
        this.v=new double[this.n];
    }
    
    Vektor(){        
    }
        
    public void inputElemen(){
        System.out.println("---------------------------------------");
        Scanner input=new Scanner(System.in);
        for(int i=0; i<this.n; i++){
            System.out.print("Masukkan elemen vektor ke "+i+" : ");
            this.v[i]=input.nextInt();
        }
        this.display();
    }
    
    public double jlhVektor(){
        double jumlah=0;
        for(int i=0; i<this.n; i++){
            jumlah+=this.v[i];
        }
        return jumlah;
    }
    
    public Vektor kurangVektor(double k){
        Vektor kurang=new Vektor(3);
        for(int i=0; i<this.n; i++){
            kurang.v[i]=this.v[i]-k;
        } 
        return kurang;        
    }
    
    public Vektor kuadratVektor(){
        Vektor kuadrat=new Vektor(3);
        for(int i=0; i<this.n; i++){
            kuadrat.v[i]=(this.v[i])*(this.v[i]);
        }
        return kuadrat;
    }
    
    public double hitungMean(){
        double res=this.jlhVektor()/this.n;        
        return res;
    }
    
    public double hitungVarians(){
        double var=(this.kurangVektor(this.hitungMean()).kuadratVektor().jlhVektor()/(this.n-1));
        return var;        
    }
    
    public double hitungSD(){
        double sd=Math.sqrt(this.hitungVarians());
        return sd;
    }
    
    public void display(){
        System.out.println("---------------------------------------");
        System.out.println("Nilai Vektor: ");
        System.out.print("[ ");
        for(int i=0; i<this.n; i++){
            if(i==this.n-1){
                System.out.print(this.v[i]);
            }
            else{
                System.out.print(this.v[i]+", ");                
            }            
        }
        System.out.print(" ]");
        System.out.println();
    }
}
