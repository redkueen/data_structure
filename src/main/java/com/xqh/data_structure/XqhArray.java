package com.xqh.data_structure;
public class XqhArray {
    int[] array;//new的时候产生
    XqhArray(){
        this.array = new int[5];
    }

    void set(int index,int element){
        this.array[index]=element;
    }

   int  get(int index){
       return (this.array[index]);
    }
    int i = -1;
   void add(int element){
       i = i + 1;
       this.array[i] = element;


    }

}
