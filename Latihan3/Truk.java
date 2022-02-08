package Latihan3;

public class Truk {
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks){
        this.muatan = 0;
        this.muatanmaks=beratmaks;
    }

    public double getMuatanMaks(){return this.muatanmaks;}
    public double getMuatan(){return this.muatan;}
    public void  tambahMuatan(double berat){
        if((this.muatanmaks-this.muatan)>=berat){
            this.muatan += berat;
        }
        else{
            this.muatanmaks +=0.0;
        } 
    }
}

class TesLatihan3{
    public static void main(String[] args) {
        Truk truk=new Truk(1000);
        System.out.println("Muatan maksimal : "+truk.getMuatanMaks());
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 350");
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 100");
        truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150");
        System.out.println("Muatan sekarang = "+truk.getMuatan());
    }
}
