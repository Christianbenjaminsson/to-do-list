package com.example.todolist;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDoList= new ArrayList<String>();

    public void addtoDoItem(String item){

        toDoList.add(item);
    }

    public void printtoDoList(){
        System.out.println("Du har " +toDoList.size()+ " saker i den att-göra lista");
        for (int i=0; i< toDoList.size(); i++ ) {
            System.out.println((i+1) + ". " + toDoList.get(i));
        }
    }

    public void modifyToDoItem(String currentItem, String newItem){
        int position= findItem(currentItem);
        if(position >= 0){
            modifytoDoItem(position, newItem);
        }
    }

    private void modifytoDoItem(int position, String nemItem) {
        toDoList.set(position, nemItem);
        System.out.print("Punkten " + (position+1) + " har ändrats.");
    }

    public void removeToDoItem(String item){
        int position= findItem(item);
        if(position >=0){
            removeToDoItem(position);
        }
    }

    private void removeToDoItem(int position){
        toDoList.remove(position);
    }

    private int findItem(String searchItem) {
        return toDoList.indexOf(searchItem);
    }

    public boolean onFile(String  searchItem){
        int position= findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;
    }
}
