package com.pak;

public class Test {
    public static void main(String[] args) {
        System.out.println("welcome");
        Test1 test1 = new Test1();
        int sum = test1.getSum(11,11);
        System.out.println("sum:"+sum);
        Test2 test2 = new Test2();
        int sub = test2.getSubstraction(11,10);
        System.out.println("substraction="+sub);
    }
}
