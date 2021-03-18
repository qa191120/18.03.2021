package com.example;

import java.util.ArrayList;

public class MyHashMap {

    private ArrayList<Item> m_items;

    public MyHashMap(int size)
    {
        m_items = new ArrayList<>(size);
    }

    public ArrayList<Person> getValues()    {
        ArrayList<Person> values = new ArrayList<>();
        for (Item item : m_items) {
            values.add(item.m_data);
        }
        return values;
    }

    public ArrayList<Integer> getKeys()    {
        ArrayList<Integer> keys = new ArrayList<>();
        for (Item item : m_items) {
            keys.add(item.m_key);
        }
        return keys;
    }
    public boolean containsKey(Integer key) {
        for (Item item : m_items) {
            if (item.m_key == key) {
                return true;
            }
        }
        return false;
    }

    public Person get (Integer key)
    {
        for (Item item : m_items) {
            if (item.m_key == key) {
                return item.m_data;
            }
        }
        // (1) Error !
        // (2) return null;
        return null;
    }
    public void put (Integer key, Person p)
    {
        for (Item item : m_items) {
            if (item.m_key == key) {
                item.m_data = p;
                return;
            }
        }
        m_items.add(new Item(key, p));
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
