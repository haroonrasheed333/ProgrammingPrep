//
//  QSel3.cpp
//  Test
//
//  Created by Haroon on 2/6/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "QSel3.h"
using namespace std;

int QSel(int arr[], int left, int right, int n) {
    int i = left, j = right;
    int pivot = (i + j) / 2;
    
    while (i < j) {
        while (arr[i] > arr[pivot])
            i++;
        while (arr[j] < arr[pivot])
            j--;
        
        if (i < j)  {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    int length = j - left + 1;
    if (length == n)
        return arr[j];
    
    if (n < length)
        return QSel(arr, left, j-1, n);
    else
        return QSel(arr, j+1, right, n - length);
}

int main() {
    int arr[] = {3, 1, 5, 2, 4, 8, 6};
    
    cout << QSel(arr, 0, 6, 1) << endl;
    cout << QSel(arr, 0, 6, 2) << endl;
    cout << QSel(arr, 0, 6, 3) << endl;
    cout << QSel(arr, 0, 6, 4) << endl;
    cout << QSel(arr, 0, 6, 5) << endl;
    cout << QSel(arr, 0, 6, 6) << endl;
    cout << QSel(arr, 0, 6, 7) << endl;
    
    return 0;
}