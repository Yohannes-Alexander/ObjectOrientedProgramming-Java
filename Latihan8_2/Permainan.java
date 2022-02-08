package Latihan8_2;
import java.util.Scanner;

public abstract class Permainan {
    private String namaPemain;
    private int levelPemain;

    public void setNamaPemain(String namaPemain){this.namaPemain = namaPemain;}
    public void setLevelPemain(int levelPemain){this.levelPemain = levelPemain;}
    public String getNamaPemain(){return this.namaPemain;}
    public int getLevelPemain(){return this.levelPemain;}
    public void jalankan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input player name : ");String nama = input.nextLine();System.out.println();
        System.out.print("Input player level : ");int level = input.nextInt();System.out.println();

        this.setNamaPemain(nama);
        this.setLevelPemain(level);

        System.out.println("Nama pemain : "+this.getNamaPemain());
        System.out.println("Level pemain : "+this.getLevelPemain());
        
        System.out.println("Input number of hit : ");int hit = input.nextInt();System.out.println();
        System.out.println("Input number of miss : ");int miss = input.nextInt();System.out.println();

        System.out.println("Total score of your game is "+hitungSkor(hit, miss));
    }
    public abstract int hitungSkor(int hit, int miss);

}


