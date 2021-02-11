import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        QueueEmplement doctorqueue = new QueueEmplement();
        try{
            Scanner sc = new Scanner(System.in);
            boolean e = doctorqueue.isEmpty();
            System.out.println(e+" This should be true ");
            Object p = doctorqueue.peek();
            System.out.println(p+" Should be null");
            doctorqueue.enqueue(100);
            doctorqueue.enqueue(200);
            doctorqueue.enqueue(300);
            doctorqueue.printlist();
            System.out.println(doctorqueue.peek()+" Peek");
            System.out.println(doctorqueue.dequeue()+" Dequeued");
            System.out.println(doctorqueue.peek()+ " Peek");
            System.out.println(doctorqueue.dequeue()+"Dequeued");
            System.out.println(doctorqueue.peek());
            System.out.println(doctorqueue.dequeue());
            System.out.println(doctorqueue.peek());
            System.out.println(doctorqueue.dequeue());
            System.out.println(doctorqueue.peek());




        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
