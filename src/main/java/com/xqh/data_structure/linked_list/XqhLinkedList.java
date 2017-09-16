package com.xqh.data_structure.linked_list;

import com.xqh.data_structure.linked_list.Node;

public class XqhLinkedList {
    Node head =null;
    public void addFirst(int element){
        Node node = new Node();
        node.data0 =element;
        node.next0 =head;
        head = node;
    }
    public void add(int element){
        Node node = new Node();
        Node i = head;
        while (i.next0 != null){
            i=i.next0;
        }
        node.data0 = element;
        i.next0 = node;
        node.next0 = null;
    }
    public void display(){
        Node i = head;
        int k = -1;
        while (i.next0 != null){
            k = k + 1;
            System.out.print(k + "," + i.data0 + "     ");
            i = i.next0;
        }
        k++;
        System.out.println(k + "," + i.data0 + "     ");
    }
    public void insert(int index,int element){
        Node i = head;
        int k = - 1;
        Node iprevious;
        while (i.next0 != null){
            iprevious = i;
            i = i.next0;
            k = k + 1;
            if (k == index - 1){
                Node node = new Node();
                node.data0 = element;
                node.next0 = i ;
                iprevious.next0 = node;
            }
        }
    }
    public void set(int index , int element){
        Node i = head;
        Node iprevious ;
        int k = -1 ;
        while (i.next0 != null){
            iprevious = i;
            i = i.next0;
            k = k + 1;
            if (k == index){
                iprevious.data0 = element;
            }
        }
    }
    public int get(int index){
        Node i = head;
        int k = -1;
        while (i.next0 != null){
            i = i.next0;
            k = k + 1;
            if (k == index){
                return i.data0;
            }
        }
        return -1;
    }
    public void removeLast(){
        Node i = head;
        Node iprevious = null;
        while (i.next0 != null){
            iprevious = i ;
            i = i.next0;
        }
        iprevious .next0 = null;
    }
    public void delete (int index){
        Node i = head;
        Node iprevious;
        int k = -1;
        while (i.next0 != null){
            iprevious = i ;
            i = i.next0;
            k++;
            if (k == index - 1){
                iprevious.next0 = i.next0;
            }
        }
    }
}
