package com.xqh.data_structure.arr_linkedList_interfance;

public interface XqhList {
    void add(int element);
    int get(int index);
    void set(int index,int element);
    void insert(int index,int element);
    void delete(int index);
    void removeLast();
    void display();
}
