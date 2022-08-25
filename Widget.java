public abstract class Widget {
    private int priceInCents;
    private final int centsToShip = 20;
    private static final double taxPercentage = 0.065;

    public int getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(int priceInCents) {
        this.priceInCents = priceInCents;
    }

    public int getCentsToShip() {
        return centsToShip;
    }

    public static double getTaxPercentage() {
        return taxPercentage;
    }

    protected Widget(int priceInCents) {
        this.priceInCents = priceInCents;
    }
}
