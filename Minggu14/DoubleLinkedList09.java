package Minggu14;

public class DoubleLinkedList09 {
    Node09 head;
    int size;

    public DoubleLinkedList09() {
        head = null;
        size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node09(null, item, jarak, null);
        } else {
            Node09 newNode09 = new Node09(null, item, jarak, head);
            head.prev = newNode09;
            head = newNode09;
        }
        size++;

    }

    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;

    }

    public void remove(int index) {

        Node09 current = head;

        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.prev.next = current.prev;

                }
                break;
            }
            current = current.next;
        }
    }
    public int get(int index) throws Exception{
        if (isEmpty()) {
            throw new Exception("Nilai indeks di luar batas");

        }
        Node09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;    
    }

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
}
