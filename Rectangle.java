package Session4;

public class Rectangle {
	int l;
	int b;
	
public void area(){
	int A = (this.l)*(this.b);
	System.out.println("The area of rectangle is  " +A);
}
}
 class triangle extends Rectangle{
	 public void area(){
		 int A1 = (this.l)*(this.b)/2 ;
		 System.out.println("The area of triangle is "+A1);
	 }
	public static void main(String[] args){
		// assuming the area of traingle is half of the rectangle
		Rectangle r = new Rectangle();
		r.l =5;
		r.b = 4;
		r.area();
		//For triangle a object should be created and it uses the variables which are inherited
		triangle t = new triangle();
		t.l = r.l;
		t.b=r.b;
		t.area();
		
	}
}