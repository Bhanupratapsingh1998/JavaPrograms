package com.code.collections;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class HashMapQ1 {
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                 map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key+"=>"+map.get(key));
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,4,5,2,1,7,6,1};
//        int nums[] = {1,2,3,4};
        majorityElement(nums);
    }
}
