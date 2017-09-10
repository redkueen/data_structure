package com.xqh.data_structure;

import com.xqh.java_basic_practice.array_tool2.ArrayTool2;

public class XqhArray {
    int[] array;//new的时候产生
    XqhArray(){
        this.array = new int[5];
    }

    void set(int index,int element){
        revertArrCreated = false;
        this.array[index]=element;
    }

   int  get(int index){
       return (this.array[index]);
    }
    int i = -1;
   void add(int element){
       revertArrCreated =false;
       i = i + 1;
//       数组扩展/扩容：扩充容量
    if(i>= array.length){
       int[] twoArray = new int[array.length * 2];

       for(int k =0;k<i;k++){
           twoArray[k] = array[k];
       }
       this.array = twoArray;
    }
       this.array[i] = element;
    }
    void removeLast(){
       revertArrCreated = false;
       i=i-1;
    }
    void display() {
        int n = 0;
        while (n<i+1) {
         System.out.print(this.array[n]+" ");
         n++;
        }
        System.out.println();
    }
    int indexOf(int element){
        int x =0;
        while (x<= this.i) {
            if (this.array[x] ==element){
                return x;
            }
            x++;
        }
        return -1;
    }

    int[] revertArr;
    boolean revertArrCreated ;//标志变量:反向数组已创建?

    void createReverseIndex() {

        revertArr = new int[ArrayTool2.findMax_finrMin(array).m_max  +1];

        int x = 0;
        while (x <= i) {
            revertArr[array[x]] = x;
            x++;
        }
    }

    int indexOfUsingReverseIndex(int element) {
        if(revertArrCreated == false){

            this.createReverseIndex();
            revertArrCreated = true;
        }
        int m = revertArr[element];
        return m;
    }
    int length(){
        int length = i + 1;
        return length;
    }
    int size(){
        int size=i+1;
        return size;
    }
    int capacity(){
        return array.length;
    }
    void delete(int index){
        this.revertArrCreated = false;
        for(int k = index;k <this.i;k++){
            array[k] = array[k +1];
        }
        this.i = this.i - 1;
    }
}