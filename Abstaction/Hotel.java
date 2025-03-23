
abstract class Hotel{     //service specifier
    abstract public void biryani();
    abstract public void gheeRice();
}


    /*abstract class DubaiChef extends Hotel{
    abstract public void biryani();
    abstract public void gheeRice();
}
*/
   class DubaiChef extends Hotel{
    @Override
    public void biryani(){
        System.out.println("Dubai Chief Biriyani");
    }
    @Override
    public void gheeRice(){
        System.out.println("Dubai Chief Gheerice");

    }
       
}
/*abstract class IndianChef extends Hotel{
    abstract public void biryani();
    abstract public void gheeRice();
}
*/

class IndianChef extends Hotel{
    @Override
    public void biryani(){
        System.out.println("Indian chef Biriyani");
    }
    @Override
    public void gheeRice(){
        System.out.println("indian chef GheeRice");

    }
}
