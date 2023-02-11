class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    LinkedList() {
        head = null;
    }

    public void insertNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            // return ;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void swapNodes() {
        if (head == null || head.next == null) {
            return;
        }

        // Shifting the link of the first two nodes.
        Node currentNode = head;
        Node nextNode = currentNode.next;
        Node temp = nextNode.next;

        currentNode.next = temp; // changing the link of first node.
        nextNode.next = currentNode;
        head = nextNode;
        currentNode = temp;

        System.out.println("head = " + head.data);

        while (true) {
            if (currentNode == null) {
                System.out.println("Condiiton1");
                return;
            }
            if (currentNode.next == null) {
                System.out.println("Conditon2");
                return;

            }
            nextNode = currentNode.next;
            System.out.println("nextNode = "+nextNode.data);
            temp = nextNode.next;
            System.out.println("temp = "+temp.data);
            nextNode.next = currentNode;
            System.out.println("nextNode.next = "+nextNode.next.data);
            currentNode.next = temp;
            System.out.println("currentNode.next = "+currentNode.next.data);
            currentNode = temp;
            System.out.println("currentNode = "+currentNode.data);
        }
    }

    public static void main(String[] args) {
        System.out.println("Code is running linkedlist");
        LinkedList obj = new LinkedList();
        obj.insertNode(1);
        obj.insertNode(2);
        obj.insertNode(3);
        obj.insertNode(4);
        obj.insertNode(6);
        obj.insertNode(7);
        obj.insertNode(8);
        // obj.insertNode(9);
        System.out.println(obj.head.next.data);

        obj.display();

        obj.swapNodes();

        obj.display();
    }
}