package CompositePattern;
import java.util.ArrayList;
import java.util.List;

public class Box implements items {
    private String name;
    private List<items> l = new ArrayList<>();

    

    public Box(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        int totalWeight = 0;
        for(items i : l ){
            totalWeight +=i.getWeight();
        }
        return totalWeight;
    }

    @Override
    public void add(items i) {
       l.add(i);
    }

    @Override
    public void remove(items i) {
        l.remove(i);
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth * 2) + "+ Box: " + name);
        for (items item : l) {
            item.display(depth + 1);
        }
    }

}
