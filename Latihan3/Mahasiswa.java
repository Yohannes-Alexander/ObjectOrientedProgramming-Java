package Latihan3;

public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa(int i, String n){
        this.nrp = i;
        this.nama = n;
    }

    public int getNrp(){
        return this.nrp;
    }

    public String getNama(){
        return this.nama;
    }
}

class TesLatihan2{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(12345, "Jono");
        System.out.println("NRP : "+mhs.getNrp());
        System.out.println("Nama : "+mhs.getNama());
        
    }
}
