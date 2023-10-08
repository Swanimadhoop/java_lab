/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicArray;

import java.util.Scanner;

/**
 *
 * @author swani
 */
public class DynamicArray {
    private int[] array;
    private int size;
    
    public DynamicArray(){
        this.size = 0;
        array = new int[size];
    }
    
    
    public DynamicArray(int size){
        this.size= size;
        this.array = new int[size];
    }
    
    
    public void arrayRead(){
        Scanner sc= new Scanner(System.in);
        System.err.println("Elements elements in the array: ");
        for(int i = 0; i<array.length-1; i++){
            array[i] = sc.nextInt();
        }
    }
    
    
    public void printArray(){
        for(int i=0;i<array.length-1;i++){
            System.out.print(array[i]+ " ");
        }
    }
    
    
    public void addElement(int element, int pos){
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position to add the element.");
            return;
        }

        for (int i = size - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = element;
        size++;
    }
    
    
    public void removeElement(int element) {
        boolean bool = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                bool = true;
                break;
            }
        }

        if (bool == true) {
            size--;
        } else {
            System.out.println("The element is not present in the array ");
        }
    }
    
    
    public void searchArray(int element) {
        boolean bool = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                bool = true;
                break;
            }
        }
        if (bool == true) {
            System.out.println("The element is present in the array ");
        } else {
            System.out.println("The element is not present in the array ");
        }
    }
}
