import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CodeTest {
    public static void main(String[] args) {
        List<Object> vendor1 = new ArrayList<>();
        vendor1.add("Samsung Galaxy S23");
        vendor1.add("Samsung");
        vendor1.add(56000);

        List<Object> vendor2 = new ArrayList<>();
        vendor2.add("Motorollo");
        vendor2.add("Motorolo");
        vendor2.add(23000);

        List<Object> vendor3 = new ArrayList<>();
        vendor3.add("Iphone 16 promax");
        vendor3.add("Iphone");
        vendor3.add(42000);

        List<Object> vendor4 = new ArrayList<>();
        vendor4.add("OnePlus Nord");
        vendor4.add("Oneplus");
        vendor4.add(25000);

        List<List<Object>> addVendor = new ArrayList<>();
        addVendor.add(vendor1);
        addVendor.add(vendor2);
        addVendor.add(vendor3);
        addVendor.add(vendor4);

        List<List<Object>> sortByPrice = addVendor.stream()
                .sorted(Comparator.comparing(l -> (Integer) ((List<Object>) l).get(2)).reversed())
                .collect(Collectors.toList());

        sortByPrice.forEach(x ->
                System.out.println("Product: " + x.get(0) + ", Vendor: " + x.get(1) + ", Price: " + x.get(2))
        );
    }
}


