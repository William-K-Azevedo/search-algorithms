package com.sort.algorithms;

public class HeapSort {

  public static void main(String[] args) {
    int[] array = { 64, 34, 25, 12, 22, 11, 90 };
    int arrayLength = array.length;

    sort(array, arrayLength);

    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void sort(int[] array, int length) {

    for (int i = length / 2 - 1; i >= 0; i--) {
      heapify(array, length, i);
    }

    for (int i = length - 1; i >= 0; i--) {
      int temp = array[0];
      array[0] = array[i];
      array[i] = temp;

      heapify(array, i, 0);
    }
  }

  public static void heapify(int[] array, int length, int i) {

    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < length && array[left] > array[largest]) {
      largest = left;
    }

    if (right < length && array[right] > array[largest]) {
      largest = right;
    }

    if (largest != i) {
      int swap = array[i];
      array[i] = array[largest];
      array[largest] = swap;

      heapify(array, length, largest);
    }
  }
}
