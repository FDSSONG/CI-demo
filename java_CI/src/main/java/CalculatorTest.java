package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("第一次测试");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("第一次测试");
    }

    @Test
    public void add() {
        System.out.println("第一次测试");
    }

    @Test
    public void subtract() {
        System.out.println("第一次测试");
    }
}