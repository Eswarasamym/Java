class Product
{
    private String name;
    private double price;

    private Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public static Product getProduct(String name,double price)
    {
        return new Product(name,price);
    }
}