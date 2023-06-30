import java.util.*;

public class allprint
{
    public static void main(String[] args)
    {
        Queue<Integer> st=new LinkedList<>();
        st.add(20);
        st.add(30);
        st.add(10);
        st.add(12);
        st.add(25);

        Queue<Integer> helper=new ArrayDeque<>();
        
        while(st.size()>0){
            System.out.print(st.peek()+" ");
            helper.add(st.remove());
        }

        while(helper.size()>0){
            st.add(helper.poll());
        }
    }
}