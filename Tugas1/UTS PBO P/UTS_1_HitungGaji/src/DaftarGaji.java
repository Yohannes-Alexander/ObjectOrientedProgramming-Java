
/**
 *
 * @author Ruben Siregar
 */
public class DaftarGaji {
    private int count=0;
//    public int n;
    private final Pegawai[] listPegawai;
    
    public DaftarGaji(int n){
//        this.n=n;
        this.listPegawai=new Pegawai[n];
    }
    
    public void addPegawai(Pegawai p){
        this.listPegawai[count]=p;
        this.count++;
    }
    
    public void printSemuaGaji(){
        System.out.println("-------------------------------------------------");
        System.out.println("Daftar gaji Pegawai Universitas: ");
        for(int i=0; i<this.count; i++){
            this.listPegawai[i].display();
        }        
        System.out.println("-------------------------------------------------");
    }
}
