package ml.khaliman.task_5_2;
public class Executer {
    public static String[] args;

    public void help() {
        if (args[0].equals("help") && args.length == 1) {
            System.out.println("Help Executed");
            System.out.println("Error");
        }
    }

    public void echo() {
        if (args[0].equals("echo") && args.length == 2) {
            System.out.println(args[1]);
            System.out.println("Error");
        }
    }

    public void date() {
        if (args[0].equals("date") && args[1].equals("now") && args.length == 2) {
            System.out.println(System.currentTimeMillis());
            System.out.println("Error");
        }
    }

    public void exit() {
        if (args[0].equals("exit") && args.length == 1) {
            System.out.println("Goodbye");
            System.out.println("Error");
        }
    }
}
