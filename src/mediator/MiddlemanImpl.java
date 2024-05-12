package mediator;

import commands.BaseCommand;
import mediator.commandhandlermethod.CommandHandlerMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiddlemanImpl implements CommandDispatcher {

    Map<Class<? extends BaseCommand>, List<CommandHandlerMethod>> merchants = new HashMap<>();

    @Override
    public <T extends BaseCommand> void registerHandler(Class<T> clazz, CommandHandlerMethod<T> method) {
        var merchant = merchants.computeIfAbsent(clazz, c -> new ArrayList<>());
        merchant.add(method);
    }

    @Override
    public void dispatch(BaseCommand command) {
        var merchant = merchants.get(command.getClass());
        merchant.get(0).handle(command);
    }
}
