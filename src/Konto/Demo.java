package Konto;

public class Demo {

	public static void main(String[] args) {
		
		GiroKonto Test = new GiroKonto("Hansi Huber", 100);
		System.out.println(Test.kontostand);
		Test.auszahlen(100);
		System.out.println(Test.kontostand);
		System.out.println("--------");
		
		JugendGiroKonto Test2 = new JugendGiroKonto("David", 100, 500);
		
		Test2.einzahlen(1000);
		System.out.println(Test2.kontostand);
		Test2.auszahlen(600);
		Test2.auszahlen(100);
		System.out.println(Test2.kontostand);
		System.out.println("--------");
		
		SparKonto Test3 = new SparKonto("Matthias");
		
		Test3.einzahlen(200);
		System.out.println(Test3.kontostand);
		Test3.auszahlen(300);
		System.out.println(Test3.kontostand);
		Test3.auszahlen(200);
		System.out.println(Test3.kontostand);
		System.out.println("--------");
	}

}
