
/**
 *
 * @author Ruben Siregar
 */
public class Staf extends Pegawai{
    public int jumlahKehadiran;
    public int TARIF_HARIAN=100000;
        
    public Staf(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    
    public void setKehadiran(int n){
        this.jumlahKehadiran=n;
    }
    
    @Override
    public int getGaji(){
        this.gaji+=this.jumlahKehadiran*this.TARIF_HARIAN;
        return(this.gaji);
    }
}
