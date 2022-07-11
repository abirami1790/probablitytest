package com.tw.probability;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProbabilityTest {

    @Test
    public void setup() {
        Assertions.assertEquals(0, 0);
    }

    @Test
    public void GivenFairCoinTossedOnce_ProbabilityOfHeadsAndTailsIsEqual() {
        ProbabilityEvent eventA = new ProbabilityEvent(1,2);
        ProbabilityEvent eventB = new ProbabilityEvent(1,2);

        ProbabilityEvent[] ObjEv=new ProbabilityEvent[2];
        ObjEv[0]=eventA;
        ObjEv[1]=eventB;
//        boolean result=eventA.compareProbability(ObjEv[0],ObjEv[1]);
//        Assertions.assertTrue(result);
    }
    @Test
    public void GivenFairCoinTossedOnce_ProbabilityOfHeadsAndTailsIsEqual_GivenHeadProbablityIsZero () {
        ProbabilityEvent eventA = new ProbabilityEvent(1,2);
        ProbabilityEvent eventB = new ProbabilityEvent(1,2);

        /*ProbabilityEvent[] ObjEv=new ProbabilityEvent[2];
        ObjEv[0]=eventA;
        ObjEv[1]=eventB;
        boolean result=eventA.compareProbability(ObjEv[0],ObjEv[1]);
        Assertions.assertTrue(result);*/
        Assertions.assertEquals(true,eventA);
    }

    @Test
    public void testCompareProbability(){
        ProbabilityEvent probabilityOfHead = new ProbabilityEvent(2,1);
        ProbabilityEvent probabilityOfTail = new ProbabilityEvent(2,1);
        Assertions.assertTrue(probabilityOfHead.equals(probabilityOfTail));
        Assertions.assertTrue(probabilityOfTail.equals(probabilityOfHead));
        Assertions.assertTrue(probabilityOfHead.equals(probabilityOfHead));
        Assertions.assertTrue(probabilityOfTail.equals(probabilityOfTail));

        ProbabilityEvent probabilityOfHHin2Toss = new ProbabilityEvent(4,1);
        Assertions.assertFalse(probabilityOfTail.equals(probabilityOfHHin2Toss));
        Assertions.assertFalse(probabilityOfHHin2Toss.equals(probabilityOfTail));
    }
}
