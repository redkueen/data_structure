package com.xqh.data_structure.dynamic_array;

import com.xqh.java_basic_practice.array_tool2.ArrayTool2;

public class XqhArray {
    private int[] array;//new的时候产生
    public XqhArray(){
        this.array = new int[5];
    }

    public void set(int index,int element){
        revertArrCreated = false;
        this.array[index]=element;
    }

   public int  get(int index){
       return (this.array[index]);
    }
    private int i = -1;
   public void add(int element){
       revertArrCreated =false;
       i = i + 1;
//       数组扩展/扩容：扩充容量
//    if(i>= array.length){
//       int[] twoArray = new int[array.length * 2];
//
//       for(int k =0;k<i;k++){
//           twoArray[k] = array[k];
//       }
//       this.array = twoArray;
//    }
       if(i>=array.length){
           this.addCapacity();
       }
       this.array[i] = element;
    }
    public void addCapacity(){
        if(i>= array.length){
            int[] twoArray = new int[array.length * 2];

            for(int k =0;k<i;k++){
                twoArray[k] = array[k];
            }
            this.array = twoArray;
        }

    }
   public void removeLast(){
       revertArrCreated = false;
       i=i-1;
    }
   public void display() {
        int n = 0;
        while (n<i+1) {
         System.out.print(this.array[n]+" ");
         n++;
        }
        System.out.println();
    }
   public int indexOf(int element){
        int x =0;
        while (x<= this.i) {
            if (this.array[x] ==element){
                return x;
            }
            x++;
        }
        return -1;
    }

    private int[] revertArr;
    private boolean revertArrCreated ;//标志变量:反向数组已创建?

    private void createReverseIndex() {

        revertArr = new int[ArrayTool2.findMax_finrMin(array).m_max  +1];

        int x = 0;
        while (x <= i) {
            revertArr[array[x]] = x;
            x++;
        }
    }

    public int indexOfUsingReverseIndex(int element) {
        if(revertArrCreated == false){

            this.createReverseIndex();
            revertArrCreated = true;
        }
        int m = revertArr[element];
        return m;
    }
    public int length(){
        int length = i + 1;
        return length;
    }
    public int size(){
        int size=i+1;
        return size;
    }
    public int capacity(){
        return array.length;
    }
    public void delete(int index){
        this.revertArrCreated = false;
        for(int k = index;k <this.i;k++){
            array[k] = array[k +1];
        }
        this.i = this.i - 1;
    }
    public void insert(int index,int element) {
        if (i == array.length-1) {
            this.addCapacity();
        }
            for (int k = array.length - 1; k > array.length - index - 1; k--) {
                array[k] = array[k - 1];
            }
            array[index] = element;
            this.i = this.i + 1;
        }
}