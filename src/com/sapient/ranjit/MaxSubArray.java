package com.sapient.ranjit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSubArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr= br.readLine().split(" ");
        int k = Integer.parseInt(br.readLine());
        int size = strArr.length;
        System.out.println(maxSubArray(strArr,size,k));
    }
    public static int maxSubArray(String arr[],int n,int k){
        if(n < k){
            System.out.println("Invalid");
            return -1;
        }
        int result = 0;
        for(int i=0;i<k;i++){
            result = result+Integer.parseInt(arr[i]);
        }
        int currentSum = result;
        for(int i = k;i<n;i++){
            currentSum = currentSum+Integer.parseInt(arr[i])-Integer.parseInt(arr[i-k]);
            result = Math.max(currentSum,result);
        }
        return result;
    }

}
