package day2;

import java.util.ArrayList;

// 1. 용량(capacity)를 매개변수로 받아서 지정된 크기의 배열을 생성하는 생성자
	
// 2. 배열의 내용을 String으로 변환하는 toString() 오버라이딩

// 3. 배열에 저장된 객체의 갯수를 반환하는 int size()를 작성

// 3.1 booelan add(Object obj) 지정된 객체를 배열에 저

// 4.int indexof(Object obj) - 지정된 객체가 저장된 위치(index)를 반환하는 메서드

// 5. void remove(Object obj) - 지정된 객체를 찾아서 배열에서 삭제하는 메서드
class ListExample {
	ArrayList array; 
	int capacity;
	
	ListExample (int capacity) {
		this.capacity = capacity;
	}
	// static 을 붙일까 말까 ? iv의 사용 여부
	public String toString () {
		return "";
	}
}