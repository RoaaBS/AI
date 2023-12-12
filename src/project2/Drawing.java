
package project2;

import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;



public class Drawing {
    
    public static ArrayList<Integer> x1point=new ArrayList<>();
    public static ArrayList<Integer> x2point=new ArrayList<>();
    int x1;
    int x2;
    public static ArrayList<Integer> y1point=new ArrayList<>();
    public static ArrayList<Integer> y2point=new ArrayList<>();
    int y2;
    int y1;
    public static ArrayList<Integer> classifingarray=new ArrayList<>();
    
    public Drawing(int x1,int y1,int x2,int y2)
    {
       this. x1=x1;
       this. x2=x2;
       this. y1=y1;
       this. y2=y2;
    
    }
    
    
    
     public void draw(Graphics page)
     {
      for(int i=0;i<x1point.size();i++)
            {
             page.setColor(Color.pink) ;
             page.drawLine(x1point.get(i), y1point.get(i), x2point.get(i), y2point.get(i));
           }
}
}