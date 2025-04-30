package smartqueue;
import java.util.*;

public class QueueManager {
    private Queue<Customer> queue = new LinkedList<>();
    private int customerId = 1;

    public void addCustomer(String name) {
        Customer c = new Customer(customerId++, name);
        queue.add(c);
        System.out.println(name + " added to the queue");
    }
    public void serveNextCustomer() {
        Customer next =  queue.poll();
        if (next != null) {
            next.serve();
            System.out.println("Serving Customer: " + next.getName());
        } else {
            System.out.println("No Customer in queue.");
        }
    }
    public void showQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (Customer c: queue){
            System.out.println(c);
        }
    }
    public void showCustomerPosition(int id) {
    int position = 1;
    for (Customer c : queue) {
        if (c.getId() == id) {
            System.out.println(c.getName() + "is at position: " + position);
            return;
        }
        position++;
    }
        System.out.println("Customer not found.");
    }
}
