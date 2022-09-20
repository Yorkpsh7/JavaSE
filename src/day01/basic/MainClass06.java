package day01.basic;


/* [[참조형 데이터형]]
 * String 형
 *  - 선언하는 방법
 *  	String 변수명;
 *  - 문자열을 저장할 수 있다. 
 * 
 * 기본형 8개 - boolean, char, byte, short, int, long, float, double
 * 
 * 참조형은 기본형을 재외한 모든 클래스
 * 
 * 대문자 시작하는건 다 참조형
 * 
 * h e l l o
 * 0 1 2 3 4 >인덱스번호
 * 
 * 
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {

		
		//변수 선언과 동시에 값대입하기
		String str = "서울 특별시 서대문구 신촌";
		boolean isContain = str.contains("특별시");  //isCotain cotains와 같은지 안같은지 true or flase 돌려줌
		if(isContain) {  // true 여서실행
			System.out.println("str에는 특별시 라는 문자열이 있어요!");
			
		}
		System.out.println("4번째 인덱스" + str.charAt(3));  //charAt(3) 3번째인데스에 있는 문자를 가지고 와주세요
		
		//변수에 저장된 내용을 문자열로 출력해보기
		System.out.println(str);
		
	}
	
	
}
