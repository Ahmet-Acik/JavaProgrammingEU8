package day48_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CollectStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        Iterator<String> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String element : stack) {
            System.out.println(" for each element = " + element);

        }

        stack.stream().forEach((element) -> {
            System.out.println(" stream element = " + element);

        });

        List <String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println("list = " + list);
        while (list.size() > 0) stack.push(list.remove(0));
        System.out.println("list = " + list);








    }
}





