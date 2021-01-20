package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("The number divided with 3 and 5 is " + i);
                count++;
                sum += i;
                if (count == 5){
                    System.out.println("Sum of the numbers is " + sum);

                    break;
                }
            }
        }
    }
}
