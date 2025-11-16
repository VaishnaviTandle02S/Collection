package DSA.Assignment1;

public class SinglyLinkedList {
    public static void main(String[] args) {
        List1 sll = new List1();
        sll.creationOfSLL(10);
        sll.insertion(1, 20);
        sll.insertion(4, 30);
        sll.insertion(3, 40);
        sll.insertion(2, 50);

//		sll.forwardTraverse();
        sll.searching(30);
        sll.searching(3);
//		sll.deletion();
        sll.forwardTraverse();
        sll.backwardTraverse();
    }
}


class Node1 {
    public int value;
    public Node1 next;
}

class List1 {
    public Node1 head, tail;
    public int size;

    public void creationOfSLL(int value) {// 20
        head = new Node1();
        Node1 Node1 = new Node1();
        Node1.value = value;
        Node1.next = null;
        head = tail = Node1;
        size = 1;
    }
    public void insertion(int location, int value) {// 0 20
        Node1 Node1 = new Node1();
        Node1.value = value;
        if (head == null) {
            creationOfSLL(value);
        } else if (location == 0) {// insertion @ 1st
            Node1.next = head;
            head = Node1;
        } else { // insertion @ last
            Node1.next = null;
            tail.next = Node1;
            tail = Node1;
        }
    }

    public void forwardTraverse() {
        System.out.println("******************forwardTraverse**********************");

        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public void backwardTraverse() {

        System.out.println("******************backwardTraverse**********************");

        Node1 pre=null,mid=null,current=head;

        while(current!=null)
        {
            pre=mid;
            mid=current;
            current=current.next;
            mid.next=pre;
        }


        while ( mid!= null) {
            System.out.print(mid.value + " ");
            mid = mid.next;
        }
        System.out.println();
    }

    public void searching(int searchValue) {
        System.out.println("******************Search -"+searchValue +"**********************");
        Node1 temp = head;
        while (temp != null) {
            if (temp.value == searchValue) {
                System.out.println("The value is present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value is not present");
    }


    public void deletion() {
        head = tail = null;
        System.out.println("List is deleted");
    }
}