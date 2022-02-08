package UTS;

public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;

    protected Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    protected String getNama(){
        return this.nama;
    }

    protected int getGaji(){
        return 1500000;
    }
}
