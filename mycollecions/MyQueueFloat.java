package com.example;

import java.util.ArrayList;

public class MyQueueFloat {

    private ArrayList<Float> m_items;

    public MyQueueFloat(int size)
    {
        m_items = new ArrayList<>(size);
    }
    public void enqueue(Float item)
    {
        m_items.add(0, item);
    }
    public Float dequeue()
    {
        Float last_item = m_items.get(m_items.size() - 1);
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
