//
//  1.3.cpp
//  Test
//
//  Created by Haroon on 1/2/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "1.3.h"
#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "haroonrasheedpaulmohamed";
    
    int tail = 1;
    
    size_t len = str.length();
    
    for (int i = 1; i < len; ++i) {
        int j;
        for (j = 0; j < tail; ++j) {
            if (str[i] == str[j]) {
                break;
            }
        }
        
        if (j == tail) {
            str[tail] = str[i];
            ++tail;
        }
    }
    
    str[tail] = 0;
    
    cout << str;
    
    return 0;
    
}
