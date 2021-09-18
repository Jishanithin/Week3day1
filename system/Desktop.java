package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("the desktop size is 1366 x 768");
	}

	public static void main(String[] args) {
		Computer obj = new Computer();
		obj.computerModel();

		Desktop obj2 = new Desktop();
		obj2.desktopSize();
	}

}
