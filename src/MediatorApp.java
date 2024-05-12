import commands.BuyCommand;
import commands.SellCommand;
import handlers.CommandHandler;
import handlers.Merchant;
import mediator.CommandDispatcher;
import mediator.MiddlemanImpl;

public class MediatorApp {

    public static void main(String[] args) {
        CommandDispatcher middleman = new MiddlemanImpl();
        CommandHandler merchant = new Merchant();
        initializeMerchants(middleman, merchant);

        BuyCommand buyCommand = new BuyCommand(1L, 1L, 1.0);
        middleman.dispatch(buyCommand);

        SellCommand sellCommand = new SellCommand(2L, 3L, 5.0);
        middleman.dispatch(sellCommand);
    }

    public static void initializeMerchants(CommandDispatcher middleman, CommandHandler merchant) {
        middleman.registerHandler(BuyCommand.class, merchant::handle);
        middleman.registerHandler(SellCommand.class, merchant::handle);
    }
}
