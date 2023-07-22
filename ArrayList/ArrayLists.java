import java.util.ArrayList;
import java.util.Collections;

class ArrayLists{
    public static void main(String[] args) {
        //Declare an ArrayList of different Types
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //Add Element
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(7);
        System.out.println(list2);

        //Get Element
        int listitem = list2.get(1);
        System.out.println(listitem);

        //Add Element at a specific Index
        list2.add(0,9);
        System.out.println(list2);

        //Set Element at a specific Index
        list2.set(1,4);
        System.out.println(list2);

        //Delete Element from an Index
        list2.remove(2);
        System.out.println(list2);

        //Size of the List
        int size = list2.size();
        System.out.println(size);

        //Loop/Iterate on the List
        for(int i=0; i<size; i++){
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();

        //Sort the List
        Collections.sort(list2);
        System.out.println(list2);
    }
}
