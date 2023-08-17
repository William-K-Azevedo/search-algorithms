package com.sort.algorithms;

public class MergeSort {
  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };
    int arrayLength = array.length;

    sort(array, arrayLength);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void sort(int[] array, int length) {

    if (length < 2) {
      return;
    }

    int mid = length / 2;
    int[] left = new int[mid];
    int[] right = new int[length - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = array[i];
    }

    for (int i = mid; i < length; i++) {
      right[i - mid] = array[i];
    }

    sort(left, mid);
    sort(right, length - mid);

    merge(array, left, right, mid, length - mid);

  }

  public static void merge(int[] array, int[] left, int[] right, int leftLength, int rightLength) {

    int i = 0, j = 0, k = 0;

    while (i < leftLength && j < rightLength) {
      if (left[i] <= right[j]) {
        array[k++] = left[i++];
      } else {
        array[k++] = right[j++];
      }

    }

    while (i < leftLength) {
      array[k++] = left[i++];
    }
    while (j < rightLength) {
      array[k++] = right[j++];
    }
  }
}
