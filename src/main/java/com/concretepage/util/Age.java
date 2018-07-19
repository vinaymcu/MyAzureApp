package com.concretepage.util;

 interface Age1 {

    int x = 21;
    void getAge();
}


public class Age
{
    public static void main(String[] args) {

        System.out.println("Hello Test");
        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age1 oj1 = new Age1() {
            @Override
            public void getAge() {
                // printing  age
                System.out.print("Age is "+x);
            }
        };
        oj1.getAge();
    }
}
