package UTS;

public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS = 100000;

    protected Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }

    protected void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    
    @Override
    protected int getGaji(){
        return 1500000+(this.jumlahSKS*this.TARIF_SKS);
    } 
}
