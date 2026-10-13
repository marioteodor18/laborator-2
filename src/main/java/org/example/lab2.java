package org.example;

import java.util.*;

public class lab2 {

    public static void main(String[] args) {
    }


    static void main() {

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        //a
        Set<Integer> zSet = new TreeSet<>();
        //b
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        //c
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }

        for (int i = 0; i < 7; i++) {

           y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        System.out.println(x);
        System.out.println(y);

        //a
        xPlusY.addAll(x);
        xPlusY.addAll(y);

        System.out.println(xPlusY);

        //b
        zSet.addAll(x);
        zSet.addAll(y);
        System.out.println(zSet);



        //c
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println(xMinusY);

        //d
        for (int element : zSet) {
            if (element <= p) {
                xPlusYLimitedByP.add(element);
            }
        }

        //2.7.2



    }
}
