public interface Queue {
    public void enqueue (Object elem);
    public Object dequeue() throws Exception;
    public boolean isEmpty();
    public Object peek ();
}
