package com.example;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> m_items;

    public MyStack(int size)
    {
        m_items = new ArrayList<>(size);
    }
    public void push(Integer item)
    {
        m_items.add(0, item);
    }
    public Integer pop()
    {
        Integer first_item = m_items.get(0);
        m_items.remove(0);
        return first_item;
    }
    public Integer peek()
    {
        if (m_items.size() == 0)
        {
            return null;
        }
        return m_items.get(0);
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

