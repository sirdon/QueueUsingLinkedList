/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusinglinkedlist;

import java.util.Scanner;

/**
 *
 * @author AMIT
 */
public class QueueUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
    
}
