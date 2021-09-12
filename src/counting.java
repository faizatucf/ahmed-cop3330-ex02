/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Faiz Ahmed
 */

import java.util.*;

class counting
{
    public static void main(String[] args)
    {
        String output;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the input string?"); 
        output = sc.nextLine(); //Taking user input
        //Formatting output in single output statement
        System.out.println(String.format("%s has %d characters.",output,output.length()));
    }
}
