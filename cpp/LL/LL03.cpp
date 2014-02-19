//
//  LL03.cpp
//  Test
//
//  Created by Haroon on 2/2/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "LL03.h"
using namespace std;

struct node {
    int info;
    node* next;
};

class LL {
    node *first, *curr;
    
public:
    LL() {
        first = NULL;
        curr = NULL;
    }
    
public:
    void insert(int val) {
        node* temp = new node;
        temp->info = val;
        temp->next = NULL;
        
        if (first == NULL) {
            first = temp;
            curr = first;
        }
        else {
            curr->next = temp;
            curr = temp;
        }
    }
    
    void printLL() {
        if (first == NULL) {
            cout << "The linked list is empty";
        }
        else {
            curr = first;
            while (curr != NULL) {
                cout << curr->info << " ";
                curr = curr->next;
            }
        }
    }
    
    void reverseList() {
        if (first == NULL) {
            cout << "The linked list is empty";
        }
        else {
            node *prev = NULL, *curr = NULL, *next = NULL;
            curr = first;
            while(curr != NULL){
                next = curr->next;
                curr->next = prev;
                prev = curr;
                curr = next;
            }
            first = prev;
        }
    }
    
    void rev()
    {
        if (first == NULL) {
            cout << "The linked list is empty";
        }
        else {
            node *a = first, *b = NULL;
            while(a->next!=NULL)
            {
                b = a->next;
                a->next = a->next->next;
                b->next = first;
                first = b;
            }
        }
    }
};

int main() {
    LL *l = new LL();
    l->insert(5);
    l->insert(3);
    l->insert(4);
    l->insert(5);
    l->insert(1);
    l->insert(6);
    l->insert(2);
    l->insert(9);
    
    LL* l1 = new LL();
    l1 = l;
    
    cout << "The inserted linked list is: ";
    l->printLL();
    
    l->reverseList();
    cout << "\n";
    l->printLL();
    
//    l->rev();
//    cout << "\n";
//    l->printLL();
    
    cout << "\n Duplicate: ";
    l1->printLL();
    
    
    
    return 0;
}