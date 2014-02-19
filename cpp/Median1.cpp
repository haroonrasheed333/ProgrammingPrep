//
//  Median1.cpp
//  Test
//
//  Created by Haroon on 2/6/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "Median1.h"
using namespace std;

int min(int a, int b) {
    return a < b ? a : b;
}

int max(int a, int b) {
    return a > b ? a : b;
}

int median(int arr[], int n) {
    if (n % 2 == 0)
        return (arr[n/2] + arr[n/2 -1]) / 2;
    else
        return arr[n/2];
}

int medianSorted(int arr1[], int arr2[], int n) {
    if (n == 0)
        return 0;
    if (n == 1)
        return (arr1[0] + arr2[0]) / 2;
    if (n == 2)
        return (max(arr1[0], arr2[0]) + min(arr1[1], arr2[1]))/2;
    
    int m1 = median(arr1, n);
    int m2 = median(arr2, n);
    
    if (m1 == m2)
        return m1;
    
    if (m1 > m2)
        return medianSorted(arr1, arr2 + n/2, n/2);
    
    else
        return medianSorted(arr1 + n/2, arr2, n/2);
    
}

int main() {
    int array1[] = {1, 3, 5, 7, 9, 11};
    int array2[] = {2, 4, 5, 8, 10, 12};
    int array3[] = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10, 11, 12};

    int median1 = medianSorted(array1, array2, 6);
    int median2 = median(array3, 12);
    
    cout << median1 << endl;
    cout << median2 << endl;
    
    return 0;
}