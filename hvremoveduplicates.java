import java.util.Scanner;
class NodeN {
    int data;
    NodeN next;

   
    NodeN(int data) {
        this.data = data;
    }
}

class LinkedList3 {
    NodeN head;
    int size;

    LinkedList3() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        if (this.size == 0)
            return true;
        else
            return false;
    }


    void appendNodeBack(int data) {
        NodeN currentNode = new NodeN(data);

        if (isEmpty() == true) {
            this.head = currentNode;
        } 
        else {
            NodeN prev = this.head;
            while (prev.next != null) {
                if (prev.data == currentNode.data)
                    break;
                prev = prev.next;
            }

            if (prev.data != currentNode.data)
                prev.next = currentNode;
        }

        this.size++;
    }

    void appendFront(int data) {
        NodeN newNode = new NodeN(data);

        if (isEmpty() == true) {
            this.head = newNode;
        } 
        else {
            NodeN temp = this.head;
            this.head = newNode;
            this.head.next = temp;
        }
        this.size++;
    }


    void printData() {
        if (this.isEmpty()) {
            System.out.println("list is empty");
        } 
        else {
            NodeN currentNode = this.head;
            String listValues = "";
            while (currentNode != null) {
                listValues += String.valueOf(currentNode.data);
                listValues += "->";
                currentNode = currentNode.next;
            }
            System.out.println(listValues);
        }
    }
}
public class hvremoveduplicates {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        LinkedList3 l3= new LinkedList3();
        l3.appendFront(2);
        l3.appendFront(5);
        l3.appendFront(12);
        l3.appendFront(2);
        l3.appendFront(3);
        l3.appendFront(5);
        l3.appendFront(1);
        l3.appendFront(2);
        l3.appendFront(5);
        l3.appendFront(5);
        l3.printData();
    }
}
