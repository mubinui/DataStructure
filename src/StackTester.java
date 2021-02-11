public class StackTester {
    public static void main(String[] args) {
        ListStack stack01 = new ListStack();
        System.out.println(stack01.Size()+" Size is 0");
        System.out.println(stack01.isEmpty()+" Stack is Empty");
        try{
            stack01.push(10);
            stack01.push(20);
            stack01.push(30);
            System.out.println(stack01.pop()+ "  is pooped ");
            System.out.println(stack01.peek()+ " Upper element");
            System.out.println(stack01.pop()+"  is pooped ");
            System.out.println(stack01.peek()+ " Upper element");
            System.out.println(stack01.pop()+"  is pooped ");
            System.out.println(stack01.peek());
            System.out.println(stack01.pop());



        }
        catch (Exception e ){
            e.printStackTrace();
        }

    }
}
