package bridge.test;

import bridge.impl.ArrayImpl;
import bridge.impl.LinkedListImpl;
import bridge.list.Stack;

public class BridgeTest {

    public static void main(String[] args) {

        Stack<String> linkedListStack = new Stack<String>(new LinkedListImpl<String>());

        linkedListStack.push("aaa");
        linkedListStack.push("bbb");

        System.out.println(linkedListStack.toString());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());


        System.out.println("========================================");

        Stack<String> arrayListStack = new Stack<String>(new ArrayImpl<String>());

        arrayListStack.push("aaa");
        arrayListStack.push("bbb");

        System.out.println(arrayListStack.toString());
        System.out.println(arrayListStack.pop());
        System.out.println(arrayListStack.pop());

    }
}
