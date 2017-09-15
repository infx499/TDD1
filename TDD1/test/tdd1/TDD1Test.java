/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author justin
 */
public class TDD1Test {

    public TDD1Test() {
    }

    @BeforeClass
    public static void setUpClass() {
        Robot peter = new Robot();
        peter.setname("Peter");
        peter.setwalk(1);
        peter.setrun(4);
        peter.setskip(2);
        peter.setjump(3);
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TDD1.
     */
    @Test
    public void testMain() {

    }

    public void testWalk() {
        assertTrue(peter.getA().equals(0));
        assertTrue(peter.getB().equals(0));
        peter.setaction("walk");
        peter.go();
        if (peter.getA() > 1) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
        if (peter.getA() < 1) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }

    }

    public void testRun() {
        assertTrue(peter.getA().equals(0));
        assertTrue(peter.getB().equals(0));
        peter.setaction("run");
        peter.go();
        if (peter.getA() > 4) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
        if (peter.getA() < 4) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
    }

    public void testSkip() {
        assertTrue(peter.getA().equals(0));
        assertTrue(peter.getB().equals(0));
        peter.setaction("skip");
        peter.go();
        if (peter.getA() > 2) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
        if (peter.getA() < 2) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
    }

    public void testSkip() {
        assertTrue(peter.getA().equals(0));
        assertTrue(peter.getB().equals(0));
        peter.setaction("skip");
        peter.go();
        if (peter.getA() > 2) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
        if (peter.getA() < 2) {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }
    }

    public void testAction() {
        if (peter.getaction() != "walk" || "run" || "skip" || "jump") {
            assertTrue(peter.getposition().isEqual(Float.Nan));

        }

    }
}
