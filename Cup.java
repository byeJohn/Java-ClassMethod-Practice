/**
 @author John Nguyen
 Date: 08/30/2022
 
 Class CSCI 
 Instructor   
 Illustration of classes and methods
 
  //============================ To Do: ==================
  //1. default constructor
  //2. override the toString method
  //3. come up with your own application for these classes
  //======================================================
*/

import java.util.*;

interface Spillable{
   
   }

public class Cup{
   //attributes
   private double maxVol; //maximum volume
   private double actVol; //current volume
 
 
  //functionalities
  
  /** default constructor */
   public Cup(){
     this.maxVol = 32.0;
     this.actVol = 0.0;
  }
  
  
  /** .. */
   public Cup(double maxVol, double curVol){
     this.maxVol = maxVol;
     this.actVol = curVol;
  }
  // GETTER, allows the extended class to get maxVol  
   public double getMaxVol() {
     return this.maxVol;
  }
  // GETTER, allows the extended class to get actVol
   public double getActVol() {
     return this.actVol;
  }
  
  /** Allows to display method as String*/
   public String toString(){
     return "Max volume: " + this.maxVol +
            "\nActual Volume: " + this.actVol;
  }
  /**driver*/ 
   public static void main(String[] args){
     Mug y = new Mug(5.0,6.5,3.5);
     System.out.println(y);

     System.out.println();
     
     Cup x = new Cup(6.5,3.5);
     System.out.println(x);
  }  
}

//extending the class
/** .. */
class Mug extends Cup{
  //attribute
   private double dryWeight; //Weight of Mug
     
  
  //deafult constructor
   public Mug(){
     this.dryWeight = 10.0;
  }
   
  //
   public Mug(double weight, double maxVol, double actVol){
     super(maxVol, actVol);
     this.dryWeight = weight;
  } 
  //Allows to display method as string   
   public String toString(){
     return "Weight: " + this.dryWeight +
            "\nMax Volume: " + getMaxVol() +
            "\nActual Volume: " + getActVol();
  } 
} 