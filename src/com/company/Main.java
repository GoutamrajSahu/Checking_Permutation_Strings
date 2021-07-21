package com.company;
import java.util.*;
//import java.util.Arrays;
public class Main {

    static String sortString(String str1){
        String res = "";
        char[] ArrayOfStr = str1.toCharArray();

        Arrays.sort(ArrayOfStr);  // Sort by internal method or sort manually by Bubble sort as below commented codes.

//        for(int i=0 ; i<ArrayOfStr.length-1; i++){
//            for(int j=0 ; j<ArrayOfStr.length-i-1; j++){
//                if(ArrayOfStr[j] > ArrayOfStr[j+1]){
//                    char temp = ArrayOfStr[j];
//                    ArrayOfStr[j] = ArrayOfStr[j+1];
//                    ArrayOfStr[j+1] = temp;
//                }
//            }
//        }

        for (char c : ArrayOfStr) {
            res = res + c;
        }
        System.out.println(res);
        return(res);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter tow Strings: ");
        String str1 = Sc.nextLine();
        String str2 = Sc.nextLine();
        if(sortString(str1).equals( sortString(str2))){
            System.out.println("Permutation strings.");
        }else{
            System.out.println("Not permutation strings.");
        }
    }
}