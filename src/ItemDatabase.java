import java.util.HashMap;

public class ItemDatabase {

    protected HashMap<String, String> itemNameCode = new HashMap<>();
    protected HashMap<String, Double> itemNamePrice = new HashMap<>();

    public ItemDatabase(){
        setGetItemNameCode();
        setGetItemNamePrice();
    }

    public void setGetItemNameCode() {
        itemNameCode.put("Java Book", "JA01");
        itemNameCode.put("CSS Book", "CS01");
        itemNameCode.put("Python Book", "PY01");
        itemNameCode.put("C++ Book", "CP01");
        itemNameCode.put("HTML Book", "HT01");
        itemNameCode.put("Android Book", "AA01");
        itemNameCode.put("Spring Book", "SP01");
    }

    public void setGetItemNamePrice() {
        itemNamePrice.put("Java Book", 70.00);
        itemNamePrice.put("CSS Book", 50.00);
        itemNamePrice.put("Python Book", 60.00);
        itemNamePrice.put("C++ Book", 75.00);
        itemNamePrice.put("HTML Book", 55.00);
        itemNamePrice.put("Android Book", 85.00);
        itemNamePrice.put("Spring Book", 80.00);
    }

}
