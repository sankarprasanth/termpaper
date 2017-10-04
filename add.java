import java.util.*;
public class add 
{ 
     static int m,n,j,k,M;
     public static int q1,q2,w1,w2,e1,e2,r1,r2,t1,t2;
    
     void addnum(int x1,int y1,int x2,int y2)
        {
            int x4,y4,m,x3=0,y3=0;
            q1=x1;
            q2=y1;
       System.out.println("the values that are added"+x1+""+y1+""+x2+""+y2);
         if(x1!=x2)
          m=(y2-y1)/(x2-x1);
         else
          m=3*x1*x1/2*y1;
          System.out.println("the value of m is "+m);
          x3=((m*m)-x1-x2);
          y3=(m*(x1-x2)-y1);
         System.out.println("value of x3 is"+x3);
         System.out.println("value of y3 is"+y3);
         System.out.println("the value of m is "+m);
           M=m;
        
        w1=x3;
        w2=y3;
        e1=x2;
        e2=y2;
        r1=x3;
        r2=y3;
      
    }
     void addnum1(int x1,int y1,int x2,int y2)
        {
            int x4,y4,x3=0,y3=0;
            int m;
            q1=x1;
            q2=y1;
         System.out.println("the values that are added"+x1+""+y1+""+x2+""+y2);
         if(x1!=x2)
          m=(y2-y1)/(x2-x1);
         else
          m=3*x1*x1/2*y1;
          System.out.println("the value of m is "+m);
          x3=((m*m)-x1-x2);
          y3=(m*(x1-x2)-y1);
         System.out.println("value of x3 is"+x3);
         System.out.println("value of y3 is"+y3);
         System.out.println("the value of m is "+m);
           M=m;
        
         w1=x3;
         w2=y3;
         e1=x2;
         e2=y2;
         r1=x3;
         r2=y3;
      
    }
    
}
        