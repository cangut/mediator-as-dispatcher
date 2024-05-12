package commands;

public abstract class BaseCommand {
    protected Long id;

    public BaseCommand(Long id) {
        this.id = id;
    }
}
