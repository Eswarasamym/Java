class surya{   //End user
    public static void main(String[] args) {
        Hotel ref1=new DubaiChef();

        ref1.biryani();
        ref1.gheeRice();
        System.out.println("****************************");

        Hotel ref2= new IndianChef();
        ref2.biryani();
        ref2.gheeRice();
    }
    }