package com.example.todolist;

import java.util.Scanner;

public class ToDoListArrayList {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDoList= new ToDoList();

    public static void main(String[] args) {

        boolean quit= false;
        int choise= 0;

        printInstructions();
        while (!quit) {
            System.out.print("\nSkriv in ditt val: ");
            choise = scanner.nextInt();
            scanner.nextLine();

            switch (choise) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    toDoList.printtoDoList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nVälj ");
        System.out.println("\t 0 - Visa alternativ.");
        System.out.println("\t 1 - Visa to do-list.");
        System.out.println("\t 2 - Lägg till i to do-list.");
        System.out.println("\t 3 - Ändra i to do-list.");
        System.out.println("\t 4 - Ta bort i to do-list.");
        System.out.println("\t 5 - Sök i to do-list.");
        System.out.println("\t 6 - Avsluta applikationen.");
    }

    public static void addItem() {
        System.out.print("Lägg till i handlingslistan: ");
        toDoList.addtoDoItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Aktuell punkt: ");
        String itemNo = scanner.nextLine();
        System.out.println("Ny punkt: ");
        String newItem = scanner.nextLine();
        toDoList.modifyToDoItem(itemNo, newItem);
    }

        public static void removeItem(){
            System.out.print("Skriv in punkt du vill ta bort: ");
            String itemNo = scanner.nextLine();
            toDoList.removeToDoItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Punkten du söker efter: ");
        String searchItem = scanner.nextLine();
        if(toDoList.onFile(searchItem)) {
            System.out.println("Hittad " + searchItem);
            } else {
            System.out.println(searchItem + " finns inte i listan.");
        }
    }
}