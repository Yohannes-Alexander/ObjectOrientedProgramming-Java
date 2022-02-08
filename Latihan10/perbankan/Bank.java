package Latihan10.perbankan;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>() ;
    private int jumlahNasabah = 0;

    public Bank(){}

    public void tambahNasabah(String namaAwal, String namaAkhir){
        nasabah.add(new Nasabah(namaAwal,namaAkhir));
        this.jumlahNasabah +=1; 
    }

    public int getJumlahNasabah(){return this.jumlahNasabah;}
    public Nasabah getNasabah(int indeks){return nasabah.get(indeks);}

}
