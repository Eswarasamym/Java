package Interface;

interface Company {
    String Cname="TCS";
    void job();
}
class SoftwareEngineer implements Company{
    @Override
    public void job(){
        System.out.println("Software Enginner in :"+Cname);
    }
}
class MechanicalEnginner implements Company{
    @Override
    public void job(){
        System.out.println("MechanicalEnginner Enginner in :"+Cname);

    }
}
