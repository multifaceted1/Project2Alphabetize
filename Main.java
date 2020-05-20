package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

	String firstName1 = JOptionPane.showInputDialog("First Name");
	String lastName1 = JOptionPane.showInputDialog("Last Name");
	String ageString1 = JOptionPane.showInputDialog("Age (over 18)");
	int age1 = Integer.parseInt(ageString1);
	char firstInitName1 = firstName1.charAt(0);
	if (age1 < 19) {
	    String secondTry1 = JOptionPane.showInputDialog("Sorry, are you sure that's your age? Try again.");
	    ageString1 = secondTry1;
	}
	String person1 = firstInitName1 + ". " + lastName1 + " " +  age1 + ", ";

	String firstName2 = JOptionPane.showInputDialog("First Name Two");
	String lastName2 = JOptionPane.showInputDialog("Last Name Two");
	String ageString2 = JOptionPane.showInputDialog("Second Age (over 18)");
	int age2 = Integer.parseInt(ageString2);
	char firstInitName2 = firstName2.charAt(0);
	if (age1 < 19) {
	    ageString2 = JOptionPane.showInputDialog("Sorry, are you sure that's your age? Try again.");
	}
	String person2 = firstInitName2 + ". " + lastName2 + " " + ageString2 + ", ";
	if (lastName1.compareTo(lastName2) < 0) {
	    System.out.println(person1.toUpperCase() + person2.toUpperCase());
    } else {
		System.out.println(person2.toUpperCase() + person1.toUpperCase());}









    }
}
