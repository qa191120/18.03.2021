package com.example;

import java.util.ArrayList;

public class MyQueue {

    private ArrayList<Integer> m_items;

    public MyQueue(int size)
    {
        m_items = new ArrayList<>(size);
    }
    public void enqueue(Integer item)
    {
        m_items.add(0, item);
    }
    public Integer dequeue()
    {
        Integer last_item = m_items.get(m_items.size() - 1);
        m_items.remove(m_items.size() - 1);
        return last_item;
    }
    public void clear()
    {
        m_items.clear();
    }
    public int count()
    {
        return m_items.size();
    }
}
