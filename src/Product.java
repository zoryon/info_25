public class Product {
    // attributes
    private static int newID = 0;

    private int id;
    private String name;

    // constructors
    public Product(String name) {
        this.id = Product.newID;
        Product.newID++;
        
        this.name = name;
    }

    // getters and setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    @Override
    public String toString() {
        return 
            "\n[" + 
            "\n Id: " + getId() + 
            "\n Name: " +  getName() +
            "\n]";
    }
}
