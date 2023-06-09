class DiceGame{
	
	public static void main(String[] args) {
		int i=0,total=0;
		
		System.out.println("Rolling dice...");
		for(i=0;i<2;i++) {
			int j=(int)Math.ceil(Math.random()*6);
			total+=j;
			System.out.println("Dice "+i+": "+j);
		}
		
		System.out.println("Total value: "+total);
		if(total>7) System.out.println("You won.");
		else System.out.println("You lost.");
	}
}
