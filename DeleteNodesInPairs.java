class LinkedListSwap {
    Node head;

    LinkedListSwap() {
        head = null;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insertNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
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
        if (head == null) {
            return;
        }
        if (head.next == null) {
            return;
        }
        Node previousNode = null;
        Node currentNode = null;
        Node nextNode = null;
        Node temp = null;

        currentNode = head;
        nextNode = currentNode.next;
        temp = nextNode.next;

        nextNode.next = currentNode;
        previousNode = currentNode;
        currentNode = temp;
        head = nextNode;

        while (true) {
            if (currentNode == null) {
                // It means no any nodes left.
                break;
            }
            if (currentNode.next == null) {
                // It means only one node left.
                break;
            }

            // At this point we are sure that there are minimum two nodes left in our linkedlist.

            nextNode = currentNode.next; // Storing the next pointer of currentNode.
            temp = nextNode.next; // Storing the next pointer of nextNode. If only two nodes are presnet then this value will be null.
            nextNode.next = currentNode; // Shifting the next pointer of nextNode from temp to currentNode. (Reversing the nodes)
            previousNode.next=nextNode;  // Now shifting the pointer of last pair nodes.
            previousNode = currentNode; // Making the current node as previous node.
            currentNode = temp; // changint the current node to temp.
        }

    }

    public static void main(String[] arsg) {
        System.out.println("code is running");
        LinkedListSwap obj = new LinkedListSwap();
        obj.insertNode(1);
        obj.insertNode(2);
        obj.insertNode(3);
        obj.insertNode(4);
        obj.insertNode(5);

        obj.display();

        obj.swapNodes();
        
        obj.display();
    }
}
