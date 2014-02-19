//
//  LL1.cpp
//  Test
//
//  Created by Haroon on 11/4/13.
//  Copyright (c) 2013 Haroon. All rights reserved.
//

#include "LL1.h"
using namespace std;

class Node {
    int info;
    Node *next;
    
public:
    
    Node() {
        info = 0;
        next = NULL;
    }
    
    void setInfo(int val) {
        info = val;
    }
    
    void setNext(Node *n) {
        next = n;
    }
    
    int getInfo() {
        return info;
    }
    
    Node* getNext() {
        return next;
    }
};

class Tree {
    Node *first, *curr;
    
public:
    
    Tree() {
        first = NULL;
        curr = NULL;
    }
    
    void insertNode(int val) {
        Node* temp = new Node();
        temp->setInfo(val);
        temp->setNext(NULL);
        if (first == NULL) {
            first = temp;
            curr = first;
        }
        else {
            curr->setNext(temp);
            curr = temp;
        }
    }
    
    void printLL() {
        if (first == NULL) {
            cout << "The linked list is empty.";
        }
        else {
            curr = first;
            while (curr != NULL) {
                cout << curr->getInfo() << " ";
                curr = curr->getNext();
            }
        }
    }
    
    void deleteFirstNode() {
        if (first == NULL) {
            cout << "The linked list is empty.";
        }
        else {
            first = first->getNext();
        }
    }
    
    void deleteLastNode() {
        if (first == NULL) {
            cout << "The linked list is empty.";
        }
        else {
            if(first->getNext() == NULL) {
                first = NULL;
            }
            else {
                curr = first;
                while (curr->getNext() != NULL) {
                    if (curr->getNext()->getNext() == NULL) {
                        curr->setNext(NULL);
                    }
                    else {
                        curr = curr->getNext();
                    }
                }
            }
        }
    }
    
    void deleteNodesOfValue(int value) {
        if (first == NULL) {
            cout << "The linked list is empty.";
        }
        else {
            while (first->getInfo() == value) {
                if (first->getNext() != NULL) {
                    first = first->getNext();
                }
            }
            curr = first;
            while (curr->getNext() != NULL) {
                if (curr->getNext()->getInfo() == value) {
                    if(curr->getNext()->getNext() == NULL) {
                        curr->setNext(NULL);
                    }
                    else {
                        curr->setNext(curr->getNext()->getNext());
                    }
                }
                curr = curr->getNext();
            }
        }

    }
    
};

int main() {
    Tree *t = new Tree();
    t->insertNode(5);
    t->insertNode(3);
    t->insertNode(5);
    t->insertNode(4);
    t->insertNode(2);
    t->insertNode(5);
    t->insertNode(7);
    t->insertNode(5);
    t->insertNode(2);
    t->insertNode(1);
    t->insertNode(5);
    
    cout << "The entered linked list is: ";
    t->printLL();
    
    cout << "Deleting first node. ";
    t->deleteFirstNode();
    
    cout << "\nLinked list after deleting first node. ";
    t->printLL();
    
    cout << "Deleting last node. ";
    t->deleteLastNode();
    
    cout << "\nLinked list after deleting last node. ";
    t->printLL();
    
    cout << "\nDelete all nodes of value ";
    int d;
    
    cin >> d;
    
    t->deleteNodesOfValue(d);
    t->printLL();
    
    
}
