package javaExampleProject.OopsDemo;

class Animal {
}

class Monkey extends Animal {
}

public class OverloadingDemo6 {
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey Version");
	}

	public static void main(String arg[]) {
		OverloadingDemo6 t = new OverloadingDemo6();
		Animal a = new Animal();
		t.m1(a);
//Animal Version
		Monkey m = new Monkey();
		t.m1(m);
//Monkey Version
		Animal a1 = new Monkey();//early binding or compile time polymerphism
		t.m1(a1);
//Animal Version
	}
}
