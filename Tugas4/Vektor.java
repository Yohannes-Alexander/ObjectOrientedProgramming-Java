package Tugas4;



public class Vektor {
    private double[] elements;
    private int sizeVektor;

    public Vektor(double[] value){
        this.elements = value;
        this.sizeVektor = this.elements.length;
    }

    public int getSize(){return this.sizeVektor;}
    public double getElement(int i){return this.elements[i];}
    public void setElement(float newElement,int i){this.elements[i]=newElement;}

    public void displayVektor(){
        System.out.print("(");
        for(int i = 0;i<this.sizeVektor;i++){
            if(i==(this.sizeVektor-1)){
                System.out.print(this.elements[i]);  
            }
            else{
                System.out.print(this.elements[i]+", ");
            }
        }
        System.out.println(")");
    }

    public Vektor additionVektor(Vektor vektor1, Vektor vektor2){
        Vektor vektorResultan=new Vektor(vektor1.elements);
        for(int i = 0 ; i<vektor1.sizeVektor;i++){
            vektorResultan.elements[i]=vektor1.elements[i]+vektor2.elements[i];
        }
        return vektorResultan;
    }

    public Vektor subractionVektor(Vektor vektor1, Vektor vektor2){
        Vektor vektorResultan=new Vektor(vektor1.elements);
        for(int i = 0 ; i<vektor1.sizeVektor;i++){
            vektorResultan.elements[i]=vektor1.elements[i]-vektor2.elements[i];
        }
        return vektorResultan;
    }

    public Vektor multiplyVektorScalar(Vektor vektor,double scalar){
        Vektor vektorResultan=new Vektor(vektor.elements);
        for(int i = 0 ; i<vektor.sizeVektor;i++){
            vektor.elements[i]=vektor.elements[i]*scalar;
        }
        vektorResultan = vektor;
        return vektorResultan;

    }

    public Vektor divisionVektorScalar(Vektor vektor, double scalar){
        Vektor vektorResultan=new Vektor(vektor.elements);
        for(int i = 0 ; i<vektor.sizeVektor;i++){
            vektor.elements[i]=vektor.elements[i]/scalar;
        }
        vektorResultan = vektor;
        return vektorResultan;
    }

    public double dotVektor(Vektor vektor1, Vektor vektor2) {
        double result = 0.0;
        for(int i = 0; i < vektor1.sizeVektor; i++ ){
            result += vektor1.elements[i]*vektor2.elements[i];
        }
        return result;
    }
}

class TestVektor{
    public static void main(String[] args) {
        double[] elementArray1 = {2.0,4.0,5.0,1.0,9.0,6.0,7.0,8.0};
        double[] elementArray2 = {5.0,0.0,3.0,6.0,9.0,2.0,8.0,7.0};
        Vektor vektor1 = new Vektor(elementArray1);
        Vektor vektor2 = new Vektor(elementArray2);
        System.out.println("Nilai size (banyak elemen vektor1 adalah "+vektor1.getSize());
        System.out.println("Nilai size (banyak elemen vektor2 adalah "+vektor2.getSize());
        System.out.println("Nilai element ke-4 element vektor1 adalah "+vektor1.getElement(4));
        System.out.println("Nilai element ke-4 element vektor2 adalah "+vektor2.getElement(4));
        vektor1.setElement(1, 4);System.out.println("Mengubah element ke-4 vektor 1 menjadi 1");
        vektor2.setElement(1, 4);System.out.println("Mengubah element ke-4 vektor 2 menjadi 1");
        System.out.println("Nilai element ke-4 element vektor1 adalah "+vektor1.getElement(4));
        System.out.println("Nilai element ke-4 element vektor2 adalah "+vektor2.getElement(4));
        System.out.print("Vektor 1 = ");vektor1.displayVektor();
        System.out.print("Vektor 2 = ");vektor2.displayVektor();
        Vektor PengoperasiVektor = new Vektor(elementArray2);
        if(vektor1.getSize()==vektor2.getSize()){
            PengoperasiVektor= vektor1.additionVektor(vektor1, vektor2);
            System.out.print("Vektor 1 + Vektor 2 = ");PengoperasiVektor.displayVektor();
        }
        else{
            System.out.println("Tidak dapat melakukan operasi vektor karena panjang kedua vektor berbeda");
        }
        if(vektor1.getSize()==vektor2.getSize()){
            PengoperasiVektor = vektor1.subractionVektor(vektor1, vektor2);
            System.out.print("Vektor 1 - Vektor 2 = ");PengoperasiVektor.displayVektor();
        }
        else{
            System.out.println("Tidak dapat melakukan operasi vektor karena panjang kedua vektor berbeda");
        }
        PengoperasiVektor = vektor1.multiplyVektorScalar(vektor1, 2);
        System.out.print("Element Vektor1 * 2 = ");PengoperasiVektor.displayVektor();
        PengoperasiVektor = vektor1.divisionVektorScalar(vektor1, 5.0);
        System.out.print("Element Vektor1 / 5.0 = ");PengoperasiVektor.displayVektor();
        if(vektor1.getSize()==vektor2.getSize()){
            System.out.print("Element Vektor1 . Vektor2 = "+vektor1.dotVektor(vektor1, vektor2));
        }
        else{
            System.out.println("Tidak dapat melakukan operasi vektor karena panjang kedua vektor berbeda");
        }
    }
}
