import java.util.ArrayList;

public class StackAL {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isempty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isempty()) {
                return -1;
            }
            return list.get(list.size() - 1);

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
