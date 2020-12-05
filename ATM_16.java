package edu.smg;

import java.util.Scanner;

public class ATM_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accounts = new Account[10];
		for(int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int id = -1;
			do {
				System.out.println("Enter an id: ");
			id = sc.nextInt();	
			} while(id < 0 || id > 9);
			
			int option = -1;
			while(option != 4) {
				System.out.println("Main menu\n" + 
						"1: check balance\n" + 
						"2: withdraw\n" + 
						"3: deposit\n" + 
						"4: exit\n" + 
						"Enter a choice: ");
				option = sc.nextInt();
				if(option == 1) {
					System.out.println("The balance is: "
						+ accounts[id].getBalance());
				} else if(option == 2) {
					System.out.println("Enter an amount to withdraw: ");
					accounts[id].withdraw(sc.nextDouble());
				} else if(option == 3) {
					System.out.println("Enter an amount to deposit: ");
					accounts[id].deposit(sc.nextDouble());
				}
			}
		}
		
	}

}
