package com.vytrack.utilities;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortme {
    /**
     * How to find the second largest # in an array
     * 1-Solution is sort it then get the last second one
     * 2-Nested loops for the array and get the last second one
     * 3-Loop and 2 fields max and max-1
     *4-use TreeSet (SortedSet interface)
     * @param args
     */

    static int highest = Integer.MIN_VALUE;
    static int secondHighest = Integer.MIN_VALUE;

    public static int[] ar = {22, 3, 4, 7, 5, 9, 33, 99,66, 15};

    public static void main(String[] args) {
        System.out.println( "Solution 1 Result is ="+s1(ar));
        System.out.println( "Solution 2 Result is ="+s2(ar));
        System.out.println( "Solution 3 Result is ="+s3(ar));
        System.out.println( "Solution 4 Result is ="+s4(ar));
        //System.out.println( "Solution 5 Result is ="+s5(ar));
            }

    public static int s1(int[] array) {
        Arrays.sort( array );
        secondHighest = array[array.length - 2];
        return secondHighest;
    }


    public static int s2(int[] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    array[i] = array[i] - array[j];
                    array[j] = array[j] + array[i];
                    array[i] = array[j] - array[i];
                }
            }
        }
        return secondHighest = array[array.length - 2];
    }


    public static int s3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest)
                secondHighest = array[i];
        }
        return secondHighest;
    }

    public static int s4(int[] array) {
        SortedSet<Integer> set = new TreeSet<Integer>();
        for (int i : array) {
            set.add( i );
        }
        set.remove( set.last() );
        return secondHighest = set.last();
    }
}




