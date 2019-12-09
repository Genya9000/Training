package ml.khaliman.task_5_2;
public class Date implements Command {
    RemoteControl remoteControl;
    private Executer executer;

    public Date(Executer executer) {
        this.executer = executer;
        remoteControl.addCommand(new Date(this.executer));
    }

    @Override
    public void execute() {
        executer.date();
    }
}
