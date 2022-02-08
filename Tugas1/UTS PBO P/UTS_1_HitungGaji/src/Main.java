
/**
 *
 * @author Ruben Siregar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen putu=new Dosen("001", "Putu", "Jl. Sini");
        putu.setSKS(5);
        Dosen dharmadi=new Dosen("002", "Dharmadi", "Jl. Sana");
        dharmadi.setSKS(7);
        Staf kadek=new Staf("003", "Kadek", "Jl. Situ");
        kadek.setKehadiran(9);
                
        DaftarGaji dg=new DaftarGaji(3);
        dg.addPegawai(putu);
        dg.addPegawai(dharmadi);
        dg.addPegawai(kadek);
        dg.printSemuaGaji();
    }    
}
