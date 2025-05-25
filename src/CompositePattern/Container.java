package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Container implements items {
    private String name;
    private List<items> items = new ArrayList<>();

    

    public Container(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
       return name;
    }

    @Override
    public int getWeight() {
       int totalWeight = 0;
       for(items i : items){
            totalWeight += i.getWeight();
       }
       return totalWeight;
    }

    @Override
    public void add(items i) {
        items.add(i);
    }

    @Override
    public void remove(items i) {
       items.remove(i);
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth * 2) + "* Container: " + name);
        for (items item : items) {
            item.display(depth + 1);
        }
    }

}
