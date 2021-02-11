public class ListStack implements Stack {
    Node head ;
    Node tail;
    Object last ;
    public int size = 0;
    public int Size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object peek() {
        Object y = null;
        if (size!=0){
            y = last;
        }
        return y;
    }

    @Override
    public void push(Object e ) {
        if (isEmpty()){
            head = new Node(e, null);
            tail = head;
            size++;
        }
        else {
            Node x = new Node(e,null);
            tail.next = x;
            tail = x;
            last = x.elem;
            size++;
        }

    }

    @Override
    public Object pop() throws Exception{
        Node b_tail = null;
        Object poped = tail.elem;
        for(Node n = head; n!=tail; n = n.next ){
            b_tail = n;
        }
        tail =b_tail;
        tail.next = null;
        last = tail.elem;

        return poped;
    }
}
