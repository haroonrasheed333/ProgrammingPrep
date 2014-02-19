//
//  1.2.cpp
//  Test
//
//  Created by Haroon on 1/2/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "1.2.h"
#include <iostream>
using namespace std;

int main() {
    char* str = new char[10];
    str = "haroon";
    char tmp;
    
    char* end = str;
    
    if (str) {
        while (*end) {
            ++end;
        }
        --end;
        
        while (str < end) {
            tmp = *str;
            *str++ = *end;
            *end-- = tmp;
        }
    }
    cout << str;
    return 0;
}