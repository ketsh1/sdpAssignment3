// Client Code
class Motherboard {
    private AM4CPU adapter;

    public Motherboard() {
        adapter = new AM4toAM3Adapter();
    }

    public void insertCPU() {
        adapter.insertAM4CPU();
    }

    public void removeCPU() {
        adapter.removeAM4CPU();
    }

    public void powerOn() {
        adapter.powerOnAM4CPU();
    }
}