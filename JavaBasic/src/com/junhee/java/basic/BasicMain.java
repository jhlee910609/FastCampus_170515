package com.junhee.java.basic;
// 사용하고자 하는 클래스가 다른 패ㅣ지에 있을 때는 import로 불러옴 
import com.junhee.java.basicsub.BasicSub;

public class BasicMain {

	public static void main(String args[]) {
		// 1. 객체를 사용하기 
		// 기본형과 사용법이 유사한데.. 메모리를 지정해주기 위해서 new 연산자 사용 
		BasicSub sub = new BasicSub();
		
		// 2.멤버 사용하기 
		// 2.1 변수 
		int aaa = sub.변수이름;
		
		// 2.2 함수 메서드
		sub.함수명();
		
		// 아래와 같이 사용해도 됨.
		// 값을 리턴해주만 별도 저장되진 않음 (
		int bbb = sub.함수명();
		
		
		
		
	}

	class 객체이름 {
		// 1.데이터 타입을 정의한다.

		int 변수이름;
		String 변수이름2;

		// 2. 함수를 정의한다.
		// 리턴타입 함수명 (인자타입 인자이름, 타입2 이름2)
		// 2.1 리타입이 있을 경우
		int 함수명 () {
			
			// 가. 리턴타입을 먼저 정의하고
			// 초기화를 위해 "0" 값 저장 
			int 넘겨줄값 = 0;
			// 나. 로직을 처리하고
			// 작업하고
			// 다. 위에서 정의한 리턴타입의 결과값을 반환한다.
			return 넘겨줄값;
		}
		// 2.2 리턴타입이 없을 경우
		void 함수명2() {
			// 로직 작성
			// 작업
		}
	}
}