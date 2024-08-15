public class ex{
    public static void main(String[] args) {
        
        int a=20;
        int b=40;
        int c=b/a;

        try{
            System.out.println("output of the following code:" +c);
        }
        catch(ArithmeticException |ArrayIndexOutOfBoundsException e){
            System.out.println("error" +e);
        }
    }
}
