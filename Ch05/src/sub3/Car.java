package sub3;

public class Car {
	
	private String name;
	private String color;
	private int speed;
	
	// 클래스변수(정적변수) public 선언
	public static int count;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	//클래스 메서드(정적 메서드)-클래스 변수를 정의하는 메서드
	public static int getCount() {
		return count;
	}
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}
}
