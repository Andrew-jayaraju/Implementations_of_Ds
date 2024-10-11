import java.util.ArrayList;

public class StacksImp {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static void push(int data){
            list.add(data);
        }
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.size()-1;
            list.remove(top);
            return top;
        }
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
