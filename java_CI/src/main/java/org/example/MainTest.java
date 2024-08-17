package main.java.org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("第一次测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("第一次测试结束");
    }

    @Test
    public void testAdd() {
        int addsum = 4+2;
        assert addsum == 6;
        System.out.println("持续集成第一次测试");
    }

    @Test
    public void main() {
        System.out.println("第一次测试");
    }
}