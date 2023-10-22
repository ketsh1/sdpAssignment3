// Adapter Class
class AM4toAM3Adapter implements AM4CPU {
    private AM4CPU am4CPU;

    public AM4toAM3Adapter() {
        this.am4CPU = new AM4CPUImpl();
    }

    @Override
    public void insertAM4CPU() {
        System.out.println("Converting and inserting AM4 CPU into AM3 socket");
        am4CPU.insertAM4CPU();
    }

    @Override
    public void removeAM4CPU() {
        System.out.println("Safely removing AM4 CPU from AM3 socket");
        am4CPU.removeAM4CPU();
    }

    @Override
    public void powerOnAM4CPU() {
        System.out.println("Powering on motherboard with AM4 CPU in AM3 socket");
        am4CPU.powerOnAM4CPU();
    }
}