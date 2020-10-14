class Add
{ 
 int a,b;
 void getdata(int x,int y)
   { 
      a=x;
      b=y;
    }
  int add()
    { 
     int z;
     z=a+b;
     return z;
  }
}
class Meth
{
  public static void main(String [] args)
   {
     Add obj=new Add();
     int s;
     obj.getdata(0,1);
     s=obj.add();
     System.out.println("sum="+s);
    }
}