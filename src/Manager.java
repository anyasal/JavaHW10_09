/*import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker {
    private List<Worker> subordinates;
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
        this.subordinates = new ArrayList<>();
    }
    public void addSubordinate(Worker worker) {
        subordinates.add(worker);
    }
    public void removeSubordinate(Worker worker) {
        subordinates.remove(worker);
    }
    public List<Worker> getSubordinates() {
        return subordinates;
    }
    @Override
    public String toString() {
        return super.toString() + ", Subordinates: " + subordinates.size();
    }
}*/