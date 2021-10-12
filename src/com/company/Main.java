package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Wall height (metres) :");
        float height = Float.parseFloat(myObj.nextLine());
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Wall width (metres) :");
        float width = Float.parseFloat(myObj2.nextLine());
        float dim = height*width;
        // 1 tin paints 5m^2

        System.out.println("How many tins of paint?: " + dim/5 );
        Scanner myObj3 = new Scanner(System.in);
        System.out.print("Cost of tin (GBP): ");
        float cost = Float.parseFloat(myObj3.nextLine());
        float cost_materials = dim/5 * cost;
        System.out.println("Cost of materials: £" + cost_materials);
        Scanner myObj4 = new Scanner(System.in);
        System.out.println("Painter's hourly rate (GBP)? :");
        float rate = Float.parseFloat(myObj4.nextLine());
        // painter paints 5m^2 per hour
        float painter_cost = rate*dim/5;
        float total_cost = painter_cost + cost_materials;

        String message="";

        if (total_cost<15) {
            message= "Fairly cheap you're only paying " + total_cost;
        } else if (total_cost>=15 && total_cost<=40) {
            message= "Okay it's getting spenny you're paying " +total_cost;
        } else {
            message= "Mate you have to be rich or else you can't afford this amount " + total_cost;
        }
        System.out.println(message);
    }
}





















