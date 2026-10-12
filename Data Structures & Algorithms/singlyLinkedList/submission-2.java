class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public int get(int index) {
        Node curr = head;
        int i = 0;

        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }

        return -1;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    public void insertTail(int val) {
        Node newTail = new Node(val);

        if (head == null) {
            head = newTail;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newTail;
    }

    public boolean remove(int index) {

        if (index < 0 || head == null){
            return false;
        }

        Node curr = head;
        int i = 0;

        if (index == 0){
            head = head.next;
            return true;
        }

        while ( i < index - 1 && curr.next !=null){
            curr = curr.next;
            i++;
        }

        if (curr.next == null){
            return false;
        }

        curr.next = curr.next.next;
        return true;

    }

    public ArrayList<Integer> getValues() {

        ArrayList<Integer> vals = new ArrayList<>();

        Node curr = head;

        while (curr != null){
            vals.add(curr.val);
            curr = curr.next;
        }

        return vals;

    }
}
