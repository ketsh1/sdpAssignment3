// Concrete Adaptee
class AM4CPUImpl implements AM4CPU {
    @Override
    public void insertAM4CPU() {
        System.out.println("AM4 CPU inserted");
    }

    @Override
    public void removeAM4CPU() {
        System.out.println("AM4 CPU removed");
    }

    @Override
    public void powerOnAM4CPU() {
        System.out.println("AM4 CPU powered on");
    }
}