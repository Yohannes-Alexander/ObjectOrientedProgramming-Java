package Latihan13;

public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){super();System.err.println("ERROR");}
    public EmptyStackException(String exception){super(exception);}
}
