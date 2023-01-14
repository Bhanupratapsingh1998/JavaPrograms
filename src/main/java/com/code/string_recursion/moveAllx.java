package com.code.string_recursion;

/**
 *
 * @author User
 */
public class moveAllx {
    public static void moveAllx(String str,int idx,int count,String newStr){
        if(idx == str.length()-1){
            for(int i = 0;i<count;i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
       char currChar  = 'x';
       if(currChar == str.charAt(idx)){
           count++;
           moveAllx(str,idx+1,count,newStr);
       }else{
           newStr +=  str.charAt(idx);
            moveAllx(str,idx+1,count,newStr);
       }
    }
    public static void main(String[] args) {
        String str = "abxacxxda";
        moveAllx(str,0,0,"");
    }
}
