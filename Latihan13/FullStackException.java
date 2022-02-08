package Latihan13;

public class FullStackException extends RuntimeException {
    public FullStackException(){
        super();
        System.out.println("ERROR");
        
    }
    public FullStackException(String exception){super(exception);}
}
