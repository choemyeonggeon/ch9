package com.greedy.section02.abstractclass;

public abstract class  Product {
	
	private int nonStaticField;
	private static int StaticField;
	
	
	public Product() {
		System.out.println("Product의 기본 생성자 호출됨...");
	}



public void printField() {
	System.out.println("nonStaticField :" + nonStaticField);
	System.out.println("staticField :" + StaticField);
	}

public static void staticMethod() {
	System.out.println("Product 클래스의 staticMethod 호출함");
	}

/*추상메소드
 * 구현부(몸체)가 없는 메소드를 의미한다.
 * 추상 메소드가 1개 이상 존재하는 경우 class에 abstract 키워드가 필수이며,
 * 추상 메소드가 0개 이상 존재하는 경우 class에 abstract 키워드 사용가능하다
 * */

public abstract void abstMethod();
}
