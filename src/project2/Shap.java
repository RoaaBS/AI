
package project2;


import java.awt.*;

import java.util.*;
import javax.swing.JPanel;

public class Shap {
     int shapx;  
     int shapy;
     public static ArrayList<Point> allpoints=new ArrayList<>();
     public static ArrayList<Integer> colorrsall=new ArrayList<>();
     
     
     public static ArrayList<Point> testpoints=new ArrayList<>();
     public static ArrayList<Integer> testcolor=new ArrayList<>();
     int flagg;
     static int colorts;
     static Point pointts;
   
   public Shap(Point point,int color,int flag)
{
  Point pt=new Point();
  shapx = point.x+5;
  shapy = point.y+40;

  pt.x= point.x+5;
  pt.y=point.y+40;
  colorrsall.add(color);
  allpoints.add(pt);

if(flag==1)
{
   testcolor.add(color);
  testpoints.add(pt);
   Shap.colorts=color;
   pointts=point; 
}
else{
    System.out.println("Nth");
}

}
    
  
    public void draw(Graphics page)
{  
     Graphics2D g2 = (Graphics2D) page;
     g2.setStroke(new BasicStroke(2));
            
    int size=allpoints.size();
    for(int i=0;i<size;i++)
    {  
        shapy = allpoints.get(i).y;
        shapx = allpoints.get(i).x;
        
      if (colorrsall.get(i)==1)
        {
            page.setColor(Color.BLACK) ;
            page.drawOval(allpoints.get(i).x, allpoints.get(i).y, 25, 25);
}
 
     else if (colorrsall.get(i)==0){
          page.setColor(Color.RED) ;
          page.drawRect(allpoints.get(i).x, allpoints.get(i).y, 25, 25);

}       
     else if (colorrsall.get(i)==2){
        g2.setColor(Color.green);
        g2.drawLine(allpoints.get(i).x,allpoints.get(i).y,allpoints.get(i).x+20,allpoints.get(i).y);
        g2.drawLine(allpoints.get(i).x,allpoints.get(i).y,allpoints.get(i).x+20,allpoints.get(i).y+20);
        g2.drawLine(allpoints.get(i).x+20,allpoints.get(i).y+20,allpoints.get(i).x+20,allpoints.get(i).y);
}
else if (colorrsall.get(i)==3)
{
    g2.setColor(Color.blue);
        g2.drawLine(allpoints.get(i).x,allpoints.get(i).y,allpoints.get(i).x+16,allpoints.get(i).y);
        g2.drawLine(allpoints.get(i).x,allpoints.get(i).y,allpoints.get(i).x,allpoints.get(i).y-16);
        g2.drawLine(allpoints.get(i).x+16,allpoints.get(i).y,allpoints.get(i).x+16,allpoints.get(i).y-16);
        g2.drawLine(allpoints.get(i).x+16,allpoints.get(i).y-16,allpoints.get(i).x+8,allpoints.get(i).y-23);
        g2.drawLine(allpoints.get(i).x,allpoints.get(i).y-16,allpoints.get(i).x+8,allpoints.get(i).y-23);

}
}}
    
      public ArrayList<Point> getarraypoints()
    {
       return allpoints;
    }
    public ArrayList<Integer> getcolors()
    {
        return colorrsall;
    }

   
    
}
