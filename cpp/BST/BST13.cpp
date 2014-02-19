//
//  BST12.cpp
//  Test
//
//  Created by Haroon on 2/1/14.
//  Copyright (c) 2014 Haroon. All rights reserved.
//

#include "BST13.h"
using namespace std;

struct node {
    int info;
    node* left;
    node* right;
};

class BST {
    node* root;
    
public:
    
    void insert_node(int val, node* curr=NULL) {
        node* temp = new node;
        temp->info = val;
        
        if (root == NULL) {
            root = temp;
        }
        else{
            if (curr == NULL) {
                curr = root;
            }
            if (val < curr->info) {
                if (curr->left == NULL) {
                    curr->left = temp;
                }
                else {
                    curr = curr->left;
                    insert_node(val, curr);
                }
            }
            else if (val > curr->info) {
                if (curr->right == NULL) {
                    curr->right = temp;
                }
                else {
                    curr = curr->right;
                    insert_node(val, curr);
                }
            }
        }
    }
    
    void inOrder(node* curr=NULL) {
        if (root == NULL) {
            cout << "The BST is empty";
        }
        else {
            if (curr == NULL) {
                curr = root;
            }
            if (curr->left) {
                inOrder(curr->left);
            }
            cout << curr->info << " ";
            if (curr->right) {
                inOrder(curr->right);
            }
        }
    }
    
    void postOrder(node* curr=NULL) {
        if (root == NULL) {
            cout << "The BST is empty";
        }
        else {
            if (curr == NULL) {
                curr = root;
            }
            if (curr->left) {
                postOrder(curr->left);
            }
            if (curr->right) {
                postOrder(curr->right);
            }
            cout << curr->info << " ";
        }
    }
    
    void preOrder(node* curr=NULL) {
        if (root == NULL) {
            cout << "The BST is empty";
        }
        else {
            if (curr == NULL) {
                curr = root;
            }
            
            cout << curr->info << " ";
            
            if (curr->left) {
                preOrder(curr->left);
            }
            
            if (curr->right) {
                preOrder(curr->right);
            }
        }
    }
    
    int size_bst(node* n) {
        if (n == NULL) {
            return 0;
        }
        else {
            return (size_bst(n->left) + 1 + size_bst(n->right));
        }
    }
    
    int size() {
        if (root == NULL) {
            return 0;
        }
        else {
            return size_bst(root);
        }
    }
    
    int maxDepth_bst(node* n) {
        if (n == NULL) {
            return 0;
        }
        else {
            return (maxDepth_bst(n->left) > maxDepth_bst(n->right) ? maxDepth_bst(n->left)+1 : maxDepth_bst(n->right)+1);
        }
    }
    
    int maxDepth() {
        if (root == NULL) {
            return 0;
        }
        else {
            return (maxDepth_bst(root) - 1);
        }
    }
    
    int diameter_bst(node* n) {
        if (n == NULL) {
            return 0;
        }
        else {
            int ldia = diameter_bst(n->left);
            int rdia = diameter_bst(n->right);
            
            return (ldia + rdia + 1);
        }
    }
    
    int diameter() {
        if (root == NULL) {
            return 0;
        }
        else {
            return (diameter_bst(root) - 2);
        }
    }
    
    int minVal() {
        if (root == NULL) {
            return -1;
        }
        node* curr = root;
        while (curr->left) {
            curr = curr->left;
        }
        return curr->info;
    }
    
    int maxVal() {
        if (root == NULL) {
            return -1;
        }
        node* curr = root;
        while (curr->right) {
            curr = curr->right;
        }
        return curr->info;
    }
    
    void printPaths() {
        int path[100];
        
        if (root == NULL) {
            cout << "The BST is empty.";
        }
        else {
            printPaths_bst(root, path, 0);
        }
    }
    
    void printPaths_bst(node* n, int path[], int pathLen) {
        if (n == NULL) return;
        
        path[pathLen] = n->info;
        pathLen++;
        
        if (n->left == NULL && n->right == NULL) {
            printPathArray(path, pathLen);
        }
        else {
            printPaths_bst(n->left, path, pathLen);
            printPaths_bst(n->right, path, pathLen);
        }
    }
    
    void printPathArray(int path[], int len) {
        for (int i = 0; i < len; i++) {
            cout << path[i] << " ";
        }
        cout << "\n";
    }
    
    int search(int element=0) {
        return search_bst(root, element);
    }
    
    int search_bst(node* curr, int val) {
        while (curr) {
            if (curr->info == val)
                return 1;
            if (val < curr->info) {
                if (curr->left) {
                    curr = curr->left;
                }
                else {
                    return 0;
                }
            }
            
            if (val > curr->info) {
                if (curr->right) {
                    curr = curr->right;
                }
                else {
                    return 0;
                }
            }
        }
        return 0;
    }
};

int main() {
    BST *b = new BST();
    b->insert_node(50);
    b->insert_node(10);
    b->insert_node(40);
    b->insert_node(80);
    b->insert_node(20);
    b->insert_node(00);
    b->insert_node(90);
    b->insert_node(30);
    b->insert_node(70);
    b->insert_node(60);
    b->insert_node(35);
    
//    cout << "\n\nPre-order Traveral: ";
//    b->preOrder();
//    
//    cout << "\n\nInorder Traveral: ";
//    b->inOrder();
//    
//    cout << "\n\nPost-order Traveral: ";
//    b->postOrder();
//    
//    cout << "\n\nThe size of BST is: " << b->size() << endl;
//    
//    cout << "\nThe maxDepth of BST is: " << b->maxDepth() << endl;
//    
//    cout << "\nThe minVal of BST is: " << b->minVal() << endl;
//    
//    cout << "\nThe maxVal of BST is: " << b->maxVal() << endl;
//    
//    cout << " \nRoot-node paths: \n";
//    b->printPaths();
//    
//    cout << " \nDiameter: " << b->diameter();
    
    cout << " \nSearch: " << b->search(10);
    
    
    
    
    return 0;
}
