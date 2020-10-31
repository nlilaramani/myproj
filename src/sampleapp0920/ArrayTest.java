/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp0920;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author itexps
 */
public class ArrayTest {

    /**
     * @param args the command line arguments
     */
    /* Array - multiple values
        
    */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1, name2, name3, name4, name5;
        String name6, name7, name8;
        // Processing and reading those values are logically related
        // Deal with them in collection/array
        int x=0;
        int nums[]={72,89,56,78,87,100,93,64};
        System.out.println("Length:"+nums.length);
        System.out.println("2nd Element:"+nums[1]);
        System.out.println("5th Element:"+nums[4]);
        nums[2]=54;
        System.out.println("3rd Element:"+nums[2]);
        int sum=0;
        int min=10000;
        int max=0;
        int numtofind=87;
        int index=0;
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            sum=sum+nums[i];
            if (nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]==numtofind){
                index=i;
            }
        }
        System.out.println("Index:"+index);
        System.out.println("Sum of the marks:"+sum);
        System.out.println("Avg:"+sum/nums.length);
        // Can we find min and max
        System.out.println("Min:"+min);
        System.out.println("Max:"+max);
        
        String[] friends={"Tom","Mike","Joe","Bob"};
        String name="joe";
        boolean nameInTheList=false;
        for(String friend:friends){
            System.out.println(friend); // friends[i]
        }
        
        for (String friend : friends) {
            System.out.println(friend);
            if (friend.equalsIgnoreCase(name)) {
                nameInTheList=true;
                break;
            }
        }
        if(nameInTheList){
            System.out.println(name+" is in the list");
        }else{
            System.out.println(name+" is not in the list");
        }
        
        String accountname;
        int accountNumber;
        double balance;
        boolean isAccountActive;
        double fees;
        accountname="";
    }
}
