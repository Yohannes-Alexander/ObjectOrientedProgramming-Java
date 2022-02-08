package Tugas3;

public class Truk {
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks){
        this.muatan = 0.0;
        this.muatanmaks=beratmaks;
    }

    public double getMuatanMaks(){return this.muatanmaks;}
    public double getMuatan(){return this.muatan;}
    public boolean tambahMuatan(double berat){
        boolean status=false;
        if((newtsToKilo(this.muatanmaks-this.muatan)) >= newtsToKilo(berat)){
            status=true;
            this.muatan = kiloToNewts(newtsToKilo(this.muatan+berat));
        }
        
        return status; 
    }

    public double newtsToKilo(double berat){
        double convert ;
        convert = berat/9.8;
        return convert;
    }

    public double kiloToNewts(double berat){
        double convert;
        convert = berat*9.8;
        return convert;
    }
}

class TesTugas2{
    public static void main(String[] args) {
        Truk truk = new Truk(900);
        boolean status;
        System.out.println("Muatan maksimal : "+truk.getMuatanMaks());
        status=truk.tambahMuatan(500.0);
        System.out.print("Tambah muatan : 500");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        status = truk.tambahMuatan(300.0);
        System.out.print("Tambah muatan : 300");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        status=truk.tambahMuatan(150.0);
        System.out.print("Tambah muatan : 150");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        status=truk.tambahMuatan(50.0);
        System.out.print("Tambah muatan : 50");
        if(status){
            System.out.println("  ok");
        }
        else{
            System.out.println("  gagal");
        }
        System.out.println("Muatan sekarang = "+truk.getMuatan());
    }
}
