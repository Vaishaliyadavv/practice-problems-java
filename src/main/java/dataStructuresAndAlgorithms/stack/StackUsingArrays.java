package dataStructuresAndAlgorithms.stack;


import java.util.ArrayList;

//implement a stack using array and arrayList
public class StackUsingArrays {
//    static int[] st;
static ArrayList<Integer> st;
    static int top;
    int size;

   public StackUsingArrays(int size){
       this.size = size;
       top = -1;
//       st = new int[size];
       st = new ArrayList<>();
   }

   public void push(int data){
       if(top >= size -1){
           System.out.println("stack overflow");
           return;
       }
       top++;
//       st[top] = data;
       st.add(top,data);

   }

   public static int peek(){
       if(top < 0){
           System.out.println("stack is empty");
           return 0;
       }
//       return st[top];
       return st.get(top);
   }

   public static int pop(){
       if(top < 0){
           System.out.println("stack is empty");
           return 0;
       }
       top--;
//       return st[top];
       return st.remove(top--);
   }

   public static int getSize(){
       return Math.max(top+1, 0);
   }

   public static boolean isEmpty(){
       return top < 0;
   }


    public static void main(String[] args) {
        StackUsingArrays st = new StackUsingArrays(5);
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(peek());
        System.out.println(pop());
        System.out.println(isEmpty());

    }
}
