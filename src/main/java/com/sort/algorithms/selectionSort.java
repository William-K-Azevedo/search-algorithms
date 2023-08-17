package com.sort.algorithms;

public class selectionSort {

  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };

    int[] sortedArray = sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(sortedArray[i]);
    }
  }

  public static int[] sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[min]) {
          min = j;
        }
      }
      int staging = array[min];
      array[min] = array[i];
      array[i] = staging;
    }
    return array;
  }
}
