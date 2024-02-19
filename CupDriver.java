/** driver class for the Cup */

public class CupDriver{
   public static void main(String[] args){
     Cup benMug = new Cup();
     System.out.println( benMug.toString() );
     
     Cup benMug2 = new Cup(8.0, 2.0);
     System.out.println( benMug2 );
     
     Mug johnMug = new Mug();
     System.out.println( johnMug.toString() );
     
     Mug johnMug2 = new Mug(11.0, 7.0, 4.0);
     System.out.println( johnMug2 );
     
     
   }
}

