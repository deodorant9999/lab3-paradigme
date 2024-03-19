package ro.ulbs.paradigme.lab3.util;



public class PasswordMaker {
    private String name;
    private String password="";
    public PasswordMaker(String name)
    {
        this.name=name;
    }
    static final int MAGIC_NUMBER=23;
    static final String MAGIC_STRING=RandomStringGenerator(MAGIC_NUMBER);
    public static String RandomStringGenerator(int length)
    {
        int st=97;
        int dr=122;
        String randomString="";
        for(int i=0;i<length;i++)
        {
            char c=(char)(st+Math.random()*(dr-st));
            randomString=randomString+c;
        }
        return randomString;
    }
    public String generatePassword()
    {
        String s="";
        for(int i=0;i<10;i++)
        {
            s=s+MAGIC_STRING.charAt((int)(Math.random()*MAGIC_NUMBER));
        }
        password=password+MAGIC_STRING+s+String.valueOf(name.length())+(int)(Math.random()*51);
        return password;
    }
}
