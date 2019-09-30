package javaExampleProject.StringDemo;

class Rectangle{
	float length,bredth;
	Rectangle(int l,int b){
		this.length=l;
		this.bredth=b;
	}
	public String toString() {
		return "length="+length+"breadth="+bredth;
	}
}

public class toStringOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle(4,7);
		System.out.println(obj);
	}

}
