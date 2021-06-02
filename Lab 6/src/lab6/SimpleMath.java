package lab6;

import java.util.Scanner;

public class SimpleMath {
    /* Implement an average method where you have a parameter n. Read n floating point numbers
    and return the average of them.
     */
    public static float average_n(int n) {
        int i;
        float sum = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float first_num = scnr.nextFloat();
        sum = sum + first_num;
        for (i=1;i<n;i++) {
            System.out.println("Enter the next number: ");
            float number = scnr.nextFloat();
            sum = sum + number;
        }
        return (sum/n);
    }

    /*Implement another average method where you have 3 floating point numbers as the
    parameters and returns the average of these numbers.
     */
    public static float average_three(float a, float b, float c) {
        float average = (a+b+c)/3;
        return average;
    }

    /*Implement a max method where you have a parameter n. Read n floating point numbers and return
    the maximum of them.
     */
    public static float max_n(int n) {
        int i;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float max = scnr.nextFloat();
        for (i=1;i<n;i++) {
            System.out.println("Enter the next number: ");
            float number = scnr.nextFloat();
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    /*Implement another max method where you have 3 floating point numbers as the parameters and
    returns the maximum of these numbers.
     */
    public static float max_three(float a, float b, float c) {
        if ((a>b) && (a>c)) {
            return a;
        }
        else if ((b>a) && (b>c)) {
            return b;
        }
        else {
            return c;
        }
    }

    /*Implement a min method where you have a parameter n. Read n floating point numbers and return
    the minimum of them.
     */
    public static float min_n(int n) {
        int i;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float min = scnr.nextFloat();
        for (i=1;i<n;i++) {
            System.out.println("Enter the next number: ");
            float number = scnr.nextFloat();
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    /*Implement another min method where you have 3 floating point numbers as the parameters and
    returns the minimum of these numbers.
     */
    public static float min_three(float d, float e, float f) {
        int i;
        if ((d<e) && (d<f)) {
            return d;
        }
        else if ((e<d) && (e<f)) {
            return e;
        }
        else {
            return f;
        }
    }

    public static void main(String[] args) {
        average_n(5);
        average_three(3,6,4);
        max_n(4);
        max_three(4,10,20);
        min_n(3);
        min_three(20,22,5);
    }

}
