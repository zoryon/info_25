public class Queue {
    // attributes
    private Node head;

    // constructors
    public Queue() {
        this.head = null;
    }

    // getters and setters
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // methods
    public void printAllProducts() {
        if (isEmpty()) System.out.println("- - - Empty Queue - - -");

        for (Node tmp = head; tmp != null; tmp = tmp.getNext()) {
            System.out.println(tmp.getInfo().toString());
        }
    }

    public int length() {
        if (head == null) return 0;

        int ans = 0;
        for (Node tmp = head; tmp != null; tmp = tmp.getNext()) {
            ans++;
        }
        return ans;
    }

    public boolean isEmpty() {
        return length() == 0 ? true : false;
    }

    public Node findLast() {
        if (head == null) return null;

        Node ans = null;
        for (ans = head; ans.getNext() != null; ans = ans.getNext());
        return ans;
    }

    public boolean pushQueue(Product product) {
        if (length() >= 9) return false;

        Node last = findLast();
        Node newNode = new Node(product);

        if (last == null) head = newNode;
        else last.setNext(newNode);
        return true;
    }

    public Product extract(String name) {
        if (isEmpty()) return null;

        if (head.getInfo().getName().equals(name)) {
            Product ans = head.getInfo();
            head = head.getNext();
            return ans;
        }

        for (Node tmp = head; tmp != null; tmp = tmp.getNext()) {
            if (tmp.getNext().getInfo().getName().equals(name)) {
                Product ans = tmp.getNext().getInfo();
                tmp.setNext(tmp.getNext().getNext());
                return ans;
            }
        }

        return null;
    }

    public Product first() {
        return head.getInfo();
    }

    public Product last() {
        Node last = findLast();
        return last == null ? null : last.getInfo();
    }

    public void clear() {
        head = null;
    }
}
