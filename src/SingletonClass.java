public class SingletonClass 
{
    private static SingletonClass single_instance = null;

    public String s;
    private SingletonClass()
    {
        s = "String from Singleton class";
    }
    public static SingletonClass getInstance()
    {
        // To ensure only one instance is created
        if (single_instance == null) {
            single_instance = new SingletonClass();
        }
        return single_instance;
    }
}