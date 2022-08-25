package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size:15 inch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Computer();
		computer.computerModel();

		Desktop desktop=new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
