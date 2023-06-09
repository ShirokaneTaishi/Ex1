import java.util.Scanner;

class DiceGame{
	
	public static void main(String[] args) {
		int i=1,total=0;
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is your name?");
		name=sc.next();
		System.out.println("Hello, "+name+"!");
		
		System.out.println("Rolling dice...");
		for(i=1;i<3;i++) {
			int j=(int)Math.ceil(Math.random()*6);
			total+=j;
			System.out.println("Dice "+i+": "+j);
		}
		
		System.out.println("Total value: "+total);

		sc.close();

		if(total>7) System.out.println(name+" won!");
		else System.out.println(name+" lost.");

	}
}
