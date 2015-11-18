public class Birthday{

	public static void main(String[] args){
	
		System.out.println("\nI hear it's your birthday!\n");
		hold(2000);
		
		String input = "Nope, not my birthday. But it is my friend's birthday!";
		typeOut(input);
		hold(2000);
		
		System.out.println("\nOh, your friend's birthday? Which friend?");
		hold(2000);
		
		System.out.print(">>ENTER FRIEND: ");
		hold(500);
		typeOut("Kate");
		hold(2000);
		
		System.out.println("\nIt's Kate's birthday? Cool, did not know that. How old is Kate?");
		hold(2500);
		
		System.out.print(">>ENTER AGE: ");
		hold(500);
		typeOut("24");
		hold(1500);
		
		System.out.println("\n... I mean, that's still kinda young? That's like, a year for \nevery hour Jack Bauer works.\n");
		hold(2500);
		
		input = "I'm 24 too, you know.";
		typeOut(input);
		hold(2000);
		
		System.out.println("\nOh, well, that's kind of embarrassing... for me, I mean! It's good \nto be 24, you know?\n");
		hold(2500);
		
		input = "Honestly, it's not that bad. Or that old, either.";
		typeOut(input);
		hold(2000);
		
		System.out.println("\nTomato, tomahto. You and Kate seem pretty ancient. You'll just have \nto both enjoy being OLD AF\n");
		hold(2500);
		
		input = "24 years is a lot longer than I expect this program to last.";
		typeOut(input);
		hold(2000);
		
		System.out.println();
		for (int i = 0; i < 3; i++){
			System.out.print(".");
			hold(500);
		}
		System.out.print(" Damn. That's harsh.\n\n");
		hold(2000);
		
		input = "To be fair, you kind of deserved it.";
		typeOut(input);
		hold(2000);
		
		System.out.println("\nRight, well, on that note. I'm just gonna... you know, terminate \nmyself. But tell your friend Kate happy birthday, all right?\n");
		hold(2000);
		
		input = "Right then. HAPPY BIRTHDAY, KATE!!!!";
		typeOut(input);
		hold(2000);
		
		System.out.println("\n>>QUIT PROGRAM");
		hold(2000);
		
		System.exit(0);
		
	}
	
	public static void typeOut(String input){
		
		for (int i = 0; i < input.length(); i++){
			System.out.print(input.charAt(i));
			try {
				Thread.sleep(75);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.println();
		
	}
	
	public static void hold(int val){
		
		try {
			Thread.sleep(val);
		} catch (InterruptedException ex){
			Thread.currentThread().interrupt();
		}
		
	}

}