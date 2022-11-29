package it.develhope;

public class Tester {
    public static void main(String[] args) {

        House house = new House();
        house.setAddress("Via dei Cipressi,12");
        house.setFloorsNumber(6);
        house.setResidentsNames("Marco,Sara,Lucia");

        System.out.println(house.toString());

    }
}
