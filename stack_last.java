public class stack_last {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }

    }

    static class stack {
        static Node head;

        public static boolean isempty() {
            return head == null;

        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isempty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public int pop() {
            if (isempty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        public int peek() {
            if (isempty()) {
                return -1;
            }
            return head.data;

        }

        public void pushAtBottom(int data, stack s) {
            if (isempty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(data, s);
            s.push(top);
        }

        public void pushATmiddle(int data, stack s, int position) {
            int top = s.pop();
            if (top == position) {
                s.push(top);
                s.push(data);

                return;
            }

            pushATmiddle(data, s, position);
            s.push(top);
        }

        public void reverse(stack s) {
            if (s.isempty()) {
                return;
            }
            int top = s.pop();
            reverse(s);
            pushAtBottom(top, s);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // s.pushAtBottom(5, s);
        // s.pushATmiddle(6, s, 3);
        s.reverse(s);
        while (!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
