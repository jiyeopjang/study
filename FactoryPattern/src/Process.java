import abstractFactory.CombatFactory;
import abstractFactory.SpaceFactory;
import abstractFactory.StealthFactory;
import abstractFactory.SuitFactory;
import suit.Suit;

public class Process {
	
	static public void main(String[] args){
		/*
		TypeSuitFactory typeSuitFactory = new TypeSuitFactory();
		
		Suit suit1 = typeSuitFactory.createSuit("stealth");
		Suit suit2 = typeSuitFactory.createSuit("space");
		Suit suit3 = typeSuitFactory.createSuit("");
		
		System.out.println(suit1.getName());
		System.out.println(suit2.getName());
		System.out.println(suit3.getName());
		*/
		
		Suit suit1 = SuitFactory.getSuit(new CombatFactory());
		Suit suit2 = SuitFactory.getSuit(new SpaceFactory());
		Suit suit3 = SuitFactory.getSuit(new StealthFactory());
		
		System.out.println(suit1.getName());
		System.out.println(suit2.getName());
		System.out.println(suit3.getName());
		
		
		/**
		 * 출력결과 
		 * CombatSuit
		 * SpaceSuit
		 * StealthSuit
		*/
	}

}
