package javaExampleProject;

public class RemoveSpace {

	public static void main(String[] args) {
		String string="Jyoti prakash sahoo";
		String stringOne=string.replaceAll(" ", "");
		String stringTwo=string.replaceAll("\\s", "");//both are correct
		System.out.println(stringOne+"  "+stringTwo);
	}

}
