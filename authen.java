import java.util.*;
import java.lang.*;
import java.io.*;
class authen extends add
{
     static int m[][]=new int[10][2];
     static int n[][]=new int[10][10];
       Scanner in=new Scanner(System.in);
     static  int i,j,a,b,d,c,p,m1,x=0;
   static String s,s1,k1;
    static int c2[][]=new int[1][2];
    static int c23[][]=new int[1][2];
    static int c1[][]=new int[1][2];
    static int act[][]=new int[1][2];
    static int act1[][]=new int[1][2];
    static int cipher[]=new int[10];
    static String[] arr={"000","001","002","010","011","012","020","021","022","101"};
    static int auth[]=new int[3];
    static String auth1="Welcome user";
    static String s2="";
    static String s3="";
    void getval()
    {
     System.out.println("The elliptic curve is in the form of ");
     System.out.println("y2=x3+Bx+C(mod p)");
     System.out.println("enter the values of B and Cand p");
      b=in.nextInt();
      c=in.nextInt();
      p=in.nextInt();
      System.out.println("enter the values of A B and Cand p"+j);
    }
     void getmat()
    {
             for(d=0;d<10;d++)
    {
       int y3=(d*d*d+b*d+c)%p;
         for(i=0;i<30;i++)
         {
             if((i*i)%p==y3)
             {
                 m[d][0]=d;
                 m[d][1]=i;
                }
             
         }
    }
    int k=0;
    for(i=0;i<10;i++)
    {
    if(m[i][0]==0)
    {
    }
    else
    {
        m[k][0]=m[i][0];
        m[k][1]=m[i][1];
        k++;
    }
    }
    for(i=0;i<10;i++)
    {
        for(j=0;j<2;j++)
        {
            System.out.print("        "+m[i][j]);
        }
        System.out.println("");
    } 
    
}
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    System.out.println("enter the details of the user that we are performing authentication");
    s2=in.next();
    auth1=auth1+""+s2;
    System.out.println(""+auth1);
    per qwe=new per();
    qwe.message();
    pro1 obj=new pro1();
    obj.getval();
    obj.getmat();

    obj.genmat();
  
    
        System.out.println("generating cipher text c1 ");
        
        System.out.println("random integer"+x);
        System.out.println("generating cipher text"); 
            add obj1=new add();
            obj1.addnum(m[0][0],m[0][1],m[0][0],m[0][1]);
        c2[0][0]=obj1.w1;
        c23[0][0]=c2[0][0]%10;
        c2[0][1]=obj1.w2;
       // System.out.println("cgsvhxgvhx"+obj1.m);
        c23[0][1]=c2[0][1]%10;
                System.out.println("the value of m1 is"+m1);
        System.out.println("enter message point x1, y1");
        c1[0][0]=qwe.j1;
        c1[0][1]=qwe.k1;
        auth[0]=qwe.j1;
        auth[1]=qwe.k1;
         System.out.println(" message point taken x1, y1 is "+qwe.j1+"    ,   "+qwe.k1);
        System.out.println("cipher text 2");
        obj1.addnum1(c2[0][0],c2[0][1],c1[0][0],c1[0][1]);
        act[0][0]=obj.r1;
        act1[0][0]=act[0][0]%10;
        act[0][1]=obj.r2;
        act1[0][1]=act[0][1]%10;
        m1=obj.M;
        System.out.println("the value of m1 is"+m1);
        if(act1[0][0]<0)
         act1[0][0]=0;
          if(c23[0][0]<0)
         c23[0][0]=0;System.out.println ("ciphertext points"+c23[0][0]+""+c23[0][1]);
        System.out.println("ciphertext points"+act1[0][0]+""+act1[0][1]);
        cipher[0]=c23[0][1];
         cipher[1]=act1[0][1];     
        k1=arr[c23[0][0]]+arr[act1[0][0]];
        System.out.println("actual message"+k1);
        s3=k1;
        s="cdab00100cdsczx000cs1x00z1s001d";
        s1=s+k1+s;
        System.out.println("encrypted  message"+s1);
       System.out.println(" -----------authentication-------------------------");
        System.out.println("enter the message point and encrypted message you recieved ");
        if((auth[0]==in.nextInt()))
        {
            if((auth[1]==in.nextInt()))
              if(s3.equals(in.next()))
            //System.out.println(""+auth1);
            System.out.println("welcome user sankar age-19 DOB:-03oct");
        }
        else
        {
            System.out.println(""+auth[0]+""+auth[1]+""+s3);
            System.out.println("you are not an authenticated user");
        }
    }
}