package com.sourceit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Part3 implements Runnable {
	Thread stopThread;

	Part3() {
//Создать новый, второй поток
		stopThread = new Thread(this, "Поток имитации ENTER");
		System.out.println("Дочерний поток создан: " + stopThread);
		stopThread.start(); // Запустить поток
	}

	public void run() {

		try {
			Thread.sleep(5000);
			Robot r;
			try {
				r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван.");
		}
		System.out.println("Дочерний поток завершен");
	}
}