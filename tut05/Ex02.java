package tut05;

public class Ex02 {



    /**  (a). countNegatives
     * count the number of elements of an array of integers that
     *  are negative
     *
     * @effetcs:   using loop to count negative elements
     *               if array[i] < 0  then increase count variable by 1
     *
     */
    private static int countNegatives (int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if ( array [i] < 0)
                count ++;
        }
        return count;
    }
    /** (b). countEvens: count the number of even elements of an array of positive
     *    integers
     * @effects:  using loop to count even elements
     *           if array [i] % 2 == 0 the increase count variable
     *
     */
    private static int countEvens (int [] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if ( array [i] % 2 == 0 )
                 count ++;
        }
        return count;
    }
    /**(c). divArray: divide the elements of a real number array by a real number
     *
     * @modifies: real number array
     * @effetcs:   array [i] = array [i] / (real number d)
     *
     */

    private static double [] divArray (int [] array , double d){
        double [] result = new double [array.length];
        for (int i = 0; i < array.length; i++){
              result [i] = (double) ( array [i] / d );
        }
        return result;
    }

    /** (d). min: find the minimum element in an array of integers
     * @effects:
     *           set min = array [0] (the first element, by default)
     *           using loop
     *              if (array[i] < min) then update min = array[i]
     *
     */
    private static int min (int [] array){
        int minValue = array [0];
        for (int i = 0; i < array.length; i++){
            if ( array [i] < minValue ){
                minValue = array [i];
            }
        }
        return minValue;
    }
    /**(e). isAscSorted: determine whether an array of integers is in ascending order
     * @effects: if array.length == 0   return false
     *           else
     *               using loop, start at 1
     *                  if ( array [i] <  array[i-1] )
     *                     return false
     *              complete a loop without return false
     *               return true
     */
    private static boolean isAscSorted (int [] array){
        for (int i = 1; i < array.length; i++){
            if ( array[i] < array [i-1] )
                return false;
        }
        return true;
    }


    /**
     * (f). length: find the length of an array of CHARs on the understanding that if it contains the character NUL (the character ‘u0000’ in Java), assumed
     *     predefined as a constant, then that and any characters after it are not to be
     *     counted. In other words, NUL is understood as a terminator.
     * @requires: array contains NUL character
     * @effects:   set length = 0, by default
     *             using loop
     *                   Increase length by 1 until meeting NUL and return length
     */
    private static int length (char [] letters){
         int length = 0;
         final char NUL = '\u0000';
         int i = 0;
         while ( letters [i] !=  NUL ){
             length++;
             i++;
         }
         return length;
    }
    /**
    (h) compare: given two arbitrary arrays of reals, a and b, determine if a ⊂ b,
            *         a ⊃ b, a ∩ b, or a = b
            *
     *      @requires : both arrays A and B are not NUl
     *      @effects:
            *         using loop to compare pairs of elements then count the number of same elements
     *         if all elements of A is in B and vice versa then A = B (and length A = length B)
            *         if at least one element in common between A and B then A intersects B.
            *         if A is subset of B if all element of A present in B.
     *         if A is superset of B if all element of B present in A.
     *
             */

    private static void compare ( double [] a, double [] b){
            int intersections = 0;
            for (int i = 0; i < a.length; i++){
                 for (int j = 0; j < b.length; j++){
                     if ( a[i] == b[j])
                         intersections ++;
                 }
            }
            if ( a.length == b.length && a.length == intersections ){
                System.out.println(" a = b ");
            }
            else if ( intersections < a.length && intersections < b.length ){
                System.out.println(" a ∩ b ");
            }
            else if ( intersections < a.length && intersections == b.length ){
                System.out.println(" a ⊃ b ");
            }
            else if ( intersections < a.length && intersections == a.length ){
                System.out.println(" a ⊂ b ");
            }
    }
    /**
     *  (i). freq: compute the frequencies of each element of an array of reals
     *
     * @effects: using a same-length array to store the frequencies of each elements
     *     using loop to compare other elements with chosen element
     *          then count the frequency, store it and set count = 0.
     *
     */
    private static int [] freq (double [] array){
        int [] frequencies = new int [array.length];

        for (int i = 0; i < array.length; i++){
            int count = 0;
            double temp = array [i];

            for (int j = 0; j < array.length; j++){
                if ( temp == array [j] )
                    count++;
            }
            frequencies [i] = count;
        }
        return frequencies;
    }

    public static void main(String[] args) {

    }
}
