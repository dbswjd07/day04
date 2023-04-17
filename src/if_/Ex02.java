package if_;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	/*
	 if,  else if 또는 else 중 하나만 실행된다.
	 if(조건식){
	 	종속문장
	 }else if(조건식){
	 	종속문장
	 }else if(조건식)
	 ...
	 else{
	 	종속문장
	 }
	 */
	
	Scanner input = new Scanner (System.in);
	int num, cost=0;
//	System.out.println("수 입력");
//	num = input.nextInt();
//	if(num > 100) {
//		System.out.println("100보다 크다");
//	}else if(num > 50) {
//		System.out.println("50보다 크다");
//	}else if(num > 30) {
//		System.out.println("30보다 크다");
//	}else {
//		System.out.println("30과 같거나 작은 수");
//	}
//	System.out.println("다음 문장들 실행~");
	
	
	/* 
	 * 커피의 개당 가격은 2000원이다. 10개 초과하면 초과하는 양에 대해서만 개당 1500원씩 받는다.
	 * 커피의 개수를 입력 받아 금액 출력
	*/
	
//	System.out.print("커피 개수 입력: ");
//	num = input.nextInt();
//	if(num>10)
//	{	
//		cost = (10*2000)+((num-10)*1500);
//		System.out.println("커피값: "+cost);
//		
//	}else
//	{
//		cost = num*2000;
//		System.out.println("커피값: "+cost);
//	}
	
	int money = 0;
	System.out.println("커피 개수 입력");
	num = input.nextInt();
	if(num <= 10) {
		money = num * 2000;
	}
	else {
		money = (10*2000)+((num-10)*1500);
	}
	
	System.out.println(num + "개 값: "+money);
}
}
