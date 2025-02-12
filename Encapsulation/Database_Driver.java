class Database_Driver
{
    public static void main(String[] args)
    {
        Database db1=Database.getDatabase("Root","windows");
        Database db2=Database.getDatabase("surya","Linux");

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db1.getUser());
        System.out.println(db2.getUser());

    }
}