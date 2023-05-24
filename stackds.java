public class stackds {
    private static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            nextNode = null;

        }
    }

    static class stack {
        static Node head;

        public static boolean isempty() {
            return head == null;

        }

        public static void push(int data) {
            Node newnode = new Node(data);
            if (isempty()) {
                head = newnode;
                return;
            }
            newnode.nextNode = head;
            head = newnode;

        }

        public static int pop() {
            if (isempty()) {
                return -1;

            }
            int top = head.data;
            head = head.nextNode;
            return top;
        }

        public static int peek() {
            if (isempty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        // stackds sd = new stackds();
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(3);
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
