//
//  Hash.cpp
//  Test
//
//  Created by Haroon on 10/30/13.
//  Copyright (c) 2013 Haroon. All rights reserved.
//

#include "Hash.h"
#include <unordered_map>


using namespace std;


int main()
{
    unordered_map<string, string> hashtable;
    hashtable.emplace("www.element14.com", "184.51.49.225");
    hashtable.emplace("www.google.com", "183.52.49.225");
    
    cout << "IP Address: " << hashtable["www.element14.com"] << endl;
    cout << "IP Address: " << hashtable["www.google.com"] << endl;
    
    for (auto itr = hashtable.begin(); itr != hashtable.end(); itr++)
    {
        cout << itr->first << ": " << itr->second << endl;
        cout << (*itr).first << ": " << (*itr).second << endl; //Same as the above statement
    }
    
    return 0;
}