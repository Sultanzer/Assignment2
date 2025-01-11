import java.util.*;

public class MyApplication {
    public static void main(String[] args) {
        List<Payable> payables = new ArrayList<>();

        payables.add(new Employee("Ramazan", "Seilbekov", "Engineer", 5550));
        payables.add(new Employee("Ernar", "Orleu", "Developer", 1900));

        payables.add(new Student("Bibarys", "Brown", 3.6));
        payables.add(new Student("Kairat", "Black", 3.0));

        Collections.sort(payables, Comparator.comparingDouble(Payable::getPaymentAmount).reversed());

        printData(payables);
    }
    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}
