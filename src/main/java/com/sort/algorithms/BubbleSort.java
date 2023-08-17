package com.sort.algorithms;

public class BubbleSort {

  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };

    int[] sortedArray = sort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.println(sortedArray[i]);
    }
  }

  public static int[] sort(int[] array) {
    int staging;
    boolean swapped = false;
    for (int i = 0; i < array.length - 1; i++) {
      for (int y = 0; y < array.length - 1; y++) {
        if (array[y] > array[y + 1]) {
          staging = array[y];
          array[y] = array[y + 1];
          array[y + 1] = staging;
          swapped = true;
        }
      }
      if (swapped = false)
        break;
    }
    return array;
  }
}
