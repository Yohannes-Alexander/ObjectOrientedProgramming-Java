import java.util.Scanner;

public class Matriks {
    private int[][] matriks;
    
    public Matriks(int n, int m){
        this.matriks=new int[n][m];
    }
    
    public Matriks(){
        System.out.println("------------INPUT UKURAN MATRIKS------------");
        Scanner input=new Scanner(System.in);
        System.out.print("Jumlah baris: ");
        int n=input.nextInt();
        System.out.print("Jumlah kolom: ");
        int m=input.nextInt();
        this.matriks=new int[n][m];
    }
    
    public void input(){
        System.out.println("------------INPUT NILAI ELEMEN MATRIKS------------");
        Scanner input=new Scanner(System.in);
        for(int i=0; i<this.matriks.length; i++){
            for(int j=0; j<this.matriks[0].length; j++){
                System.out.print("Masukkan nilai elemen ke "+i+","+j+" : ");
                this.matriks[i][j]=input.nextInt();
            }                
        }
    }
    
    public int getBaris(){
        return(this.matriks.length);
    }
    
    public int getKolom(){
        return(this.matriks[0].length);
    }    
    
    public int getElemen(int i,int j){
        return(this.matriks[i][j]);
    }
    
    public void setElemen(int i,int j, int x){
        this.matriks[i][j]=x;
    }    
    
    public void display(){
        System.out.println("------------DISPLAY MATRIKS------------");
        System.out.print("{");
        for(int i=0; i<this.matriks.length; i++){
            System.out.print("[");
            for(int j=0; j<this.matriks[0].length; j++){
                System.out.print(this.matriks[i][j]);
                if(j==this.matriks[0].length-1){
                    System.out.print("]");                    
                }else{
                    System.out.print(", ");                                        
                }
            }
            if(i==this.matriks.length-1){
                    System.out.print("}\n");
                }else{
                    System.out.print("\n");                                        
                }
        }
    }
    
    public static Matriks jumlahan2Matriks(Matriks a, Matriks b){
        int n=a.getBaris();
        int m=a.getKolom();
        Matriks hasil=new Matriks(n,m);
        
        Scanner input=new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                hasil.matriks[i][j]=a.matriks[i][j]+b.matriks[i][j];
            }                
        }
        
        return(hasil);
    }
    
    public static Matriks kurangan2Matriks(Matriks a, Matriks b){
        int n=a.getBaris();
        int m=a.getKolom();
        Matriks hasil=new Matriks(n,m);
        
        Scanner input=new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                hasil.matriks[i][j]=a.matriks[i][j]-b.matriks[i][j];
            }                
        }
        
        return(hasil);
    }
}
