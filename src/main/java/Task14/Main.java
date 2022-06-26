package Task14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> product = initProduct();

        printMaxNameProductAndValue(findMaxNameProduct(product, findMaxValueProduct(product)), findMaxValueProduct(product));

        Set<String> allProduct = newProduct(product);
        print(allProduct);
    }

    public static void printMaxNameProductAndValue(String maxName, int maxValue) {
        System.out.println("The biggest amount of products is: " + maxValue + " = " + maxName);
    }

    public static HashMap<String, Integer> initProduct() {
        HashMap<String, Integer> product = new HashMap<String, Integer>();
        product.put("Milk", 40);
        product.put("Bread", 70);
        product.put("Salad", 50);
        product.put("Broccoli", 30);
        product.put("Pears", 60);
        product.put("Pineapples", 40);
        product.put("Butter", 50);

        return product;
    }

    public static Set<String> newProduct(Map<String, Integer> oldProducts) {
        Set<String> newProduct = new HashSet<>(oldProducts.keySet());
        newProduct.add("Sweets");
        newProduct.add("Chocolate");
        newProduct.add("Cookies");
        newProduct.add("Marmalade");

        return newProduct;
    }

    public static void print(Set<String> set) {
        System.out.println("In store:");
        System.out.println(set);
    }

    public static int findMaxValueProduct(HashMap<String, Integer> map) {
        int maxValue = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int amount = entry.getValue();

            if (amount > maxValue) {
                maxValue = amount;
            }
        }
        return maxValue;
    }

    public static String findMaxNameProduct(HashMap<String, Integer> map, int maxValue) {
        String maxName = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxName = entry.getKey();
            }
        }
        return maxName;
    }
}
