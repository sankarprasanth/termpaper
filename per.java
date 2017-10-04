import java.util.*;
public class per 
{
        static int j1,k1;
         void message()
         {
              int x=0,y=0;
            Scanner in=new Scanner(System.in);
            int a[][]=new int[10][2];
            int c[]=new int[20];
            int i,j;
            System.out.println("enter the points that taken from borders of irises");
            System.out.println("enter no of points that has collected");
            int n=in.nextInt();
            System.out.println("enter the valus in (X,Y) format");
            for( i=0;i<n;i++)
            {
                System.out.println("enter the values for"+i+"point");
                for(j=0;j<2;j++)
                {
                   a[i][j]=in.nextInt();
                }
            }
            int k=0;
            System.out.println("the perpendiculars of points");
            for(i=0;i<n;i++)
            {
                if(i%2==0)
                {
                c[k]=a[i][1];
                k++;
              }
                if(i%2==1)
                {
                c[k]=a[i][0];
                k++;
              }
            }
        
            for(i=0;i<n;i++)
            {
                if(i%2==0)
                    x=x+c[i];
                else
                 y=y+c[i];
            }
            System.out.println("the average of all points of perpendiculars are ");
            System.out.println("X="+(x/(n/2)));
            System.out.println("Y="+(y/(n/2)));
            j1=x/(n/2);
            k1=y/(n/2);
           }
        }
        