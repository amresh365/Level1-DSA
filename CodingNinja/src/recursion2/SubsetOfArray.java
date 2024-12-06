package recursion2;  

import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  

public class SubsetOfArray {  
    public static List<List<Integer>> out = new ArrayList<>();  
    public static void findSubset(int arr[], List<Integer> ans, int index) {  
        if (index == arr.length) {  
            // Add a copy of ans to the output  
            out.add(new ArrayList<>(ans));  
            return;  
        }  

        // Exclude the current element  
        findSubset(arr, ans, index + 1);  
        
        // Include the current element  
        ans.add(arr[index]);  
        findSubset(arr, ans, index + 1);  
        
        // Backtrack to remove the element added  
        ans.remove(ans.size() - 1);  
        
    }  

    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter the number of elements in the array:");  
        int n = s.nextInt();  
        int arr[] = new int[n];  

        System.out.println("Enter the elements:");  
        for (int i = 0; i < n; i++) {  
            arr[i] = s.nextInt();  
        }  

        findSubset(arr, new ArrayList<>(), 0);  

        System.out.println("Subsets:");  
        for (List<Integer> subset : out) {  
            System.out.println(subset);  
        }  
    }  
}