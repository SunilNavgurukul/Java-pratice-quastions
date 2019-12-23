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
			area a;
			parameter p;		
			a = s;    
			System.out.println("\nArea of Squre is : " +a.areaAll(10,20));
			System.out.println("\nParameter of Squre is : " + p.para(10,20));
			
			a = r;    
			System.out.println("\nArea of Rectangle is : " +a.areaAll(10,20));
			System.out.println("\nParameter of Rectangle is : " + p.para(10,20));
			
			
			a = c;    
			System.out.println("\nArea of Circle is : " +a.areaAll(15,15));
			System.out.println("\nParameter of Circle is : " + p.para(10,20));
        }   
  }  