public class Task06cycle {
    static class Node {
        public int value;
        public Task06rec.Node next;
        public int head;

        Node(int value, Task06rec.Node next) {
            this.value = value;
            this.next = next;

        }

    }


    public static void main(String[] args) {
        Task06rec.Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Task06rec.Node(i, head);
        }
        Task06rec.Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}