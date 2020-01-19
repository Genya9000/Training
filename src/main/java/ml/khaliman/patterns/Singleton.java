package ml.khaliman.patterns;

public class Singleton {
    private static Singleton INSTANSE;
    private Singleton(){
    }
    public static Singleton getINSTANSE(){
        if(INSTANSE == null) {synchronized (Singleton.class) {
            if (INSTANSE == null) {
                INSTANSE = new Singleton();
            }
        }
        }
        return INSTANSE;
    }
}
