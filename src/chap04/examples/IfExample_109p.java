package chap04.examples;

public class IfExample_109p {
	public static void main(String[] args) {
		int score = 93; 
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}
		
		if (score<=90) 
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");  //IF와 관계없는 실행문
			
	}
}
