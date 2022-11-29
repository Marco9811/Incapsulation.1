package it.develhope;

public class House {
    public int floorsNumber;
        public String address;
        public String residentsNames = new String();

    @Override
        public String toString() {
            return "House{" +
                    "floorsNumber=" + floorsNumber +
                    ", address='" + address + '\'' +
                    ", residentsNames='" + residentsNames + '\'' +
                    '}';
        }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }
    public int setFloorsNumber() {
        return floorsNumber;
    }

    public String getAddress() {
        return address;
    }
    public String setAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResidentsNames() {
        return residentsNames;
    }
    public String setResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String residentsNames) {
        this.residentsNames = residentsNames;
    }
}

