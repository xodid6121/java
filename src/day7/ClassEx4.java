package day7;

public class ClassEx4 {

	public static void main(String[] args) {
		student s1 = new student();
		s1.in();
		s1.printInfo();
		student s2 = new student("디지털 컨버전스...자바","이순신");
		s2.in();
		s2.out();
		s2.printInfo();
	}
}
	class student{
	
	//멤버변수
	//학생이름
	private String name; 
	
	//입실여부
	private boolean isEntrance;
	
	//수강과정
	private String course;
	
	//입실시간
	private String inTime;
	//퇴실시간
	private String outTime;
	
	
	

    //멤서 메서드
	//입/퇴실 기능
	public void in() {
		System.out.println(name + "님이 입실 햇습니다.");
		isEntrance = true;
		inTime = "9시";
	}
	public void out() {
		System.out.println(name + "님이 퇴실 햇습니다.");
		isEntrance = false;
		outTime = "18시";
	}
	//학생정보 출력기능
	public void printInfo() {
		System.out.println("과정 : " + course);
		System.out.println("이름 : " + name);
		if(isEntrance) {
			System.out.println("입실중입니다.");
			System.out.println("입실시간 : " + inTime);
			
		}else {
			System.out.println("퇴실시간 :");
			System.out.println("입실시간 : " + inTime);
			System.out.println("퇴실시간 : " + outTime);
		}
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}	

	 
	//생성자
	public student() {
		course = "자바";
		name = "이태양";
	}
	public student(String course, String name) {
		this.course = course;
		this.name = name; 
	}
}



