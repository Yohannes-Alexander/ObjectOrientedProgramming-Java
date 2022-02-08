
/**
 *
 * @author Ruben Siregar
 */
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    public int gaji=1500000;
	
    public Pegawai(String ni, String na, String a ){
	this.nip=ni;
	this.nama=na;
        this.alamat=a;
    }
    
    public String getNama(){
        return(this.nama);
    }
    
    public int getGaji(){
        return(this.gaji);
    }
        
    public void display(){
        System.out.println("- "+this.nama+" NIP("+this.nip+")"+ " mendapatkan gaji "+this.getGaji()+" -- Alamat: "+this.alamat);
    }
}
