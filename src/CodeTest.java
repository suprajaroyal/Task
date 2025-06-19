import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CodeTest {
    public static void main(String[] args) {
        List<Object> vendor1 = new ArrayList<>();
        vendor1.add("product1");
        vendor1.add("vendor1");
        vendor1.add(5000);

        List<Object> vendor2 = new ArrayList<>();
        vendor2.add("product2");
        vendor2.add("vendor2");
        vendor2.add(2000);

        List<Object> vendor3 = new ArrayList<>();
        vendor3.add("product3");
        vendor3.add("vendor3");
        vendor3.add(2600);

        List<Object> vendor4 = new ArrayList<>();
        vendor4.add("product4");
        vendor4.add("vendor4");
        vendor4.add(8000);

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


