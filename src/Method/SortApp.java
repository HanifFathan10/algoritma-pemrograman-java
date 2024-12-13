package Method;

import java.util.Scanner;

public class SortApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = { 6, 4, 3, 2, 1, 10, 11, 15};

        System.out.println("Bubble sort");
        System.out.println("===========");
        System.out.println("Nilai sebelum diurutkan : ");
        for(int a : data) {
            System.out.print(a + " ");
        }

        Sort.Bubble(data);
        System.out.println();

        System.out.println("Nilai sesudah diurutkan : ");
        for(int a : data){
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Selection sort");
        System.out.println("===========");
        System.out.println("Nilai sebelum diurutkan : ");
        for(int a : data) {
            System.out.print(a + " ");
        }

        Sort.SelectionAscending(data);
        System.out.println();

        System.out.println("Nilai sesudah diurutkan Ascending : ");
        for(int a : data){
            System.out.print(a + " ");
        }

        Sort.SelectionDescending(data);
        System.out.println();

        System.out.println("Nilai sesudah diurutkan Descending : ");
        for(int a : data){
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Insertion sort");
        System.out.println("===========");
        System.out.println("Nilai sebelum diurutkan : ");
        for(int a : data) {
            System.out.print(a + " ");
        }

        Sort.InsertionAsc(data);
        System.out.println();

        System.out.println("Nilai sesudah diurutkan Ascending : ");
        for(int a : data){
            System.out.print(a + " ");
        }

        Sort.InsertionDesc(data);
        System.out.println();

        System.out.println("Nilai sesudah diurutkan Descending : ");
        for(int a : data){
            System.out.print(a + " ");
        }

        System.out.println();
    }
}
