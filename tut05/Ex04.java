package tut05;

public class Ex04 {
    /**(a). remainder: determine the remainder after integer division using only subtraction. Ignore the possibility of division by zero.
     *
     *  input a and b (integer);  a is dividend , b is divisor
     * @requires:  b (divisor) != 0
     * @modifies:  a
     * @effects :
     *   pseudo code: if them have same signs
     *                  if a, b < 0
     *                    while ( |a|  <= |b|)
     *                        do a = |a| - |b|
     *                    return -a
     *                  else a, b > 0
     *                    while ( a <= b )
     *                        do a = a - b;
     *                    return a
     *                else them have different signs
     *                    if a > 0, b < 0
     *                        while ( |a|  <= |b| )
     *                           do a = |a| - |b|
     *                        return a
     *                    else a < 0, b > 0
     *                         while ( |a| <= |b| )
     *                            do a  = |a| - |b|
     *                         return -a
     *
     *
     *
     */
    private static int remainder (int a, int b){
        if ( a <= 0 && b < 0 ){
            a = Math.abs(a);
            b = Math.abs(b);
            while ( a >= b ){
                   a = a - b;
            }
            return -a;
        }
        else if ( a >= 0 && b > 0 ){
            while ( a >= b ){
                  a =  a - b;
            }
            return a;
        }
//        different signs
        else if ( a <= 0 && b > 0 ){
            a = Math.abs(a);
            while ( a >= b ){
                 a = a - b;
            }
            return -a;
        }
        else if ( a >= 0 && b < 0 ){
            b = Math.abs(b);
            while ( a >= b ){
                 a = a - b;
            }
            return a;
        }
        return 0; // Invalid
    }
    /**   div: determine the integer division using only addition and subtraction.
     * Ignore division by zero.
     *
     *  @requires: b (divisor) != 0
     *      @modifies:  a
     *      @effects :
     *        pseudo code: if them have same signs
     *                        if a, b < 0
     *                          while ( |a|  <= |b|)
     *                              do a = |a| - |b|
     *                          return -a
     *                        else a, b > 0
     *                          while ( a <= b )
     *                              do a = a - b;
     *
     *                     =>> return count the times of subtraction or addition
     *                      else them have different signs
     *
     *                              while ( |a|  <= |b| )
     *                                 do a = a + b;
     *                              return a
     *
     */
    private static int div ( int a, int b ){
        int quotient = 0;
        if ( a <= 0 && b < 0 ){
            a = Math.abs(a);
            b = Math.abs(b);
            while ( a >= b ){
                a = a - b;
            }
            return quotient;
        }
        else if ( a >= 0 && b > 0 ){
            while ( a >= b ){
                a =  a - b;
            }
            return quotient;
        }
//        different signs
        else if ( a <= 0 && b > 0 ){
            a = Math.abs(a);
            while ( a >= b ){
                a = a - b;
            }
            return -quotient;
        }
        else if ( a >= 0 && b < 0 ){
            b = Math.abs(b);
            while ( a >= b ){
                a = a - b;
            }
            return quotient;
        }
        return quotient = 0;
    }

  /**  (c). middle: determine the middle one of three numbers
     *
             *     @effects : using sorting algorithm to sort ascending 3-number array and return the middle element
     *               ( implementing Bubble or Selection Sort )
            */

     private static int middle (int a, int b, int c){
          int [] array = {a,b,c};
          for (int i = 0; i < 3; i++){
              for (int j = i + 1; j < 2; j++){
                  if ( array [j] > array [j+1]){
                      int temp = array [j+1];
                      array [j+1] =  array [j];
                      array [j] = temp;
                  }
              }
          }
          return array [1];
     }
    /**  (d). isPalindrome: determine whether or not a string is a palindrom (a palindrom reads the same backward and forward, e.g. deed)
     * @modifies:   string
     * @effects :    using loop
     *                  then compare pairs of character elements at i index and (n - i) index.
     *                       if unequal then return false
     *                return true
     */
      private static boolean isPalindrome (String str){
          int n = str.length();
          for ( int i = 0; i < n ; i++ ){
              if ( str.charAt( i ) != str.charAt( n-1-i ) )
                  return false;
          }
          return true;
      }
/**(e). isPrime: determine if an integer is a prime
 *
 * @effects:
 *      Integer count = 0
 *      if input <= 1 return false
 *      else
 *            loop from input to 2
 *            if input % i == 0 then increase count by 1
 *
 *      if count == 0 return true
 *      else return false
 *
 */
      private static boolean isPrime (int input){
           if ( input < 2 ) return false;
           else {
               int times = 0;
               for (int i = 2; i < input; i++){
                   if ( input % i == 0 )
                       times++;
               }
               if ( times == 0 ) return true;
               else return false;
           }
      }
}
