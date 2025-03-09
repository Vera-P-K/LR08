public class Task06rec {
    static class Node {
        public int value;
        public Node next;
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
            }
    }

    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

        Node newtail = new Node(123, null);
        ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next=newtail;

        Node newNode=new Node(44, null);
        ref = head;
        int k=1;
        while (ref.next!= null && (k<2 )) {
            ref = ref.next;
            k++;
        }
        newNode.next=ref.next.next;
        ref.next=newNode;

    }
}