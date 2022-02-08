package Latihan8_1;

public class DoraMini extends Robot {
    
    public void sayDora(){System.out.println("Halo, Saya Dora Mini");}
    
    @Override
    public void displayData(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Pemilik : "+this.pemilik);
        System.out.println("Tahun : "+this.tahun);
    }
    
    @Override
    public void setNama(String nama){this.nama = nama;}
}
