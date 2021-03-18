package com.example;

import java.util.ArrayList;

public class MyGenericQueue<E> {

    private ArrayList<E> m_items;

    public MyGenericQueue(int size)
    {
        m_items = new ArrayList<E>(size);
    }
    public void enqueue(E item)
    {
        m_items.add(0, item);
    }
    public E dequeue()
    {
        E last_item = m_items.get(m_items.size() - 1);
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
