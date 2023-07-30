package com.humber.java;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100);
		}
		while (true) {
			System.out.print("Enter an account id: ");
			int id = scanner.nextInt();

			if (id < 0 || id > 9) {
				System.out.println("Invalid account id. Please try again.");
				continue;
			}
			Account account = accounts[id];
			boolean exit = false;
			while (!exit) {	
				printOptions();
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				if (choice == 1) {
					double balance = account.getBalance();
					System.out.println("\nThe balance is " + balance);
				} else if (choice == 2) {
					System.out.print("Enter an amount to withdraw: ");
					double amount = scanner.nextDouble();
					account.withdraw(amount);
				} else if (choice == 3) {
					System.out.print("Enter an amount to deposit: ");
					double amount = scanner.nextDouble();
					account.deposit(amount);
				}else if (choice == 4) {
					exit = true;
				}
			}
		}
	}

	public static void printOptions() {
		System.out.println("\nMain Menu");
		System.out.println("1: View Current Balance");
		System.out.println("2: Withdraw Money");
		System.out.println("3: Deposit Money");
		System.out.println("4: Exit");
	}
}
