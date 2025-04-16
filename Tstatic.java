
class Mobile
{
    private int price=9;
    private String name="jb";
    private String brand="smartphone";

    
    public String getName()
    {
       return name;
    }

    public int getprice()
    {
        return price;
    }
    public String getbrand()
    {
       return brand;
    }


    
}


public class Tstatic {
    public static void main(String[] args) {
        Mobile obj=new Mobile();
   
System.out.println( obj.getName()+" "+   obj.getprice()+" "+   obj.getbrand());



    }

    
}