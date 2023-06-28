package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The desktop size");
	}
	
	public static void main(String[] args) {
		Desktop dk = new Desktop();
		dk.desktopSize();
		dk.computerModel();
	}

}
