package v1.src.main.java.oop.ch5_tdd;

import java.util.ArrayList;

public class BillCalculator {
    ArrayList<Float> items = new ArrayList<Float>();
    
    public float getTotal() {
        float total = 0;
        for (float item : items) {
            total += item;
        }

        return total;
    }

    public void addItem(float price) {
        items.add(price);
    }
}
