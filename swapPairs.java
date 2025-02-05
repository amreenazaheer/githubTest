/* Write a method named swapPairs that accepts an array of strings as a parameter and switches the order of values in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the array initially stores these values:
String[] a = {"four", "score", "and", "seven", "years", "ago"};
swapPairs(a);
Your method should switch the first pair ("four", "score"), the second pair ("and", "seven") and the third pair ("years", "ago"), to yield this array:
{"score", "four", "seven", "and", "ago", "years"}
If there are an odd number of values, the final element is not moved. For example, if the original list had been:
{"to", "be", "or", "not", "to", "be", "hamlet"}
It would again switch pairs of values, but the final value ("hamlet") would not be moved, yielding this list:
{"be", "to", "not", "or", "be", "to", "hamlet"}
You may assume that the array is not null and that no element of the array is null. */

import java.util.Arrays;

public class swapPairs {
    public static void main(String[] args) {
        String[] a = {"to", "be", "or", "not", "to", "be", "hamlet"};
        String[] b = {"four", "score", "and", "seven", "years", "ago"};
        swapPairs(a);
        swapPairs(b);                  
    }
    public static void swapPairs(String[] array){
        int limit = array.length;
        if(array.length % 2 != 0){
            limit = limit - 1;
        }
        for(int i = 0; i < limit; i+=2){
            String temp = "";
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        System.out.println(Arrays.toString(array)); 
    }

}
