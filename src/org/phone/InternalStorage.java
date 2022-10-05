package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("Qualcomm Snapdragon ");
	}
	private void ramSize() {
		System.out.println("6GB");
		}
	public static void main(String[] args) {
		InternalStorage k = new InternalStorage();
		ExternalStorage o= new ExternalStorage();
		o.size();
		k.processorName();
		k.ramSize();
		
	}

}
