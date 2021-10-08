package test;

import org.junit.Test;

import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void balancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void wrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoClosedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringEnclosedInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[inBrackets]"));
    }

    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void singleCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void evenOpenOddCloseReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[brac[kets]"));
    }

    @Test
    public void evenCloseOddOpenReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[onetwothr]eefour]"));
    }


    @Test
    public void twoBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[one]two[threefour]"));
    }

    @Test
    public void twoUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]one]two[threefour["));
    }

    @Test
    public void threeBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[one]two[three][four]"));
    }

    @Test
    public void threeUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]one]two][[threefour["));
    }


    @Test
    public void oddNumOfMostlyUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]o]e]tw][[o][[[[[[[t]]]hr]]]eef][[[our["));
    }

    @Test
    public void evenNumOfMostlyUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]o]e]tw][[o][[[[[[[t]]]hr]]]eef][[[our[["));
    }                                            

    @Test
    public void manyBalancedBracketsSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[o]e]tw][[o]][[[[[[t]]]hr]]]eef[][[our]"));
    }   
    
    @Test
    public void largeNumBracketsAllUnbalancedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]]]]]]]]][[[[[[[[[[[[[[[["));
    } 

    public void largeNumBracketsAllBalancedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]"));
    } 
    
     
}
