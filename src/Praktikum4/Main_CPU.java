package Praktikum4;

class CPU {
    double price;
    // nested class
    class Processor{
        // members of nested class
        double cores;
        String manufacturer;
        double getCache(){
            return 4.3;
        }
    }
    // nested protected class
    protected class RAM{
        // members of protected nested class
        double memory;
        String manufacturer;
        double getClockSpeed(){
            return 5.5;        }
    }
}

public class Main_CPU {
    public static void main(String[] args) {
        CPU prosessor = new CPU();
        CPU.Processor proc = prosessor.new Processor();
        CPU.RAM memori = prosessor.new RAM();
        System.out.println("Prosessor Cache = " + proc.getCache());
        System.out.println("Ram Clock Speed = " + memori.getClockSpeed());
    }
}
