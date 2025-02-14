class ProductDriver
{
    public static void main(String[] args)
    {
        Product p1=Product.getProduct("watch",1000);
        System.out.println("Product name :"+p1.getName());
        System.out.println("Product price :"+p1.getPrice());
    }
}