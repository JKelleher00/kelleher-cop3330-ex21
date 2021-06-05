package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Porblem21 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of the month ");
        int n = a.nextInt();
        String mnth = "";
        switch(n){
            case 1:
                mnth = "January";
                break;
            case 2:
                mnth = "February";
                break;
            case 3:
                mnth = "March";
                break;
            case 4:
                mnth = "April";
                break;
            case 5:
                mnth = "May";
                break;
            case 6:
                mnth = "June";
                break;
            case 7:
                mnth = "July";
                break;
            case 8:
                mnth = "August";
                break;
            case 9:
                mnth = "September";
                break;
            case 10:
                mnth = "October";
                break;
            case 11:
                mnth = "November";
                break;
            case 12:
                mnth = "December";
                break;
        }
        System.out.println("The name of the month is "+mnth);
    }
}
