class HarshaSir{
    public void food(){
        System.out.println("Veg Food");
    }
    public void playchess(){
        System.out.println("Playing chess");
    }
}
class Shekar extends HarshaSir{
    @Override
    public void food(){
        System.out.println("Non-Veg Food");
    }
    public static void main(String[] args){
        HarshaSir ref=new Shekar();
        ref.food();
        ref.playchess();
    }



}