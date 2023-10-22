public class Main {
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard();
        motherboard.insertCPU();
        motherboard.powerOn();
        motherboard.removeCPU();
    }
}