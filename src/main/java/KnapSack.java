import models.Bag;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;

public class KnapSack {
    public static void main(String[] args) {

        int bagCapacity = 20;
        double maxProfit = 0;
        int[] profit = {25, 24, 15};
        int[] weight = {18, 15, 10};
        Bag[] totalBag = new Bag[weight.length];

        for (int i = 0; i < weight.length; i++) {
            totalBag[i] = new Bag(profit[i], weight[i], i);
        }


        Arrays.sort(totalBag, new Comparator<Bag>() {
            public int compare(Bag bag, Bag t1) {
                return t1.getCost().compareTo(bag.getCost());
            }
        });


        for (int i = 0; i < totalBag.length; i++) {
            if (totalBag[i].getWeight() < bagCapacity) {
                maxProfit += totalBag[i].getProfit();
                bagCapacity -= totalBag[i].getWeight();
            } else {
                Double cost = totalBag[i].getCost();
                maxProfit += cost * bagCapacity;
                bagCapacity=0;

            }
        }

        System.out.println("maxProfit = " + maxProfit);


    }

}

