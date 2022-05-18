package com.tahmid.MediatorDP.Practice1;

public class TestMediatorDP {
    public static void main(String[] args) {
        ATCMediator atcMediator = new ATC();

        Flight bowing707 = new Flight(atcMediator);
        Flight bowing708 = new Flight(atcMediator);

        Runway runway34 = new Runway(atcMediator);
        Runway runway35 = new Runway(atcMediator);

        atcMediator.registerFlight(bowing707);
        atcMediator.registerFlight(bowing708);

        atcMediator.registerRunway(runway34);
        atcMediator.registerRunway(runway35);

        runway34.land();
        bowing707.land();


    }
}
