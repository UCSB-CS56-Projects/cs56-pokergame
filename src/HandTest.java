import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * The test class HandTest, to test the Hand class
 *
 * @author Joey Dewan
 * @version CS56, Spring 2012, 
 * @see Hand
 */
 
 public class HandTest
 {
 	
 	/**
 		test method getHighCardValue from Hand class
 	*/
 
	@Test public void testGetHighCard()
	{
		Card card1=new Card(2,"S");
		Card card2=new Card(3,"H");
		Card card3=new Card(4,"S");
		Card card4=new Card(5,"S");
		Card card5=new Card(6,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.getHighCardValue(),6);
	}
	
	/**
		test method isStraight() from Hand class
	*/
	
	@Test public void testIsStraight()
	{
		Card card1=new Card(2,"S");
		Card card2=new Card(3,"H");
		Card card3=new Card(4,"S");
		Card card4=new Card(5,"S");
		Card card5=new Card(6,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isStraight(),true);
	}
	
	/**
		test method isStraightFlush() in Hand class
	*/
	
	@Test public void testIsStraightFlush()
	{
		Card card1=new Card(2,"S");
		Card card2=new Card(3,"S");
		Card card3=new Card(4,"S");
		Card card4=new Card(5,"S");
		Card card5=new Card(6,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isStraightFlush(),true);
	}
	
	/**
		test method isFourOfAKind() in Hand class
	*/
	
	@Test public void testIsFourOfAKind()
	{
		Card card1=new Card(2,"S");
		Card card2=new Card(2,"H");
		Card card3=new Card(4,"S");
		Card card4=new Card(2,"D");
		Card card5=new Card(2,"C");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isFourOfAKind(),true);
		assertEquals(hand.isThreeOfAKind(),false);
		assertEquals(hand.isTwoPair(),false);
	}
	
	/**
		test method isFullHouse() in Hand class
	*/
	
	@Test public void testIsFullHouse()
	{
		Card card1=new Card(2,"S");
		Card card2=new Card(4,"H");
		Card card3=new Card(4,"S");
		Card card4=new Card(2,"D");
		Card card5=new Card(2,"C");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isFullHouse(),true);
	}
	
	/**
		test method isFlush() in Hand class
	*/
	
	@Test public void testIsFlush()
	{
		Card card1=new Card(7,"S");
		Card card2=new Card(3,"S");
		Card card3=new Card(4,"S");
		Card card4=new Card(11,"S");
		Card card5=new Card(5,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isFlush(),true);
		assertEquals(hand.isStraightFlush(),false);
	}
	
	/**
		test method isThreeOfAKind() in Hand class
	*/
	
	@Test public void testIsThreeOfAKind()
	{
		Card card1=new Card(3,"D");
		Card card2=new Card(3,"H");
		Card card3=new Card(4,"C");
		Card card4=new Card(3,"S");
		Card card5=new Card(5,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isThreeOfAKind(),true);
	}
	
	/**
		test method isTwoPair() in Hand class
	*/
	
	@Test public void testIsTwoPair()
	{
		Card card1=new Card(3,"D");
		Card card2=new Card(3,"H");
		Card card3=new Card(4,"C");
		Card card4=new Card(6,"S");
		Card card5=new Card(4,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isTwoPair(),true);
		assertEquals(hand.isOnePair(),false);
	}
	
	/**
		test method isOnePair() in Hand class
	*/
	
	@Test public void testIsOnePair()
	{
		Card card1=new Card(3,"D");
		Card card2=new Card(11,"H");
		Card card3=new Card(4,"C");
		Card card4=new Card(3,"S");
		Card card5=new Card(5,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(hand.isOnePair(),true);
	}
	
	/**
		test method sameHand() for one pair in Hand class
	*/
	
	@Test public void testSameHandOnePair1()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(11,"H");
		Card card3=new Card(4,"C");
		Card card4=new Card(10,"S");
		Card card5=new Card(6,"S");
		
		Card card11=new Card(3,"D");
		Card card22=new Card(12,"H");
		Card card33=new Card(4,"C");
		Card card44=new Card(3,"S");
		Card card55=new Card(5,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}
	
	/**
		test method sameHand() for one pair in Hand class
	*/
	
	@Test public void testSameHandOnePair2()
	{
		Card card1=new Card(9,"D");
		Card card2=new Card(11,"H");
		Card card3=new Card(4,"C");
		Card card4=new Card(9,"S");
		Card card5=new Card(6,"S");
		
		Card card11=new Card(9,"D");
		Card card22=new Card(12,"H");
		Card card33=new Card(4,"C");
		Card card44=new Card(9,"S");
		Card card55=new Card(5,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),0);
	}
	
	/**
		test method sameHand() for two pair in Hand class
	*/
	
	@Test public void testSameHandTwoPair1()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(11,"H");
		Card card3=new Card(11,"C");
		Card card4=new Card(10,"S");
		Card card5=new Card(6,"S");
		
		Card card11=new Card(10,"D");
		Card card22=new Card(12,"H");
		Card card33=new Card(10,"C");
		Card card44=new Card(3,"S");
		Card card55=new Card(3,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}
	
	/**
		test method sameHand() for two pair in Hand class
	*/
	
	@Test public void testSameHandTwoPair2()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(11,"H");
		Card card3=new Card(11,"C");
		Card card4=new Card(10,"S");
		Card card5=new Card(6,"S");
		
		Card card11=new Card(11,"D");
		Card card22=new Card(12,"H");
		Card card33=new Card(11,"C");
		Card card44=new Card(3,"S");
		Card card55=new Card(3,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(1, hand.sameHand(otherHand));
	}
		
	/**
		test method sameHand() for straight in Hand class
	*/
	
	@Test public void testSameHandStraight1()
	{
		Card card1=new Card(2,"D");
		Card card2=new Card(3,"H");
		Card card3=new Card(4,"C");
		Card card4=new Card(5,"S");
		Card card5=new Card(6,"S");
		
		Card card11=new Card(5,"D");
		Card card22=new Card(6,"H");
		Card card33=new Card(7,"C");
		Card card44=new Card(8,"S");
		Card card55=new Card(9,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),0);
	}
	
	/**
		test method sameHand() for straight in Hand class
	*/
	
	@Test public void testSameHandStraight2()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(11,"H");
		Card card3=new Card(12,"C");
		Card card4=new Card(13,"S");
		Card card5=new Card(14,"S");
		
		Card card11=new Card(5,"D");
		Card card22=new Card(6,"H");
		Card card33=new Card(7,"C");
		Card card44=new Card(8,"S");
		Card card55=new Card(9,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}
	
	/**
		test method sameHand() for full house in Hand class
	*/
	
	@Test public void testSameHandFullHouse1()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(10,"H");
		Card card3=new Card(10,"C");
		Card card4=new Card(13,"S");
		Card card5=new Card(13,"C");
		
		Card card11=new Card(5,"D");
		Card card22=new Card(5,"H");
		Card card33=new Card(5,"C");
		Card card44=new Card(8,"S");
		Card card55=new Card(8,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}

	/**
		test method sameHand() for full house in Hand class
	*/
	
	@Test public void testSameHandFullHouse2()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(10,"H");
		Card card3=new Card(10,"C");
		Card card4=new Card(13,"S");
		Card card5=new Card(13,"C");
		
		Card card11=new Card(14,"D");
		Card card22=new Card(14,"H");
		Card card33=new Card(14,"C");
		Card card44=new Card(8,"S");
		Card card55=new Card(8,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),0);
	}
	
	/**
		test method sameHand() for three of a kind in Hand class
	*/
	
	@Test public void testSameHandThreeOfAKind1()
	{
		/*Card card1=new Card(10,"D");
		Card card2=new Card(10,"H");
		Card card3=new Card(10,"C");
		Card card4=new Card(11,"S");
		Card card5=new Card(13,"C");
		
		Card card11=new Card(14,"D");
		Card card22=new Card(14,"H");
		Card card33=new Card(14,"C");
		Card card44=new Card(9,"S");
		Card card55=new Card(8,"H");
		*/
		
		
		Card card1=new Card(12,"H");
		Card card2=new Card(7,"D");
		Card card3=new Card(14,"D");
		Card card4=new Card(12,"C");
		Card card5=new Card(12,"S");
		
		Card card11=new Card(12,"H");
		Card card22=new Card(7,"D");
		Card card33=new Card(12,"C");
		Card card44=new Card(2,"C");
		Card card55=new Card(12,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(1,hand.sameHand(otherHand));
	}
	
	
	
	@Test public void testIsThreeOfAKind2()
	{
		Card card1=new Card(12,"H");
		Card card2=new Card(7,"D");
		Card card3=new Card(14,"D");
		Card card4=new Card(12,"C");
		Card card5=new Card(12,"S");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		assertEquals(false, hand.isTwoPair());
		
		Card card11=new Card(12,"H");
		Card card22=new Card(7,"D");
		Card card33=new Card(12,"C");
		Card card44=new Card(2,"C");
		Card card55=new Card(12,"S");
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(otherHand.isThreeOfAKind(),true);
	}
	
	/**
		test method sameHand() for three of a kind in Hand class
	*/
	
	@Test public void testSameHandThreeOfAKind2()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(10,"H");
		Card card3=new Card(10,"C");
		Card card4=new Card(11,"S");
		Card card5=new Card(13,"C");
		
		Card card11=new Card(9,"D");
		Card card22=new Card(9,"H");
		Card card33=new Card(9,"C");
		Card card44=new Card(5,"S");
		Card card55=new Card(8,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}
	
	/**
		test method sameHand() for four of a kind in Hand class
	*/
	
	@Test public void testSameHandFourOfAKind1()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(10,"H");
		Card card3=new Card(10,"C");
		Card card4=new Card(10,"S");
		Card card5=new Card(13,"C");
		
		Card card11=new Card(9,"D");
		Card card22=new Card(9,"H");
		Card card33=new Card(9,"C");
		Card card44=new Card(9,"S");
		Card card55=new Card(8,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}
	
	/**
		test method sameHand() for four of a kind in Hand class
	*/
	
	@Test public void testSameHandFourOfAKind2()
	{
		Card card1=new Card(10,"D");
		Card card2=new Card(10,"H");
		Card card3=new Card(10,"C");
		Card card4=new Card(10,"S");
		Card card5=new Card(13,"C");
		
		Card card11=new Card(14,"D");
		Card card22=new Card(14,"H");
		Card card33=new Card(14,"C");
		Card card44=new Card(14,"S");
		Card card55=new Card(8,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),0);
	}

	/**
		test method sameHand() for straight flush in Hand class
	*/
	
	@Test public void testSameHandStraightFlush1()
	{
		Card card1=new Card(2,"D");
		Card card2=new Card(3,"D");
		Card card3=new Card(4,"D");
		Card card4=new Card(5,"D");
		Card card5=new Card(6,"D");
		
		Card card11=new Card(5,"H");
		Card card22=new Card(6,"H");
		Card card33=new Card(7,"H");
		Card card44=new Card(8,"H");
		Card card55=new Card(9,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),0);
	}
	
	/**
		test method sameHand() for straight flush in Hand class
	*/
	
	@Test public void testSameHandStraightFlush2()
	{
		Card card1=new Card(6,"D");
		Card card2=new Card(7,"D");
		Card card3=new Card(8,"D");
		Card card4=new Card(9,"D");
		Card card5=new Card(10,"D");
		
		Card card11=new Card(5,"H");
		Card card22=new Card(6,"H");
		Card card33=new Card(7,"H");
		Card card44=new Card(8,"H");
		Card card55=new Card(9,"H");
		Hand hand=new Hand(card1,card2,card3,card4,card5);
		Hand otherHand=new Hand(card11,card22,card33,card44,card55);
		assertEquals(hand.sameHand(otherHand),1);
	}
        
        
        @Test public void testCompareFourOfAKind()
	{
		Card card1=new Card(12,"D");
		Card card2=new Card(12,"H");
		Card card3=new Card(14,"C");
		Card card4=new Card(12,"S");
		Card card5=new Card(3,"S");
		
		Card card11=new Card(11,"H");
		Card card22=new Card(14,"H");
		
		Card card33=new Card(12,"C");
		Card card44=new Card(7,"S");
		
		Hand dealerHand=new Hand(card1,card2,card3,card4,card5);
		
		Hand player1=new Hand(card11,card22);
		Hand player2 = new Hand(card33,card44);
		Hand best1 = player1.getBestHand(dealerHand);
		Hand best2 = player2.getBestHand(dealerHand);
		assertEquals(best2.isFourOfAKind(),true);
		assertEquals(false, best2.isThreeOfAKind());
		assertEquals(false, best2.isTwoPair());
		assertEquals(false, best1.isFourOfAKind());
		assertEquals(true, best1.isFullHouse());
		assertEquals(1, best2.compareHands(best1));
		
		///assertEquals(expected, actual);
	}

}
 