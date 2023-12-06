/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Solution {

    public static String restoreString(String s, int[] indices) {
        String ans="";
          int temp = 0;
        for(int i = 0; i<indices.length; i++){
          
            
            for(int j = 0;j<indices.length; j++){
                System.out.println(i +" , "+  j );
                if(temp == indices[i]){
                       System.out.println(temp);
                    temp++;
                
                    char ts2 =s.charAt(i);
                    String ts3 = String.valueOf(ts2);
                    ans  =  ans.concat(ts3);
                }
            
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] =  {2,3,4,0,1};
        String s =  restoreString("Asjad", arr);
        System.out.println(s);
    }
}
