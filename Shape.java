package com.interfac;

interface area    
      {    
          double pi = 3.14;    
          double areaAll(double x,double y);    
       } 
interface parameter
	{   
    double para(double x,double y);
	}
    
class Squre implements area,parameter    
   {    
      public double areaAll(double x,double y)    
        {    
            return(x*x);    
         }
      public double para(double x,double y)    
      {    
          return(4*x);    
       }   
   }
class Rect implements area,parameter   
{    
   public double areaAll(double x,double y)    
     {    
         return(x*y);    
      }
   public double para(double x,double y)    
   {    
	   return(2*(x+y));    
    }  
   
}    
    
class cir implements area,parameter  
   {    
      public double areaAll(double x,double y)    
        {    
            return(pi*x*x);    
         }
      public double para(double x,double y)    
      {    
   	   return(2*pi*x);    
       }  
   }    
    
class Shape
  {    
     public static void main(String arg[])    
       {    
			Squre s = new Squre();
			Rect r = new Rect();
			cir c = new cir();    
					   
			System.out.println("\nArea of Squre is : " + s.areaAll(10,20));
			System.out.println("\nParameter of Squre is : " + s.para(10,20));
			
			System.out.println("\nArea of Rectangle is : " + r.areaAll(10,20));
			System.out.println("\nParameter of Rectangle is : " + r.para(10,20));
			
			System.out.println("\nArea of Circle is : " + c.areaAll(15,15));
			System.out.println("\nParameter of Circle is : " + c.para(10,20));
        }
   
  }  