
public class Cards {
	
	
	public enum Suit{
		Spades(0),Diamond(1),Heart(2),Club(3),Invalid(4);
		int value;
		private Suit(int c){
			 value = c;
		}
		public Suit getSuitFromValue(int value){
			switch(value){
				case 0: return Suit.Spades;
				case 1: return Suit.Diamond;
				case 2: return Suit.Heart;
				case 3: return Suit.Spades;
				//case default: return Suit.Invalid;
			}
			return Suit.Invalid;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Suit.valueOf("Club"));
		System.out.println(228 % 128);
	}

}
