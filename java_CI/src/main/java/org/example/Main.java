package org.example;

public class Main {

    @Test
    public void testAdd(){
        int addsum = 4+2;
        assert addsum == 6;
        System.out.println("持续集成第一次测试");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}