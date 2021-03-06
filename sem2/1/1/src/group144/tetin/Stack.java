package group144.tetin;

/** Stack realization based on list */
public class Stack {

    private StackElement head = null;
    private int size = 0;

    /** Add element in head */
    public void push(int value) {
        head = new StackElement(value, head);
        size ++;
    }

    /** Delete element from head */
    public int pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return 0;
        }

        int result = head.value;
        head = head.next;
        size --;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class StackElement {
        int value;
        StackElement next;

        StackElement(int value, StackElement next) {
            this.value = value;
            this.next = next;
        }
    }
}
