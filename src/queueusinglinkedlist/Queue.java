/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusinglinkedlist;

/**
 *
 * @author AMIT
 */
class Node{
    int data;
    Node next;
    
    Node(int key){
        data=key;
        next=null;
    }
}
class Queue {
    int size;
    Node front=null,rear=null;

    void enqueue(int i) {
        Node node = new Node(i);
        if(rear==null){
            front=rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }
    }

    void dequeue() {
        if(front==null){
            rear=null;
            System.out.println("Queue is empty");
        }
        else {
            front=front.next;
        }
        
    }

    int peek() {
        if(front==null){
            System.out.println("Queue is empty");
            return 0;
        }
        else {
            return front.data;
        }
    }

    void display() {
        Node temp=front;
        if(temp==null){
            System.out.println("Queue is empty");
        }
        else{
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        }
    }
    
}
