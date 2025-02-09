class Laptop
{
    String name;
    double price;
    static String owner="vijay";

    //constructor


    public Laptop(String name,double price){

        this.name=name;
        this.price=price;
    }

    public void detailsOfLaptop()
    {
        System.out.println("Brand name :"+name);
        System.out.println("brand price:"+price);

        System.out.println("owner:"+owner);
    }
}