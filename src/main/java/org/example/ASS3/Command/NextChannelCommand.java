// Команда для переключения на следующий канал
public class NextChannelCommand implements Command {
    private Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.nextChannel();
    }
}


