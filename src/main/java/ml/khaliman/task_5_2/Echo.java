package ml.khaliman.task_5_2;
public class Echo implements Command {
    RemoteControl remoteControl;
    private Executer executer;

    public Echo(Executer executer) {
        this.executer = executer;
        remoteControl.addCommand(new Echo(this.executer));
    }

    @Override
    public void execute() {
        executer.echo();
    }
}
