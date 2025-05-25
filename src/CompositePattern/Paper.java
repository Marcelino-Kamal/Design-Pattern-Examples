package CompositePattern;

public class Paper implements items {
    private String name;
    private int weight;

    

    public Paper(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
       return name;
    }

    @Override
    public int getWeight() {
       return weight;
    }

    @Override
    public void add(items i) {
        throw new UnsupportedOperationException("Papar Cant contain anything");
    }

    @Override
    public void remove(items i) {
        throw new UnsupportedOperationException("Can't remove from paper");
        
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth * 2) + "- Paper: " + name + " (" + weight + "g)");
    }
    
}
