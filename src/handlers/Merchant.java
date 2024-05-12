package handlers;

import commands.BuyCommand;
import commands.SellCommand;

public class Merchant implements CommandHandler {

    @Override
    public void handle(BuyCommand command) {
        System.out.println("I am selling product to the middleman with the price of: " + command.getPrice());
    }

    @Override
    public void handle(SellCommand command) {
        System.out.println("I am buying product from the middleman with the price of: " + command.getPrice());
    }

}
