package class_test;

public class FuctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TriAngle tri1 = new TriAngle();
		TriAngle tri1;
		tri1 = new TriAngle();
		//TriAngle 클래스로 tri1 이라는 이름의 객체를 생성
		tri1.bottom = 10;
		tri1.height = 20;
		tri1.color = "red";
		tri1.line_width = 1;
		
		double s = tri1.tri_area();
		System.out.print(s);
		
		TriAngle tri2 = new TriAngle();
		
		tri2.bottom = 100;
		tri2.height = 200;
		tri2.color = "blue";
		tri2.tri_area();
		
		TriAngle tri3 = new TriAngle();
		
		Square squ1 = new Square();
		squ1.height = 10;
		squ1.width = 20;
		squ1.square_area();
		
		
	}

}
