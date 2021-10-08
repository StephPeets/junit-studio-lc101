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
    public void balancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void unbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoOpenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoClosedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void nonEmptyStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void stringEnclosedInBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[inBrackets]"));
    }


    @Test
    public void evenOpenOneCloseReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[brac[kets]"));
    }

    @Test
    public void evenCloseOneOpenReturnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("[onetwothr]eefour]"));
    }

    @Test
    public void twoBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[one]two[threefour]"));
    }

    @Test
    public void twoUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]one]two[threefour["));
    }

    @Test
    public void threeBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[one]two[three][four]"));
    }

    @Test
    public void threeUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]one]two][[threefour["));
    }


    @Test
    public void oddNumOfMostlyUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]o]e]tw][[o][[[[[[[t]]]hr]]]eef][[[our["));
    }

    @Test
    public void evenNumOfMostlyUnbalancedBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]o]e]tw][[o][[[[[[[t]]]hr]]]eef][[[our[["));
    }                                            

    @Test
    public void manyBalancedBracketsSetReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[o]e]tw][[o]][[[[[[t]]]hr]]]eef[][[our]"));
    }   
    
 
     
}
