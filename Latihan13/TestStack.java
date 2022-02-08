package Latihan13;


public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try{
            stack.push("1");
            stack.push("2");

            System.out.println("print");
            System.out.println(stack.pop().toString());
            System.out.println(stack.pop().toString());
            System.out.println(stack.pop().toString());

            stack.push("3");
            stack.push("4");
            System.out.println(stack.pop().toString());
            stack.push("5");
            stack.push("6");
            stack.push("7");
            stack.push("8");
            stack.push("9");
        }catch(EmptyStackException e){
            System.out.println(e.toString());
        }catch(FullStackException e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Yang ini selalu dijalankan");
        }

        
    }
}
