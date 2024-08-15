 class Bird {
    public void animal(){
        System.out.println("the animal sings the song");
    }
}
//it is an exapmle of the multi level inhertianace 
 class Lion extends  Bird{
    public void loud(){
        System.out.println("the lion is for the second purpose");
    }
 }

 class Pig extends Lion{
    public void sings(){
        System.out.println("the pig sing the songs which only deaf hear");
    }
 }

 class Main{
    public static void main(String[] args) {
        Pig p=new Pig();

        //making an instance p of the base class bird which would be used to call the elements 
        p.animal();
        p.loud();
        p.sings();
    }
 }