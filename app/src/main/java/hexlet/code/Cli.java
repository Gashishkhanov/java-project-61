package hexlet.code;

public class Cli {
    private static String name;

    public Cli(String name){
        this.name = name;
    }

    public static String getName(){
        return name;
    }
}
