package com.sort.algorithms;

public class treino {

  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };

    sort(array, 0, array.length - 1);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void sort(int[] array, int low, int high) {

    if (low < high) {

      int pi = partition(array, low, high);

      sort(array, low, pi - 1);
      sort(array, pi + 1, high);
    }

  }

  public static int partition(int[] array, int low, int high) {

    int pivot = array[high];
    int j = low - 1;

    for (int i = low; i < high; i++) {
      if (array[i] <= pivot) {
        j++;
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
      }
    }

    int temp = array[j + 1];
    array[j + 1] = array[high];
    array[high] = temp;
    return j + 1;
  }
}
