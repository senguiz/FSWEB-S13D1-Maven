package org.example;

public class Main {
    public static void main(String[] args) {


        shouldWakeUp (true, 1);

        shouldWakeUp (false, 2);

        shouldWakeUp (true, 8);

        shouldWakeUp (true, -1);

        hasTeen(9, 99, 19);

        hasTeen(23, 15, 42);

        hasTeen(22, 23, 34);
        isCatPlaying(true, 10);

        isCatPlaying(false, 36);

        isCatPlaying(false, 35);
        area(5.0, 4.0);

        area(-1.0, 4.0);
        area(5.0);
        area(-1);


    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(  (!isBarking) || (isBarking && 8 <= clock && clock <=20) ||clock < 0){
            return false;

        }else{
            return true;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if((firstAge<=19 && firstAge>=13)||(secondAge<=19 && secondAge>=13)||(thirdAge<=19 && thirdAge>=13) ){
            return true;


        }else{
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if((!isSummer && temp>=25 && temp<=35) || (isSummer && temp>=25 && temp <=45)){

            return true;
        }else{
            return false;
        }
    }

    public static double area(double width, double height) {
        if(width <0 || height<0){
            System.out.println("Geçersiz İşlem.");
            return -1;
        }else{
            return width*height;
        }
    }

    public static double area(double radius) {
        if(radius<0){
            System.out.println("Geçersiz İşlem.");
            return -1;
        }else{
            System.out.println(radius*radius*Math.PI);
            return radius*radius*Math.PI;
        }
    }
}
