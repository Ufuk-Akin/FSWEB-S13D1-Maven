package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        System.out.println("-------------------");

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("-------------------");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Width : ");
        double width = sc.nextDouble();

        System.out.println("Enter a Height : ");
        double height = sc.nextDouble();

        System.out.println("----------------------");


        System.out.println("Enter a Radius : ");
        double radius = sc.nextDouble();


        System.out.println(area(width, height));
        System.out.println(area(radius));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock<0 || clock>23 || !isBarking) {
            return false;
        }

        return clock < 8 || clock >= 20;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return  (13 < firstAge && firstAge <= 19)
                || (13 < secondAge && secondAge <= 19)
                || (13 < thirdAge && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer && temp>=25 && temp<=45) {
            return true;
        }else if (!isSummer && temp>=25 && temp<=35) {
            return true;
        }
        return false;
    }

    public static double area(double width, double height) {
        if (width<0 || height<0) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            return width*height;
        }
    }

  public static double area(double radius) {
        if (radius<0) {
            System.out.println("Invalid Value");
            return -1;
        } else{
            return radius*radius*Math.PI;
        }
    }


}
