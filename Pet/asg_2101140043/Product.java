package asg_2101140043;

public class Product {
    //  [FEATURE 1]
    public String id;
    public String name;
    public long price;
    public long quantity;
    // constructor
    public Product(String name, long price, long quantity) {
        this.id = generateID();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }
    // generate random product ID (I've decided the length of the ID to be 5 characters)
    public static String generateID() {
        // allCharacter = aphabetic(lower case and upper case) with numeric
        String allCharacter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        StringBuilder sb = new StringBuilder(5);

        for (int i = 0; i < 5; i++) {
            // generate to pick randomized index from String allCharacter
            int temp = (int) (allCharacter.length() * Math.random());
            // add each character to string builder
            sb.append(allCharacter.charAt(temp));
        }
        return sb.toString();
    }
    // get product info
    public void information() {
        int nameLength = name.length();
        int priceLength = Long.toString(price).length();
        int quantityLength = Long.toString(quantity).length();
        System.out.println("| " + id + " | "
                + name + spacing(nameLength) + " | "
                + price + spacing(priceLength) + " | "
                + quantity + spacing(quantityLength) + " |"         
                );
    }
    
    public String spacing(int length) {
        String spacing = "";
        for (int i = 0; i < (20 - length); i++) {
            spacing += " ";
        }
        return spacing;
    }
}
