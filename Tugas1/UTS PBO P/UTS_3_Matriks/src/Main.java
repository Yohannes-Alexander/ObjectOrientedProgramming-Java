public class Main {
    public static void main(String[] args) {
        Matriks m1=new Matriks(); //a
        m1.input(); //b
        m1.display();
        System.out.println("Baris: "+m1.getBaris()); //c
        System.out.println("Kolom: "+m1.getKolom()); //d
        System.out.println("Elemen baris 2 kolom 2: "+m1.getElemen(0,0)); //e
        m1.setElemen(0,0,99); //f
        m1.display(); //g
        
        Matriks m2=new Matriks();
        m2.input();
        
        Matriks m3 = Matriks.jumlahan2Matriks(m1, m2); //h
        m3.display();

        Matriks m4 = Matriks.kurangan2Matriks(m1, m2); //i
        m4.display();        
    }
}
