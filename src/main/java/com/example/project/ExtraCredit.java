package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        
        
        
                //COPY AND PASTE YOUR CODE HERE 
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+ cost +"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + '%' +"\n");
        result.append("Total tip: $" + Math.round((cost*((double)percent/100.00))*100.00)/100.00+"\n");
        result.append("Total Bill with tip: $" + Math.round((cost+cost*((double)percent/100))*100.00)/100.00+"\n");
        result.append("Per person cost before tip: $" +Math.round((cost/people)*100.00)/100.00+"\n");
        result.append("Tip per person: $" + Math.round((cost*((double)percent/100)/people)*100.00)/100.00+"\n");
        result.append("Total cost per person: $"+Math.round((((cost+cost*((double)percent/100))/people))*100.00)/100.00+"\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);
         



        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;

        String items= "salmon\npizza\nsalad\nfrench fries\nmilkshake\n";
    
        //Your scanner object and while loop should go here
       

        boolean quit= false;
        Scanner scan = new Scanner(System.in);
        
        while (quit == false)
        {
            System.out.println("Enter an item name or type -1 to finish: ");
            String itemAppend = scan.nextLine();

            if (itemAppend.equals("-1"))
            {
                quit = true;
            }
            else
            {
                items += itemAppend +"\n";
            }
        }

    
        
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
