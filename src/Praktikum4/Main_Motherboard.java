package Praktikum4;

import java.util.Scanner;

class MotherBoard {
    // static nested class
    static class USB{
        int getTotalPorts(int usb2, int usb3){
            return usb2 + usb3;
        }
    }
}

public class Main_Motherboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah usb2 = ");
        int usb2 = Integer.parseInt(scan.nextLine());
        System.out.print("Masukan jumlah usb3 = ");
        int usb3 = Integer.parseInt(scan.nextLine());
        MotherBoard.USB usb = new MotherBoard.USB();
        int totalUsb = usb.getTotalPorts(usb2, usb3);
        System.out.println("Total Ports = " + totalUsb);
    }
}