package day3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

class Card {
	int kind;
	int num;
	
	Card () {}
	Card (int kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	public String toString () {
		return "k=" + kind + ",n=" + num;
	}
}

public class CardTest {
	boolean straightTest(Card[] cardArr) {
		boolean result = true;
		int[] arr = new int[cardArr.length];
		
		for (int i = 0;i <cardArr.length;i++) {
			arr[i] = cardArr[i].num;
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length -1; i++) {
			if (arr[i + 1] - 1 != arr[i]) {
				result = false;
			}
		}
		return result;
	}
	
	@Test
	public void passTest() {
		Card[] card = {
			new Card(1, 1), new Card(1, 2), new Card(1, 3),
			new Card(1, 4), new Card(1, 5)
		};
		assertTrue(straightTest(card));
	}
	@Test
	public void failTest() {
		Card[] card = {
			new Card(1, 1), new Card(1, 3), new Card(1, 2),
			new Card(1, 9), new Card(1, 4)
		};
		assertFalse(straightTest(card));
	}

}
