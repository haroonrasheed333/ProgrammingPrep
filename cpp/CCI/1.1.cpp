//
//  1.1.cpp
//  Test
//
//  Created by Haroon on 1/1/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "1.1.h"
#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "paulohedm";
    int flag = 0;
    
    int *a = new int[256];
    
    for (int k=0; k < str.length(); k++) {
        if (a[str[k]] > 0) {
            flag = 1;
            break;
        }
        else {
            a[str[k]] += 1;
        }
    }
    
    if (flag == 1) {
        cout << "The string does not have all unique characters.";
    }
    else {
        cout << "The string has all unique characters.";
    }
    
}
