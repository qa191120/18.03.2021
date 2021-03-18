package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue(20);
        queue.enqueue(1);
        int number1 = queue.dequeue();
        System.out.println(number1);

        MyGenericQueue<Integer> queue_integer = new MyGenericQueue<>(20);
        queue_integer.enqueue(1);
        int number2 = queue_integer.dequeue();
        System.out.println(number2);

        MyStack stack = new MyStack(20);
        stack.push(1);
        System.out.println(stack.peek());
        int number3 = stack.pop();
        System.out.println(number3);

    }

}
