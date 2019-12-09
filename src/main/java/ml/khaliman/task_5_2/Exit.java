package ml.khaliman.task_5_2;
public class Exit implements Command {
    RemoteControl remoteControl;
    private Executer executer;

    public Exit(Executer executer) {
        this.executer = executer;
        remoteControl.addCommand(new Exit(this.executer));
    }

    @Override
    public void execute() {
        executer.exit();
    }
}
