import java.util.ArrayList;
public class a1{
    public static void swap( ArrayList<Integer>list,int indx1,int indx2){
        int temp = list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
        
    }
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(34);
        list.add(40);
        System.out.println(list);
        swap(list,2,3);
        System.out.println(list);
        //System.out.println(list.size());

        //list.add(1,9);
        //System.out.println(list);
        //System.out.println(list.get(2));
        //list.remove(2);
        //System.out.println(list);
        //list.set(2,10);
        //System.out.println(list);
        //System.out.println(list.contains(10));
        //System.out.println(list.contains(11));        

    }
}