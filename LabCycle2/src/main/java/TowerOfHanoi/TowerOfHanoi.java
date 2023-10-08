/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TowerOfHanoi;

/**
 *
 * @author swani
 */
public class TowerOfHanoi {
    public static void TowerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        TowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        TowerOfHanoi(n - 1, auxiliary, source, destination);
    }
    public static void main(String[] args) {
        int numDisks = 3; // Change this to the desired number of disks
        TowerOfHanoi(numDisks, 'A', 'B', 'C');
    }
}





