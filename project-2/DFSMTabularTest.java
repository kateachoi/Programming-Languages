import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DFSMTabularTest {
    DFSMTabular dfsm;

    @Before
    public void setUp() throws Exception {
        dfsm = new DFSMTabular();
    }

    @Test
    public void test1() { assertTrue(dfsm.checkWord("CGG")); }

    @Test
    public void test2() { assertTrue(dfsm.checkWord("ACGG")); }

    @Test
    public void test3() { assertTrue(dfsm.checkWord("CGGA")); }

    @Test
    public void test4() { assertTrue(dfsm.checkWord("ACGGA")); }

    @Test
    public void test5() { assertTrue(dfsm.checkWord("TATAT")); }

    @Test
    public void test6() { assertTrue(dfsm.checkWord("TATATAT")); }

    @Test
    public void test7() { assertTrue(dfsm.checkWord("TATATATAT")); }

    @Test
    public void test8() { assertFalse(dfsm.checkWord("CG")); }

    @Test
    public void test9() { assertFalse(dfsm.checkWord("CGGAA")); }

    @Test
    public void test10() { assertFalse(dfsm.checkWord("ACGA")); }

    @Test
    public void test11() { assertFalse(dfsm.checkWord("TA")); }

    @Test
    public void test12() { assertFalse(dfsm.checkWord("TAT")); }

    @Test
    public void test13() { assertFalse(dfsm.checkWord("TATA")); }

    @Test
    public void test14() { assertFalse(dfsm.checkWord("GTATAT")); }

    @Test
    public void test15() { assertFalse(dfsm.checkWord("TATATATATC")); }

    @Test
    public void test16() { assertFalse(dfsm.checkWord("AAAAAA")); }

    @Test
    public void test17() { assertFalse(dfsm.checkWord("CCTACA")); }

    @Test
    public void test18() { assertFalse(dfsm.checkWord("TTTTAATT")); }



}