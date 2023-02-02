package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ExampleMethods.print("The debugger is super useful for visualizing " +
                "the control flow of our program.");
        System.out.println("Once you have reached this line, the " +
                "print method will have executed.");

        Person tom = new Person("Tom", "Hang");
        System.out.println(tom.getFirstName() + " " + tom.getLastName());
    }

}
