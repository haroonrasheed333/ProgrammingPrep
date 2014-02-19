//
//  Remove_Duplicates.h
//  Test
//
//  Created by Haroon on 10/31/13.
//  Copyright (c) 2013 Haroon. All rights reserved.
//

#ifndef __Test__Remove_Duplicates__
#define __Test__Remove_Duplicates__

#include <iostream>
using namespace std;

#endif /* defined(__Test__Remove_Duplicates__) */

class node {
    int info;
    node *next;
    
public:
    node () {
        info = 0;
        next = NULL;
    }
    void setInfo(int val) {
        info = val;
    }
    void setNext(node *n) {
        next = n;
    }
    int getInfo() {
        return info;
    }
    node* getNext() {
        return next;
    }
};

class linked_list {
    node *first, *curr;
public:
    linked_list () {
        first = NULL;
        curr = NULL;
    }
    void insert(int val) {
        node *temp = new node();
        temp->setInfo(val);
        
        if (first == NULL) {
            first = temp;
            curr = first;
        }
        else {
            curr->setNext(temp);
            curr = temp;
        }
    }
    void print_ll () {
        if (first == NULL) {
            cout << "Linked List is empty";
        }
        else {
            curr = first;
            while (curr != NULL) {
                cout << curr->getInfo() << " ";
                curr = curr->getNext();
            }
        }
    }
    
    void rem_duplicates() {
        if (first == NULL) {
            cout << "Linked List is empty";
        }
        
        curr = first;
        while (curr != NULL) {
            node *tmp = curr;
            while (tmp->getNext() != NULL) {
                if (tmp->getNext()->getInfo() == curr->getInfo()) {
                    if (tmp->getNext()->getNext() != NULL) {
                        tmp->setNext(tmp->getNext()->getNext());
                    }
                    else {
                        tmp->setNext(NULL);
                    }
                }
                else {
                    tmp = tmp->getNext();
                }
            }
            curr = curr->getNext();
        }
    }
};

int main() {
    linked_list *ll = new linked_list();
    ll->insert(3);
    ll->insert(2);
    ll->insert(3);
    ll->insert(4);
    ll->insert(3);
    ll->insert(13);
    ll->insert(6);
    ll->insert(3);
    ll->insert(3);
    ll->insert(2);
    ll->insert(3);
    
    cout << "The entered linked list is: ";
    
    ll->print_ll();
    
    cout << "\nRemoving duplicates ";
    
    ll->rem_duplicates();
    
    ll->print_ll();
    return 0;
}