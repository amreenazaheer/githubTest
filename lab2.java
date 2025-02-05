/* Write a method printLetters that follows, which accepts a string as its parameter and attempts to print the letters of the string, separated by dashes. For example, the call of printLetters("Rabbit") should print "R-a-b-b-i-t". The initial code shown is incorrect. Correct it to produce the desired behavior. (Your method should print nothing if the empty string "" is passed.)
public static void printLetters(String text) {
    for (int i = 0; i < text.length(); i++) {
        System.out.print(text.charAt(i) + "-");
    }
    System.out.println(); // to end the line of output
}
Call	Output
printLetters("Rabbit")	R-a-b-b-i-t */

public class lab2 {

    public static void main(String[] args) {
        
        printLetters("Leslie is awesome!");

    }

    public static void printLetters(String str){

        System.out.print(str.charAt(0));
        if(str.length() > 0){
            for(int i = 1; i < str.length(); i++){
                System.out.print("-" + str.charAt(i));
            }
        }

    }
}
