package mediator;

import commands.BaseCommand;
import mediator.commandhandlermethod.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> clazz, CommandHandlerMethod<T> method);
    void dispatch(BaseCommand command);
}
