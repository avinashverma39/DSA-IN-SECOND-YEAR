class labour{
    String name = "Alx";


void function(){
    System.out.println("Hello" + name);
}
}
class Ab extends labour{
    void function(){
        System.out.println("Hello" + name);
    }
}

public class labourMain{
  public static void main(String[] args){

    labour obj = new labour();
  }

}