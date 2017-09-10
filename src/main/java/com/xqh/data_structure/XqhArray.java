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

    int[] revertArr = new int[100];

    void createReverseIndex() {
        int x = 0;
        while (x <= i) {
            revertArr[array[x]] = x;
            x++;
        }
    }

    int indexOfUsingReverseIndex(int element) {
        int m = revertArr[element];
        return m;
    }

}