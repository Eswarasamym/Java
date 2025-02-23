class Bank
{
    String bank_name;
    String branch;

    Bank(){}


    Bank(String bank_name,String branch){
        //L.I
        this.bank_name=bank_name;
        this.branch=branch;
    }
    public double rateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    String location;
    SBI(){}


    SBI(String location, String bank_name,String branch){
        super(bank_name,branch);
        this.location=location;
    }
    @Override
    public double rateOfInterest(){
        return 15;
    }
}
class Icici extends Bank{
    String location;
    Icici(){}


    Icici(String location, String bank_name,String branch){
        super(bank_name,branch);
        this.location=location;
    }
    @Override
    public double rateOfInterest(){
        return 10;
    }

}