package com.leon.binary;

public class BinarySerach {
	public static void main(String[] args) {
		int[] src = new int[]{1,3,5,7,8,9};
		System.out.println(binarySearch(src, 8, 0, src.length - 1));
	}

	private static int binarySearch(int[] dataset, int data, int beginIndex, int endIndex) {
		int midIndex = (beginIndex + endIndex) / 2;
		if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex) {
			return -1;
		}
		if (data < dataset[midIndex]) {
			return binarySearch(dataset, data, beginIndex, midIndex - 1);
		} else if (data > dataset[midIndex]) {
			return binarySearch(dataset, data, midIndex + 1, endIndex);
		}else {
			return midIndex;
		}
	}
}
