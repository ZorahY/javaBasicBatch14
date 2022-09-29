package com.ReviewArrayLoops;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int start=11;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = start;
			start++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("******ENHANCED********");
		int sum=0;
		for (int num:arr) {
			sum=sum+num;
		}
		System.out.println(sum);
	}

}
