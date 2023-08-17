package com.sort.algorithms;

public class QuickSort {

  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };
    int arrayLength = array.length;

    sort(array, 0, arrayLength - 1);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static int partition(int[] array, int low, int high) {

    int pivot = array[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return i + 1;
  }

  public static void sort(int[] array, int low, int high) {

    if (low < high) {
      int pi = partition(array, low, high);

      sort(array, low, pi - 1);
      sort(array, pi + 1, high);

    }
  }
}
