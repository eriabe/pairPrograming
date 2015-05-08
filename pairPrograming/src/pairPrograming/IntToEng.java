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
    	if(n/100 > 0){//100~999
    		return third(n);
    	} else if (n/10 > 0) {
    		return second(n); 		
    	} else {
    		return first(n);
    	}
    }
    static String first(int n) {
    	String[] first = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	return first[n];   
    }
    static String second(int n) {
    	String[] second1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    	String[] second2 = {"","","twenty", "thirty", "forty", "fifty", "sixth", "seventy", "eighty", "ninety"};
    	if (n/10 == 1) {//10~19
    		return  second1[n%10];
    	} else if (n/10 > 1) {//20~90
    		if (n%10 == 0) {
    			return second2[n/10];
    		}else{
    		return second2[n/10] +" " +first(n%10);}
    	} else {   		
    		return first(n%10);
    	}
    }
    static String third(int n) {
    	if((n%100)==0){
			return first(n/100)+"hundred";
		}else{
			return first(n/100)+"hundred "+second(n%100);
		}
    }
}

