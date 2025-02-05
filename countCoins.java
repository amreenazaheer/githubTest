/* Write a method named countCoins that accepts as its parameter a Scanner for an input file whose data represents a person's money grouped into stacks of coins. Your method should add up the cash values of all the coins and print the total money at the end. The input consists of a series of pairs of tokens, where each pair begins with an integer and is followed by the type of coin, which will be either "pennies" (1 cent each), "nickels" (5 cents each), "dimes" (10 cents each), or "quarters" (25 cents each), case-insensitively. A given coin might appear more than once on the same line. For example, if the input file contains the following text:
3 pennies 2 quarters 1 pennies 3 nickels 4 dimes
3 pennies are worth 3 cents, and 2 quarters are worth 50 cents, and 1 penny is worth 1 cent, and 3 nickels are worth 15 cents, and 4 dimes are worth 40 cents. The total of these is 1 dollar and 9 cents, therefore your method would produce the following output if passed this input data. Notice that the method should show exactly two digits after the decimal point, so it says 09 for 9 cents:
Total money: $1.09
				
Here is a second example. Suppose the input file contains the following text. Notice the capitalization and spacing:
12   QUARTERS      1   Pennies      33 
PeNnIeS      

  10    niCKELs
Then your method would produce the following output:
Total money: $3.84 */

import java.io.*;
import java.util.*;
public class countCoins {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("bin/money.txt"));
            format(countCoins(input));
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found:" + e.getMessage());
        }
    }

    public static int countCoins(Scanner scanner){
        int total = 0;
        while(scanner.hasNext()){
            int numRn = scanner.nextInt();
            String coin = scanner.next().toLowerCase();
            if(coin.startsWith("p")){
                total += 1 * numRn;
            }
            if(coin.startsWith("n")){
                total += 5 * numRn;
            }
            if(coin.startsWith("d")){
                total += 10 * numRn;
            }
            if(coin.startsWith("q")){
                total += 25 * numRn;
            }
        }
        return total;
    }

    public static void format(int coins){
        double formated = coins/100.00;
        System.out.println("Total money: $" + formated);
    }
}
