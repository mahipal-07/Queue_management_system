package smartqueue;

public class Customer {
    private int id;
    private String name;
    private boolean isServed;
    public Customer(int id, String Name) {
        this.id = id;
        this.name = name;
        this.isServed = false;
    }
    public int getId() {return id; }

    public java.lang.String getName() {
        return name;    }

    public boolean isServed() {
        return isServed;
    }
    public void serve() {
        isServed = true;
    }
    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Status: " + (isServed ? "Served" : "Waiting");
    }
}