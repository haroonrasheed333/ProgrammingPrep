//
//  RSA1.cpp
//  Test
//
//  Created by Haroon on 2/6/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "RSA1.h"
using namespace std;

int rotatedSortedArray(int arr[], int start, int end, int num) {
    int mid = (start + end) / 2;
    
    if (arr[mid] == num)
        return mid;
    
    if (arr[mid] < arr[end]) {
        if (num > arr[mid] && num <= arr[end])
            return rotatedSortedArray(arr, mid+1, end, num);
        else
            return rotatedSortedArray(arr, start, mid-1, num);
    }
    else {
        if (num < arr[mid] && num >= arr[start])
            return rotatedSortedArray(arr, start, mid-1, num);
        else
            return rotatedSortedArray(arr, mid+1, end, num);
    }
}

int main() {
    int array[] = {7,8,9,1,2,3,4,5,6};
    int pos = rotatedSortedArray(array, 0, 8, 3);
    
    cout << pos << endl;
    
    return 0;
}