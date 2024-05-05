public class Node {
    // attributes
    private Node next;
    private Product info;

    // constructors
    public Node() {
        this.info = null;
        this.next = null;
    }

    public Node(Product info) {
        this.info = info;
        this.next = null;
    }

    // getters and setters
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Product getInfo() {
        return info;
    }

    public void setInfo(Product info) {
        this.info = info;
    }

    // methods
}
