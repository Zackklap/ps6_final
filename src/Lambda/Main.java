package Lambda;

import Lambda.ArrayList;

public class Main{
    public static void main(String args[]){
        String[] letters = {"a", "b", "c", "a", "c", "d", "e", "a"};
        ArrayList list1 = new ArrayList(letters);
        System.out.println(list1);
        System.out.println(list1.removeAll("a"));
        System.out.println(list1);
        System.out.println(list1.removeAll("c"));
        System.out.println(list1);
        System.out.println(list1.removeAll("x"));
        System.out.println(list1);
        LLList list2 = new LLList(letters);
        System.out.println(list2);
        System.out.println(list2.removeAll("a"));
        System.out.println(list2);
        System.out.println(list2.removeAll("x"));
    }
}