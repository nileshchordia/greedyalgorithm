package models;

import lombok.Data;
import lombok.Getter;

@Getter
public class Bag {
    Integer profit;
    Integer weight;
    Integer index;
    Double cost;

    public Bag(Integer profit, Integer weight, Integer index) {
        this.profit = profit;
        this.weight = weight;
        this.index = index;
        this.cost = (double)profit/weight;
    }
}
