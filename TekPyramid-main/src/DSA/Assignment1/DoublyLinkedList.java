package DSA.Assignment1;

public class DoublyLinkedList {
    public static void main(String[] args) {
        List2 a=new List2();
        a.creation(10);
        a.insertion(0, 20);
        a.insertion(1, 30);
        a.insertion(2, 40);
        a.insertion(3, 50);
        a.forwardTraverse();
        a.searching(60);
    }

}


class Node2
{
    Node2 pre;
    int value;
    Node2 next;
}

class List2{
    Node2 head,tail;
    int size;
    void creation(int value)
    {
        head= new Node2();
        Node2 node=new Node2();
        node.next=null;
        node.pre=head ;
        node.value=value;
        head=tail=node;
        size=1;
        System.out.println(head);

    }
    void insertion(int loc , int value) {
        Node2 node = new Node2();
        node.value = value;
        if (head == null)
        {
            creation(value);
        }
        else if(loc==0) {
            node.next=head;
            node.pre=null;
            head.pre=node;
            head=node;

        }
        else {
            node.next=null;
            node.pre=tail;
            tail.next=node;
            tail=node;
        }
    }


    public void forwardTraverse() {
        System.out.println("******************forwardTraverse**********************");

        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void searching(int searchValue) {
        System.out.println("******************Search -"+searchValue +"**********************");
        Node2 temp = head;
        while (temp != null) {
            if (temp.value == searchValue) {
                System.out.println("The value is present");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value is not present");
    }
}

