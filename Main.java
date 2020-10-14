/**
 * A method the tells the user if all the digits are odd or not
 * @author Liana Bazzarella 
 */
public class Main {

  // tells the user if all the digits are odd or not
  public static int allDigitsOdd(int integer){
    while(integer > 10){
      integer = integer / 10;
      if(integer%2 == 0){
        System.out.println("False");
      } else{
        System.out.println("True");
      }
    }
    return integer;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // number used 
    allDigitsOdd(13579);
  }
}
