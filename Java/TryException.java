
// Online IDE - Code Editor, Compiler, Interpreter

public class TryException
{
    public static void main(String[] args) {
        try{
            System.out.print(99/0);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Sucuss");
        }
    }
}
