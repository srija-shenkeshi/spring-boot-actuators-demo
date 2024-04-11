package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);

		int[] array = {10,20,30,50,15};

	}

	public static void bubblesort(int[]array){
		int n = array.length;
		boolean swap;
		for (int i=0; i<n-1;i++){
			swap= false;
			for (int j= 0; j<n-i-1; j++){
				if (array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					swap = true;
				}

			}
		}
	}

}
