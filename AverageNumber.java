import java.util.Scanner;
import java.util.ArrayList;

class AverageNumber {
    public static void main(String[] args) {

        ArrayList < Integer > num = new ArrayList < Integer > ();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive or negative numbers sparated by space and enter 0 at the end");
        String userInput = scan.nextLine();
        String holder = "";
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) != ' ') {
                holder += userInput.charAt(i);
            }
            if (userInput.charAt(i) == ' ') {
                num.add(Integer.parseInt(holder));
                holder = ""; //https://www.w3schools.com/java/java_arraylist.asp //https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
            }
        }
        double total = 0;
        double ave = 0;
        int countPos = 0;
        int countNeg = 0;
        for (int j = 0; j < num.size(); j++) { //https://www.java67.com/2016/07/how-to-find-length-size-of-arraylist-in-java.html
            if (num.get(j) > 0)
                countPos += 1;
            if (num.get(j) < 0)
                countNeg += 1;
            total += num.get(j); //https://stackoverflow.com/questions/37800875/how-can-i-print-values-and-index-numbers-of-an-arraylist-without-a-loop

        }
        ave = total / num.size();
        System.out.println(num);
        System.out.println("Number of positive numbers: " + countPos);
        System.out.println("Number of negative numbers: " + countNeg);
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + ave);

    }
}