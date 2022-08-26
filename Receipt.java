import java.text.DecimalFormat;

public class Receipt {
    private double subTotal;
    private double taxTotal;
    private double grandTotal;
    private double shipping;
    private Widget aWidget;
    private int numberPurchased;
    private final DecimalFormat roundOff = new DecimalFormat("0.00");

    private DecimalFormat roundThis(double toRound) {
        return roundThis(toRound);
    }

    public void printReceipt() {
        System.out.println("Thank you for your purchase!\n\nsubtotal: $" + roundOff.format(this.subTotal) + "\n");
        System.out.println(
                "Tax: $" + roundOff.format(this.taxTotal) + " tax is added to your puchase total including shipping\n");
        System.out.println("Shipping: $" + roundOff.format(this.shipping) + "\n");
        System.out.println("Total: $" + roundOff.format(this.grandTotal) + "\t");
        System.out.println("Number of items purchased: " + this.numberPurchased + "\n");
    }

    public Receipt(int numberOfWidgets, Widget whatWidget) {
        this.subTotal = (((double) (whatWidget.getPriceInCents()) / 100) * numberOfWidgets);
        this.shipping = (((double) (numberOfWidgets * whatWidget.getCentsToShip())) / 100);
        this.taxTotal = (this.subTotal + this.shipping) * whatWidget.getTaxPercentage();
        this.grandTotal = this.subTotal + this.shipping + this.taxTotal;
        this.aWidget = whatWidget;
        this.numberPurchased = numberOfWidgets;
    }

}