import java.util.*;
public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void remove(int data){
        if(head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void printing(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int size(){
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for(int i=0; i<n; i++){
            ll.addlast(sc.nextInt());
        }
        ll.printing();
        //System.out.print("Enter number to delete : ");
        //int del = sc.nextInt();
        //ll.remove(del);
        //ll.printing();
        System.out.println(ll.size());
    }
}
