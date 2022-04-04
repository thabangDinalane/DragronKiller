/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonkiller1;



/**
 *
 * @author thaba
 */
public class Dragon {
    String namSurname;
    
    //Creating construuctor to old name and surname!;
    public Dragon(String iniNamSurname){
        namSurname = iniNamSurname;
        
    }
    
    //Creating a method!:
    public String Remove_Spaces (){
       char[] chars = namSurname.toCharArray();
       String str = "";
       
       for (int i = 0; i<chars.length; i++)
           if(chars[i]!=' ')
           {
               str = str + chars[i];
           }
       
        return str;
    }
   
    //Creating 
    public static int[] insertionSort(int[]array){
        for (int i = 1; i < array.length; i++){
            int j = i;
            while ((j > 0) && (array[j - 1] > array[j])){
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j - 1] =tmp;
                j--;
             
            }
        }
        return array;
    }
    
    // creatinng binary search!; 
    public static int binarySearch(int[] values,int x){
        int start = 0;
        int end = values.length -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(values[mid] == x)
                return mid;
            else if(values [mid] < x)
                start = mid = 1;
            else 
                end = mid - 1;
            
            
        }
        return -1;
}
    
}