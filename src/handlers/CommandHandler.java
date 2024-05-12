package handlers;

import commands.BuyCommand;
import commands.SellCommand;

public interface CommandHandler {
    void handle(BuyCommand command);
    void handle(SellCommand command);
}
