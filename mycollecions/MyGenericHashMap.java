package com.example;

import java.util.ArrayList;

public class MyGenericHashMap<K, V> {

    private ArrayList<K> m_keys;
    private ArrayList<V> m_values;

    public MyGenericHashMap(int size)
    {
        m_keys = new ArrayList<>(size);
        m_values = new ArrayList<>(size);
    }

    public ArrayList<V> getValues()    {
        return m_values;
    }

    public ArrayList<K> getKeys()    {
        return m_keys;
    }
    public boolean containsKey(K key) {
        return m_keys.contains(key);
    }

    public V get (K key)
    {
        int index_of = m_keys.indexOf(key);
        // (1) Error !
        // (2) return null;
        return m_values.get(index_of);
    }
    public void put (K key, V value)
    {
        int index_of = m_keys.indexOf(key);
        if (index_of != -1)
        {
            m_values.set(index_of, value);
            return;
        }
        m_keys.add(key);
        m_values.add(value);
    }
    public void clear()
    {
        m_keys.clear();
        m_values.clear();
    }
    public int count()
    {
        return m_keys.size();
    }
}
