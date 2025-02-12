class Database
{
    private static Database ref;
    private String user;
    private String os;
    private Database(String user,String os)
    {
        this.user=user;
        this.os=os;
    }
    public String getUser()
    {
        return user;
    }
    public String getOs()
    {
        return os;
    }
    public static Database getDatabase(String user,String os)
    {
        if(ref==null)
        {
            ref=new Database(user,os);
        }
        return ref;
    }
}