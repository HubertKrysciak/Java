package com.company;

public class Pociag extends Pojazdy{
    private int masa;
    private int predkoscMaksymalna;

    public Pociag(String nazwa, String energiaNapedowa, int masa, int predkoscMaksymalna) {
        super(nazwa, energiaNapedowa);
        this.masa = masa;
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    @Override
    protected void jazda() {
        super.jazda();
        System.out.println("pociag");
    }
}
