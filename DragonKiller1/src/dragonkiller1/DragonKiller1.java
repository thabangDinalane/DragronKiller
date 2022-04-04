/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonkiller1;

import static dragonkiller1.Dragon.insertionSort;
import java.util.Scanner;
import java.util.*;



/**
 *
 * @author thaba
 */
public class DragonKiller1 {
    
    String namSurname;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner string = new Scanner(System.in);
        
       //User input
       System.out.println("Hello, Welcome to DrogonKiller! ");
       System.out.println("Pleas enter your NAME and SURNAME: ");
       String namSurname = string.nextLine();
       
       Dragon str = new Dragon(namSurname);
       System.out.println("Your name and surname without spaces is : " + str.Remove_Spaces() );
       
      //Counting length of username!;
       String userInput3 =  namSurname ;
         
            //variable declaration to hold the length of nameSurname!;
            int count = 0;
            
            for(int i = 0; i < userInput3.length(); i ++){
                if(userInput3.charAt(i)!=' '){
                count++;
            }
        }
            
       System.out.println("Your name count is : " + count );
       
       //Creating an array!
       int[] arrayDrogon = new int[count];
       for(int i = 0; i < count; i++){
           
           //Creating Random generator
           Random random = new Random();
           int randNumber = random.nextInt(40)+ 10;
           
           //Finding a odd random number.
           while(randNumber %2 == 0 || randNumber == 0){
               randNumber = random.nextInt(40) + 10;
               
           }
           arrayDrogon[i] = randNumber;
       }
       
       //Prining random odd numbers;!
       System.out.println("Random odd numbers with their indexes between 10 and 50 :");
       System.out.println("Index             value");
       for (int x = 0; x < arrayDrogon.length; x++){
           System.out.println(x + "                  " + arrayDrogon[x]);
       }
       
       // creating space
       System.out.println("            ");
      //Calling sorted array!;
      int findDrogon = 0;
      int array []= arrayDrogon;
      array = insertionSort(array);
      
      System.out.println("Sorted array: ");
      System.out.println(Arrays.toString(array));
      
       //Allowing user to enter a value from the arrayDragon element to search for and be remover (Killed!;
       int value;
        System.out.println("Please enter value in array: ");
        Scanner v = new Scanner(System.in);
        value = v.nextInt();
        
        
       System.out.println(Dragon.binarySearch(array, value));
       System.out.println("Your found value is : " + value);
       //value = findDrogon;
       
       //Replacing uservalue with Dragon!;
       
      for (int i =0; i < array.length; i++){
          if(array[i] == value){
            array[i] = 0;
          }
          
          System.out.println(array[i]);
      }
      
      System.out.println("ArrayDragon with the killed element Printed !!!!! : ");
    }
}
