package pairPrograming;
import java.util.Scanner;

public class IntToEng {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String answer;
    	String[] first = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	String[] second1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	String[] second2 = {"ten", "twenty", "thirty", "forty", "fifty", "sixth", "seventy", "eighty", "ninety"};
    	if (n/10 == 0) {
    		answer = first[n];
    	} else if (n/10 == 1) {
    		answer = second1[n%10];
    	} else if (n/10 > 1) {
    		answer = second2[n/10] + first[n%10];
    	} else {
    		answer = "";
    	}
        return answer;
    }
}

