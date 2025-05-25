package CompositePattern;

public interface items {
    String getName();
    int getWeight();
    void add(items i);
    void remove(items i);
    void display(int depth);
}
