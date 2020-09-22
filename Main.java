/*
Lab 4
Partners: Tyler Adleta and Angela Lopez : 
Date(9/22/2020)
*/
import java.util.Random;


class Main {
  public static void main(String[] args) {
    System.out.println("Random number genarator");
    // Creating Randon num
    Random r = new Random();
    int randomnum = r.nextInt(51) + 1;
    System.out.println("random number is " + randomnum);

    if (randomnum < 25) {// while statement to do countdown and print for numbers less than 25
      while (randomnum >= 0) {
        
        System.out.println(randomnum);
        randomnum--;
      System.out.println("ahoymates");
      }
    }
    // print cannonnball for numbers between 25 and 42
    else if (randomnum > 25 & randomnum < 42) {
      while (randomnum >= 0) {
       
       System.out.println(randomnum);
        randomnum--;
        System.out.println("Cannonball");
      }
      //print for anything else
    } else {
      while (randomnum >= 0) {
       System.out.println(randomnum);
        randomnum--;
  
        System.out.println("Blast off");
      }

    }
  }
}