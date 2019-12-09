package ml.khaliman.task_5_2;
public class Application {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Executer executer = new Executer();
        remoteControl.invokeAll();
    }
}
