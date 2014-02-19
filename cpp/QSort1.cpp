//
//  QSort1.cpp
//  Test
//
//  Created by Haroon on 2/4/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "QSort1.h"
using namespace std;

void quickSort(int arr[], int left, int right) {
    
    int i = left, j = right;
    int pivot = arr[(i+j) / 2];
    
    while (i < j) {
        while (arr[i] < pivot)
            i++;
        while (arr[j] > pivot)
            j--;
        
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    if (left < j)
        quickSort(arr, left, j-1);
    if (i < right)
        quickSort(arr, i+1, right);
    
}

int main() {
    int array[] = {4, 1, 6, 2, 5, 3, 9};
    
    int len = sizeof(array)/sizeof(array[0]);
    
    quickSort(array, 0, len-1);
    
    for (int k = 0; k < len; k++) {
        cout << array[k] << " ";
    }
    
    return 0;
    
}