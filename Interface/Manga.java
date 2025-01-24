interface Manga
{
    public void singer();
}
interface mangi
{
    public void dancer();
}
class maggi implements Manga,mangi
{
    @Override
    public void singer(){
        System.out.println("Idayamme....");
    }
    @Override
    public void dancer()
    {
        System.out.println("Hip-Hop");
    }
    public void static main(String []args)
    {
        Manga m=new maggi
        ();
        m.singer();
        //m.dancer <-------Manga
        mangi m1=(mangi)m;
        m1.dancer();
    }
}