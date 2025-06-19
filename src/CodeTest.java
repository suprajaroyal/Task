import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CodeTest {
    public static void main(String[] args) {
        List<Object> product1 = new ArrayList<>();
        product1.add("Samsung Galaxy S23");
        product1.add("Samsung");
        product1.add(56000);

        List<Object> product2 = new ArrayList<>();
        product2.add("Motorollo Edge 50 pro");
        product2.add("Motorollo");
        product2.add(23000);

        List<Object> product3 = new ArrayList<>();
        product3.add("Iphone 16 promax");
        product3.add("Iphone");
        product3.add(42000);

        List<Object> product4 = new ArrayList<>();
        product4.add("OnePlus Nord");
        product4.add("Oneplus");
        product4.add(25000);

        List<List<Object>> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        List<List<Object>> sortByPrice = products.stream()
                .sorted(Comparator.comparing(l -> (Integer) ((List<Object>) l).get(2)).reversed())
                .collect(Collectors.toList());

        sortByPrice.forEach(x ->
                System.out.println("Product: " + x.get(0) + ", Vendor: " + x.get(1) + ", Price: " + x.get(2))
        );
    }
}


