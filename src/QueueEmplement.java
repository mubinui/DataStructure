public class QueueEmplement implements Queue{
    Node head ;
    Node tail;
    int size = 0;
    int front = 0;
    int rear =0;

    public boolean isEmpty(){
        return size==0;
    }
    public Object peek () {
        Object shown = null;
        if (size!=0){
            shown = head.elem;
        }
        return shown;
    }
    public void enqueue(Object elem){
        if (front==rear){
            head = new Node(elem,null);
            head.next = tail;
            tail = head;
            size++;
            rear++;
        }
        else{
            Node x = new Node(elem,null);
            tail.next = x;
            tail=x;

            rear++;
            size++;
        }

    }
    public Object dequeue()throws Exception{
        Object removed =null;
        if(head!=null){
            Node x = head;
            head = head.next;
            removed = x.elem;
            x = null;
            front++;
            size--;

        }

        return removed;

    }
    public void printlist(){
        for(Node x = head; x!=null ;x=x.next){
            System.out.print(x.elem+" ");
        }
    }


}
