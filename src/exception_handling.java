public class exception_handling {
    public static void main(String[] args) {
        
    //try and the catch statement in java 
    //used for checking whether the sttement is diveided or not
    int a=45;
    int b=5;
    try{
    int c=a/b;
     System.out.println("we tried to diveide but no:"+ c);
     
    }
    catch(Exception e){

    System.out.println("the code output would be:" +e);
    System.out.println("end of the program");

    }

}

}
