
public class Exercise03_24 {

	public static void main(String[] args) {
		int deck = (int)(Math.random() * 52);
		int suit = deck / 13;
		int rank = deck % 13;
		System.out.print("The card you picked is ");
		
		switch(suit) {
		case 0:System.out.print("Ace of ");break;
		case 1:System.out.print("2 of ");break;
		case 2:System.out.print("3 of ");break;
		case 3:System.out.print("4 of ");break;
		case 4:System.out.print("5 of ");break;
		case 5:System.out.print("6 of ");break;
		case 6:System.out.print("7 of ");break;
		case 7:System.out.print("8 of ");break;
		case 8:System.out.print("9 of ");break;
		case 9:System.out.print("10 of ");break;
		case 10:System.out.print("Jack of ");break;
		case 11:System.out.print("Quenn of ");break;
		case 12:System.out.print("King of ");
		}
		
		switch(suit) {
		case 0:System.out.print("Clubs");break;
		case 1:System.out.print("Diamonds");break;
		case 2:System.out.print("Hearts");break;
		case 3:System.out.print("Spades");
		}
		

	}

}
