package Latihan8_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Arcade game");
        PermainanArcade game1 = new PermainanArcade();
        game1.jalankan();System.out.println();
        System.out.println("Strategy game");
        PermainanStrategy game2  = new PermainanStrategy();
        game2.jalankan();

        // Permainan game1 = new Permainan();
        // game1.jalankan();
    }
}
