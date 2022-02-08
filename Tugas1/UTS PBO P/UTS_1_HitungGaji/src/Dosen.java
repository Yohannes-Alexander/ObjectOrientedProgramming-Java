
/**
 *
 * @author Ruben Siregar
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public static int TARIF_SKS=100000;
    
    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    
    public void setSKS(int n){
        this.jumlahSKS=n;
    }
    
    @Override
    public int getGaji(){
        this.gaji+=this.jumlahSKS*Dosen.TARIF_SKS;
        return(this.gaji);
    }
}
