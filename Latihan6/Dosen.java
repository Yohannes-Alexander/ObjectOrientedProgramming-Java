package Latihan6;

public class Dosen extends Orang{
    private int nip;

    public Dosen(String nama){
        super(nama);
        this.nama = nama;
    }
    public Dosen(String nama, int nip){
        super(nama);
        this.nama = nama;
        this.nip = nip;
    }
    public Dosen(String nama, int nip, int umur){
        super(nama,umur);
        this.nama = nama;
        this.nip = nip;
        this.umur = umur;
    }
    public void Info(){
        if(this.nip!=0 && this.umur!=0){
            System.out.println("Nama : "+this.nama);
            System.out.println("NIP : "+this.nip);
            System.out.println("Umur : "+this.umur);
        }
        else if(this.nip==0 && this.umur==0){
            System.out.println("Nama : "+this.nama);
            System.out.println("NIP : - ");
            System.out.println("Umur : - ");
        }
        else if(this.umur == 0){
            System.out.println("Nama : "+this.nama);
            System.out.println("NIP : "+this.nip);
            System.out.println("Umur : - ");
        }
    }
}
