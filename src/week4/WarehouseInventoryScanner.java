/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author 292024
 */
public class WarehouseInventoryScanner {
    
}
    
    static Scanner sc = new Scanner(System.in);
    static int[][] warehouse = {
        {10, -1, 5},
        {2, 15, 0},
        {3, -1, 1}
    };

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== WAREHOUSE MENU ===");
            System.out.println("View Inventory");
            System.out.println("Total Inventory (skip damaged)");
            System.out.println("Find First Critically Low Shelf");
            System.out.println("Restock a Shelf");
            System.out.println("Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> viewInventory();
                case 2 -> totalInventory();
                case 3 -> findLowShelf();
                case 4 -> restockShelf();
                case 5 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice!= 5);
    }

    static void viewInventory() {
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                System.out.print(warehouse[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void totalInventory() {
        int total = 0;
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] == -1) {
                    continue; 
                }
                total += warehouse[i][j];
            }
        }
        System.out.println("Total inventory: " + total);
    }

    static void findLowShelf() {
        outer: for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j]!= -1 && warehouse[i][j] < 2) {
                    System.out.println("Low at Row " + i + " Col " + j);
                    break outer; 
                }
            }
        }
    }

    static void restockShelf() {
        while (true) {
            System.out.print("Enter row and col: ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 0 || r >= 3 || c < 0 || c >= 3) continue;
            if (warehouse[r][c] == -1) {
                System.out.println("Damaged!");
                continue;
            }
            System.out.print("New amount: ");
            warehouse[r][c] = sc.nextInt();
            return; 
        }
    }
