//
//  UM.cpp
//  Test
//
//  Created by Haroon on 2/5/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "UM.h"
#include <unordered_map>
#include <iostream>
#include <string>
using namespace std;

int main() {
    unordered_map <string, string> m;
    m["name"] = "haroon";
    cout << m["name"] << endl;
    
    unordered_map <int, string> n;
    n[1] = "rasheed";
    cout << n[1] << endl;
    
    n.insert(pair<int, string>(3, "paul"));
    cout << n[3] << endl;
    
    for (auto It = n.begin(); It != n.end(); ++It)
    {
        cout << It->first << " equals " << It->second << std::endl;
    }
}