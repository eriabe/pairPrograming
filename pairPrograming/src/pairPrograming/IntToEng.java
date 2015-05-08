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
    	String answer = "";
    	String[] first = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	String[] second1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	String[] second2 = {"","","twenty", "thirty", "forty", "fifty", "sixth", "seventy", "eighty", "ninety"};
    	
    	if(n/100 > 0){//100~999
    		if((n%100)==0){
    			answer = first[n/100]+"hundred";
    		}else if((n%100)%10==0){
    			answer = first[n/100]+"hundred "+second2[(n%100)/10];
    		}else{
    		answer = first[n/100]+"hundred "+second2[(n%100)/10] +" "+first[(n%100)%10];
    		}
    	} else if (n/10 == 1) {//10~19
    		answer = second1[n%10];
    	} else if (n/10 > 1) {//20~90
    		answer = second2[n/10] +" " +first[n%10];
      	}else if (n/10 == 0) {//0~9
    		answer = first[n];
    	} else {   		
    		answer = "";
    	}
        return answer;
    }
}

