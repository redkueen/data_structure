package com.xqh.data_structure.arr_linkedList_interfance;

public class XqhLinkedList <ElemrntType> {
    Node<ElemrntType> head =null;
    public void addFirst(ElemrntType element){
        Node<ElemrntType> node = new Node<ElemrntType>();
        node.data0 =element;
        node.next0 =head;
        head = node;
    }
    public void add(ElemrntType element){
        Node<ElemrntType> node = new Node<ElemrntType>();
        Node<ElemrntType> i = head;
        while (i.next0 != null){
            i=i.next0;
        }
        node.data0 = element;
        i.next0 = node;
        node.next0 = null;
    }
    public void display(){
        Node<ElemrntType> i = head;
        int k = -1;
        while (i.next0 != null){
            k = k + 1;
            System.out.print(k + "," + i.data0 + "     ");
            i = i.next0;
        }
        k++;
        System.out.println(k + "," + i.data0 + "     ");
    }
    public void insert(int index,ElemrntType element){
        Node<ElemrntType> i = head;
        int k = - 1;
        Node<ElemrntType> iprevious;
        while (i.next0 != null){
            iprevious = i;
            i = i.next0;
            k = k + 1;
            if (k == index - 1){
                Node<ElemrntType> node = new Node<ElemrntType>();
                node.data0 = element;
                node.next0 = i ;
                iprevious.next0 = node;
            }
        }
    }
    public void set(int index , ElemrntType element){
        Node<ElemrntType> i = head;
        Node<ElemrntType> iprevious ;
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
    public ElemrntType get(int index){
        Node<ElemrntType> i = head;
        int k = -1;
        while (i.next0 != null){
            i = i.next0;
            k = k + 1;
            if (k == index){
                return (ElemrntType) i.data0;
            }
        }
        return null;
    }
    public void removeLast(){
        Node<ElemrntType> i = head;
        Node<ElemrntType> iprevious = null;
        while (i.next0 != null){
            iprevious = i ;
            i = i.next0;
        }
        iprevious .next0 = null;
    }
    public void delete (int index){
        Node<ElemrntType> i = head;
        Node<ElemrntType> iprevious;
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
