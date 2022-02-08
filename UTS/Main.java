package UTS;


public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("001", "Putu", "Jawa Barat");
        dosen1.setSKS(5);

        Staff staff1 = new Staff("002", "Dharmadi", "Jawa Timur");
        staff1.setKehadiran(9);
        
        Dosen dosen2 = new Dosen("003", "Kadek", "DKI Jakarta");
        dosen2.setSKS(7);

        DaftarGaji daftarGaji = new DaftarGaji(3);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(staff1);
        daftarGaji.addPegawai(dosen2);


        daftarGaji.printSemuaGaji();
    }
}
