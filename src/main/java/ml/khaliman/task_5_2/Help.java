package ml.khaliman.task_5_2;
public class Help implements Command {
    RemoteControl remoteControl;
    private Executer executer;

    public Help(Executer executer) {
        this.executer = executer;
        remoteControl.addCommand(new Help(this.executer));
    }

    @Override
    public void execute() {
        executer.help();
    }
}
