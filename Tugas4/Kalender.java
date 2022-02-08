package Tugas4;


public class Kalender {
    private int tanggal = 1;
    private int bulan = 1;
    private int tahun = 2000;

    public Kalender(int tanggal){
        this.tanggal = tanggal;
    }

    public Kalender(int bulan, int tahun){
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public Kalender(int tanggal, int bulan, int tahun){
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public void setTanggal(int tanggal){this.tanggal=tanggal;}
    public void setBulan(int bulan){this.bulan=bulan;}
    public void setTahun(int tahun){this.tahun=tahun;}
    public int getTanggal(){return this.tanggal;}
    public int getBulan(){return this.bulan;}
    public int getTahun(){return this.tahun;}

}

class TestLatihan{
    public static String getTime(Kalender kal){
        String tmp;
        tmp = kal.getTanggal()+"-"+
            kal.getBulan()+"-"+
            kal.getTahun();
        
        return tmp;
    }

    public static void main(String[] args) {
        Kalender kal=new Kalender(8);
        System.out.println("Waktu awal : "+getTime(kal));
        kal.setTanggal(9);
        System.out.println("1 hari setelah waktu awal : "+getTime(kal));
        kal=new Kalender(6,2003);
        System.out.println("Waktu berubah : "+getTime(kal));
        kal.setBulan(7);
        System.out.println("1 bulan setelah itu : "+getTime(kal));
        kal = new Kalender(20, 10, 2004);
        System.out.println("Waktu berubah : "+getTime(kal));
        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu : "+getTime(kal));
    }
}
