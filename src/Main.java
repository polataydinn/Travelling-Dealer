import kotlinversion.Node;

public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);
        node.printNodes();
        node.length(node);
        node.sumOfNodes();
        node.deleteNode(node, 5);
        // End of Example
    }
}
