package com.sort.algorithms;

public class InsertionSort {

  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };

    int[] sortedArray = sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(sortedArray[i]);
    }
  }

  public static int[] sort(int[] array) {

    for (int i = 1; i < array.length; i++) {

      int key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }

      array[j + 1] = key;
    }
    return array;
  }
}
