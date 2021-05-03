package com.company;

public class Lodz extends Pojazdy{
    private int predkoscMaksymalna;
    private String typ;

    public Lodz(String nazwa, String energiaNapedowa, int predkoscMaksymalna, String typ) {
        super(nazwa, energiaNapedowa);
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.typ = typ;
    }

    @Override
    protected void jazda() {
        System.out.println("Płynie lódź");
    }
}
