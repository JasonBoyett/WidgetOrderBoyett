import java.util.Scanner;

public class Main {

    public static MyWidget userWidget = new MyWidget();

    public static void main(String[] args) {
        System.out.println("Hello!\nHow many widgets would you like to purchase today?\n");
        Scanner input = new Scanner(System.in);
        int numberOfWidgets = input.nextInt();
        System.out.println("Of course! H55ere is your reciept, have a wounderful day!\n\n");
        Receipt userReceipt = new Receipt(numberOfWidgets, userWidget);
        userReceipt.printReceipt();
    }
}