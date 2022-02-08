///a
package UTS;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jumlahPegawai = 0;    

    protected DaftarGaji(int jumlah){
        this.listPegawai = new Pegawai[jumlah];
    }

    protected void addPegawai(Pegawai pegawai){
        this.listPegawai[jumlahPegawai] = pegawai;
        this.jumlahPegawai++;
    }

    protected void printSemuaGaji(){
        for (int i =0;i<this.jumlahPegawai;i++){
            System.out.println(listPegawai[i].getNama()+" mendapatkan gaji "+listPegawai[i].getGaji());
        }
    }

    public int []setMethod(int i, float a){return new int[5];}
}
