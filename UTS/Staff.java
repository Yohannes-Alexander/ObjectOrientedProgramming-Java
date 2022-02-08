package UTS;

public class Staff extends Pegawai {
    public int jumlahKehadiran;
    public int TARIF_HARIAN = 50000;

    protected Staff(String nip, String nama, String alamat){
        super(nip,nama,alamat);
    }

    protected void setKehadiran(int jumlahKehadiran){
        this.jumlahKehadiran = jumlahKehadiran;
    }

    @Override
    protected int getGaji(){
        return 1500000+(this.jumlahKehadiran*this.TARIF_HARIAN);
    }
}
