class BankDriver{
    public static void main(String[] args) {
        Bank b1=new Bank();
        Bank b2=new SBI("Chennai","SBI","vadpalani");
        Bank b3=new Icici("Banglore","Icici","shavgi nagar");

        System.out.println("Rate of interest Bank:"+b1.rateOfInterest()+"%");
        System.out.println("Rate of interest SBI:"+b2.rateOfInterest()+"%");
        System.out.println("Rate of interest Icici:"+b3.rateOfInterest()+"%");
    }


}