package Tugas1;

public class main {
    public static void main(String[] args) {
        MyArray r = new MyArray();
        r.display();
        r.rand(10);
        r.display();
        System.out.println(r.getSize());
        r.insert(12);
        r.display();
        r.setElement(1,25);
        r.display();
        System.out.println( r.getElement(2));
        r.display();
        System.out.println("Ini Myarray s");
        MyArray s = r.copy();
        s.display();
    }
}
