package day7;

public class ClassEx3 {

	public static void main(String[] args) {
		// 클래스 메서드 호출은 클래스명.클래스 메서드명 또는 객체.클래스 메서드명 둘다 가능
		kiaCar.printInfo(); 
		kiaCar c1= new kiaCar();
		// c1.printInfo(); //가능은 하지만 권장하지않음.
		c1.printCarInfo();
		kiaCar.printInfo();
		kiaCar c2 = new kiaCar("뉴그랜버드",6);
		c2.printCarInfo();
		kiaCar.printInfo();
		for(int i=0;i<10;i++){
			c2.speedUp();
			c2.printspeed();
		}
		for(int i = 0;i<20; i++) {
			c2.speedDown();
			c2.printspeed();
		}
	}
}
	//모닝,k3,쏘렌토
class kiaCar {
	//클래스 변수	
	private static String manufacturer = "KIA";
	private static int salesNumber = 0;
	//객체 변수
	int wheel; 
	boolean power;
	int speed;
	String carName;
	String carNum;
	
	//클래스 메소드
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	public static void printInfo() {
		System.out.println("제조사 : " + manufacturer);
		System.out.println("판매량 : " + salesNumber +"대");
	}
	//객체 메소드
		public void turnOn() {
			System.out.println("시동이 켜졌습니다.");
			power = true;
		}	
		public void turnOff() {
			if(speed == 0) {
				System.out.println("시동이 꺼집니다.");
				power = false;
				}
				else {	
					System.out.println("속도가 0이 아니어서 시동을 끌 수 없습니다.");
				}
			}
		public void speedUp() {
			speed++;
		}
		public void speedDown() {
			if(speed > 0)
				speed --;
		}
		public void printspeed() {
			System.out.println("현재주행속도는 "+speed +"km/h입니다.");
		}
		public void printCarInfo() {
			System.out.println("차종 : " + carName);
			System.out.println("바퀴수 : " + wheel);
			printspeed();
		}
		//생성자
		public kiaCar() {
			wheel = 4;
			carName = "미정";
			salesNumber++;
		}
		public kiaCar(String carName, int wheel) {
			/* 멤버 변수의 이름과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다.
			 * 이러한 경우 멤버 변수를 의미하기 위해 변수명앞에 this와 .을 써서 
			 * this. 멤버변수명으로 사용한다. this는 자기자신을 의미하는 객체
			 * */
			this.carName = carName;
			this. wheel = wheel;
		}
		
}
		
	