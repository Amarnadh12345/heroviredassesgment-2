class Linkedlist1 {
    Node4 head;
    Node4 tail;
    int size;

    Linkedlist1() {
        this.size = 0;
    }


    public void insertAtStart(int val) {
        Node4 Node4 = new Node4(val);
        Node4.next = head;
        head = Node4;
        if (tail == null) {
            tail = head;
        }
        size++;
    }


    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtStart(val);
            return;
        }
        Node4 temp = new Node4(val);
        tail.next = temp;
        tail = temp;
        size++;

    }


    public void display() {
        Node4 temp = head;
        while (temp != null) {
            System.out.print(temp.val + "--> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

// metod to merge
    public Linkedlist1 merge(Linkedlist1 l1, Linkedlist1 l2) {
        Node4 head1 = l1.head;
        Node4 head2 = l2.head;
        Linkedlist1 ans = new Linkedlist1();
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                ans.insertAtLast(head1.val);
                head1 = head1.next;
            } else {
                ans.insertAtLast(head2.val);
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            ans.insertAtLast(head1.val);
            head1 = head1.next;
        }
        while (head2 != null) {
            ans.insertAtLast(head2.val);
            head2 = head2.next;
        }
        return ans;
    }

    // method to sort
    public void sort() {
        Node4 temp1 = head;
        while (temp1.next != null) {
            Node4 temp2 = temp1.next;
            while (temp2.next != null) {
                if (temp2.val < temp1.val) {
                    int Node4Data = temp1.val;
                    temp1.val = temp2.val;
                    temp2.val = Node4Data;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    }
}


class Node4 {

    int val;
    Node4 next;

    public Node4(int val) {
        this.val = val;
    }

    public Node4(int val, Node4 next) {
        this.val = val;
        this.next = next;
    }
}

public class hvmergesort {
    public static void main(String[] args) {
        Linkedlist1 list1 = new Linkedlist1();
        list1.insertAtLast(2);
        list1.insertAtLast(5);
        list1.insertAtLast(12);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        list1.insertAtLast(5);
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(5);
        list1.insertAtLast(5);
        System.out.println("Linked List 1 is");
        list1.display();
        System.out.println();
        Linkedlist1 list2 = new Linkedlist1();
        list2.insertAtLast(2);
        list2.insertAtLast(5);
        list2.insertAtLast(12);
        list2.insertAtLast(3);
        list2.insertAtLast(1);
        System.out.println("linked  List 2 is");
        list2.display();
        System.out.println();
        Linkedlist1 ans = list1.merge(list1, list2);
        ans.sort();
        System.out.println("After Merging and Sorting both Linked lists");
        ans.display();
    }
}
