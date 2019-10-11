package javaExampleProject.OopsDemo;

class con{
	con(){
		this(10);
		System.out.println("no arg parent class");
	}
	con(int i){
		System.out.println("int arg");
	}
	con(String s){
		System.out.println("String arg parent class");
	}
}


public class ConstractorDemo extends con {
	ConstractorDemo(){
		System.out.println("no arg child class");
	}
	ConstractorDemo(String s){
		System.out.println("string arg child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstractorDemo c=new ConstractorDemo();
		ConstractorDemo d=new ConstractorDemo("chiku");
		
		
	}

}
