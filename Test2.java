class Bike
{  
int getRateOfYamaha()
{
return 0;
}  
}  
  
class FZv1 extends Bike
{  
int getRateOfYamaha()
{
return 85000;
}  
}  
  
class FZv2 extends Bike
{  
int getRateOfYamaha()
{
return 97000;
}  
}  
class FZs extends Bike
{  
int getRateOfYamaha()
{
return 95000;
}  
}  
  
class Test2
{  
public static void main(String args[])
{  
FZv1 s=new FZv1();  
FZv2 i=new FZv2();  
FZs a=new FZs();  
System.out.println("FZv1 Rate : "+s.getRateOfYamaha());  
System.out.println("FZv2 Rate : "+i.getRateOfYamaha());  
System.out.println("FZs Rate : "+a.getRateOfYamaha());  
}  
} 