/* Problem Statement: Check if the number till n is prime of not
 * print true if the number is prime or else print
 * false for non-prime numbers.
 */
package java.io;
import java.util.*;

public class PrimeNum{
  public static void main(String[] args){
    int n = 20;
    for(int i =1; i<=n; i++){
      System.out.print(i+" "+isPrime(i));
    }
  } 
  static boolean isPrime(int n ){
    if(n <= 1){
      return false;
    }
    int c = 2;
    while(c*c <=n ){
      if(n%c == 0) {
        return false;
      }
      c++;
    }
    return true;
  }
}
