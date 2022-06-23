package Planets;

public class Earth extends Planet{
   static Earth earth = new Earth();

   private Earth(){};

   public static Earth getInstance(){
       return earth;
   }


}
