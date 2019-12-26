package com.interfac;

interface Area    
      {    
          double pi = 3.14;    
          double area(double x,double y);    
       } 
interface Parameter
	{   
    double parameter(double x,double y);
	}
    
class Squre implements Area,Parameter    
   {    
      public double area(double x,double y)    
        {    
            return(x*x);    
         }
      public double parameter(double x,double y)    
      {    
          return(4*x);    
       }   
   }
class Rectangle implements Area,Parameter   
{    
   public double area(double x,double y)    
     {    
         return(x*y);    
      }
   public double parameter(double x,double y)    
   {    
	   return(2*(x+y));    
    }  
   
}    
    
class Circle implements Area,Parameter  
   {    
      public double area(double x,double y)    
        {    
            return(pi*x*x);    
         }
      public double parameter(double x,double y)    
      {    
   	   return(2*pi*x);    
       }  
   }    
    
class Shape
  {    
     public static void main(String arg[])    
       {    
			Squre squre = new Squre();
			Rectangle rectangle = new Rectangle();
			Circle circle = new Circle();    
					   
			System.out.println("\nArea of Squre is : " + squre.area(20,20));
			System.out.println("\nParameter of Squre is : " + squre.parameter(20,20));
			
			System.out.println("\nArea of Rectangle is : " + rectangle.area(10,20));
			System.out.println("\nParameter of Rectangle is : " + rectangle.parameter(10,20));
			
			System.out.println("\nArea of Circle is : " + circle.area(15,15));
			System.out.println("\nParameter of Circle is : " + circle.parameter(10,20));
        }
   
  }  