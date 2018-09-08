package com.sourceit;

//Создание второго потока расширением Thread
class NewThread extends Thread {
	NewThread() {
//Создать новый второй поток
		super("Демонстрационный поток");
		System.out.println("Дочерний поток: " + this);
		start(); // Запустить поток
	}

//Точка входа второго потока,
	public void run() {
		try {
			for (int i = 10; i > 0; i--) {
				System.out.println("Дочерний поток: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван.");
		}
		System.out.println("Дочерний поток завершен.");
	}
}

class ExtendThread {
	public static void main(String args[]) {
		new NewThread(); // Создать новый поток
		try {
				Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван.");
		}
		System.out.println("Главный поток завершен.");
	}
}