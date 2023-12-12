/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics2D;
import java.awt.Point;
//

public class binarymod extends javax.swing.JFrame {
   int Shap;
   int classifcation=0;
   int RED=0;                       
   int BlacK=0;
  Shap ShapO;
   ArrayList <Double> X______MIN=new ArrayList<>();
   ArrayList <Double> X______MAX=new ArrayList<>();
   int check=0;
   Drawing Binary_Line;
     int red=-1;
     int black=-1;
     String the_result;
        ArrayList <Double> w_in=new ArrayList<>();
        ArrayList <Double> w__next=new ArrayList<>();
        ArrayList <Double> classs=new ArrayList<>();
        ArrayList<Point> Points;
          
      ArrayList<Integer> clases=new ArrayList<>();
   //  private javax.swing.JLabel Start__1;

    public binarymod() {
        initComponents();
        Points = new ArrayList<Point>();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        page = new javax.swing.JPanel();
        clasesss = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num_of_epoch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lrate = new javax.swing.JSlider();
        lerarn_rate = new javax.swing.JTextField();
        testing = new javax.swing.JButton();
        testingtexst = new javax.swing.JTextField();
        Start__ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Start__1 = new javax.swing.JButton();
        epoch = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("number of epoch");

        jLabel9.setText("jLabel9");

        start.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pageLayout = new javax.swing.GroupLayout(page);
        page.setLayout(pageLayout);
        pageLayout.setHorizontalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        pageLayout.setVerticalGroup(
            pageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, 340));

        clasesss.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        clasesss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square", "Circle", " " }));
        clasesss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasesssActionPerformed(evt);
            }
        });
        getContentPane().add(clasesss, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 110, 30));

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setText("Clasess :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 90, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("number of epoch:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 110, 30));

        num_of_epoch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_of_epochActionPerformed(evt);
            }
        });
        getContentPane().add(num_of_epoch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 60, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Learning rate:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 110, 30));

        lrate.setMajorTickSpacing(1);
        lrate.setMaximum(10);
        lrate.setPaintTicks(true);
        lrate.setSnapToTicks(true);
        lrate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lrateStateChanged(evt);
            }
        });
        getContentPane().add(lrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 120, -1));
        getContentPane().add(lerarn_rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 60, 30));

        testing.setBackground(new java.awt.Color(204, 204, 204));
        testing.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        testing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testingActionPerformed(evt);
            }
        });
        getContentPane().add(testing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 0, 40));

        testingtexst.setBackground(new java.awt.Color(229, 227, 227));
        testingtexst.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        testingtexst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testingtexstActionPerformed(evt);
            }
        });
        getContentPane().add(testingtexst, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 10, 10));

        Start__.setBackground(new java.awt.Color(0, 51, 153));
        Start__.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Start__.setText("Start");
        Start__.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start__ActionPerformed(evt);
            }
        });
        getContentPane().add(Start__, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 140, 30));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("ERROR:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 110, 30));

        Start__1.setBackground(new java.awt.Color(0, 51, 153));
        Start__1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Start__1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start__1ActionPerformed(evt);
            }
        });
        getContentPane().add(Start__1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 140, 30));

        epoch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project2/image3.jpeg"))); // NOI18N
        epoch.setText("vvvvvvvvv");
        epoch.setPreferredSize(new java.awt.Dimension(366, 550));
        getContentPane().add(epoch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 560));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Learning rate:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 110, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   @Override
   public void paint(Graphics page)
{
     super.paintComponents(page);
     
     if (classifcation==0&&ShapO != null){
       ShapO.draw(page);
     }
      if(classifcation==1)
      { ShapO.draw(page);
          Binary_Line.draw(page);
      }
}

    private void pageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageMouseClicked
        ShapO = new Shap(evt.getPoint(),Shap,check);
        int red = 0;
        int black = 0;
          repaint();
         if(check==1)
        { if(Shap==0)
                the_result="Red ";
            if(Shap==1)
                the_result="Black ";
       
            if(clases.contains(1))
             black=Find__class(1,(int) evt.getPoint().getY()+40, (int)evt.getPoint().getX()+5);
            if(clases.contains(0))
             red=Find__class(0,(int) evt.getPoint().getY()+40, (int)evt.getPoint().getX()+5);
           
            if(red==1||black==1)
            { 
              if(black==1)
                    testingtexst.setText(the_result+"in Black area");
              if(red==1)
                    testingtexst.setText(the_result+"in Red area");
            }
            else testingtexst.setText(the_result+ "out");
            
           
       
        }
         
        
    }//GEN-LAST:event_pageMouseClicked

    private void clasesssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasesssActionPerformed
           Shap=clasesss.getSelectedIndex();
    }//GEN-LAST:event_clasesssActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
    ArrayList<Point> point=ShapO.getarraypoints();
       Points=point;
       ArrayList<Integer> classes=ShapO.getcolors();
       clases=classes;
       if(classes.contains(0))
       { 
           train(point, classes, 1);

       }
    }//GEN-LAST:event_startActionPerformed

    private void num_of_epochActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_of_epochActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_of_epochActionPerformed

    private void lrateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lrateStateChanged
     //get learning rate
        if(lrate.getValue()>0){
        float alphavalue=(float) (lrate.getValue()/10.0);
        lerarn_rate.setText(String.valueOf(alphavalue));}
    }//GEN-LAST:event_lrateStateChanged

    private void testingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testingActionPerformed
       check=1;
        int red=0;
        int black=0;
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=0;
  
        for(int i=0;i< Points.size();i++)
        {
            if(clases.get(i)==0)
            {
                red++;
                 double xX______MIN=X______MIN.get(Binary_Line.classifingarray.indexOf(0));
                 double xX______MAX=X______MAX.get(Binary_Line.classifingarray.indexOf(0));
                 double w1=w_in.get(Binary_Line.classifingarray.indexOf(0));
                 double w2=w__next.get(Binary_Line.classifingarray.indexOf(0));
                 Point point=Points.get(i);
                float a= (float) point.getX();
                 a= normalize(a, xX______MIN, xX______MAX);
                 int Y=(int) point.getY();
                 float yactuall=(float) ((classs.get(Binary_Line.classifingarray.indexOf(0))-(a*w1))/(w2-0));
                 yactuall=yactuall*355;
                 if(yactuall<Y)x1++;
                 else y1++;
            }
            if(clases.get(i)==1)
            {
                black++;
                double w1=w_in.get(Binary_Line.classifingarray.indexOf(1));
                 double w2=w__next.get(Binary_Line.classifingarray.indexOf(1));
                Point point=Points.get(i);
               float x= (float) point.getX();
                  double xX______MIN=X______MIN.get(Binary_Line.classifingarray.indexOf(1));
                 double xX______MAX=X______MAX.get(Binary_Line.classifingarray.indexOf(1));
                 x= normalize(x, xX______MIN, xX______MAX);
                 int y=(int) point.getY();
                 float yactual=(float) ((classs.get(Binary_Line.classifingarray.indexOf(1))-(x*w1))/(w2-0));
                 yactual=yactual*350;
                 if(yactual<y)
                     x2++;
                 else y2++;
            }}
        if(x2>y2)
         BlacK=1;
        else BlacK=0;
        if(x1>y1){
             RED=1;}
            else RED=0;
    }//GEN-LAST:event_testingActionPerformed

    private void testingtexstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testingtexstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testingtexstActionPerformed

    private void Start__ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start__ActionPerformed
       
        ArrayList<Point> Trainning=ShapO.getarraypoints();
        
        Points=Trainning;
        ArrayList<Integer> ci=ShapO.getcolors();
        clases=ci;
        if(ci.contains(1))
        train(Trainning, ci, 1);
    }//GEN-LAST:event_Start__ActionPerformed

    private void Start__1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start__1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start__1ActionPerformed



  public int Find__class(int color,float y,float x)
    {
        int y1 = 0;
        if(color==0)
            y1=RED;
        if(color==1)
            y1=BlacK;

                 double W_new1=w_in.get(Binary_Line.classifingarray.indexOf(color));
                 double W_new2=w__next.get(Binary_Line.classifingarray.indexOf(color));
                 x= normalize(x, X______MIN.get(Binary_Line.classifingarray.indexOf(color)), X______MAX.get(Binary_Line.classifingarray.indexOf(color)));
                double yactuall=(classs.get(Binary_Line.classifingarray.indexOf(color))-(x*W_new1))/(W_new2-0);
                yactuall=yactuall*355;
                
                 if(yactuall<y)
                 { if(y1==1)
                     {
                        return 1;
                     }
                 
                     else return 0;
                 
                 }else if(yactuall>y)
                 {
                     if(y1==0)
                     {
                        return 1;
                     }
                     else return 0;
                 }
                 return 0;
    }
         
  public float normalize(float x ,double min,double max)
    {float e=(float)((float) (x-min)*(1.0/(max-min)));
      return e;
    }
   
    public void train(ArrayList<Point> Trainning,ArrayList<Integer> c,int indexof_color)
    {
         float ya;
         if(num_of_epoch.getText().isEmpty() || lerarn_rate.getText().isEmpty() ){
            JFrame f=new JFrame(); 
               JOptionPane.showMessageDialog(f,"Epoch and alpa coudn't be empty","Alert",JOptionPane.WARNING_MESSAGE); 
         }
        int epochh=Integer.parseInt(num_of_epoch.getText());
           float alpha=Float.parseFloat(lerarn_rate.getText());
           
        double W1=Weight_();
        double W2=Weight_();
        double threshold=Weight_();
     
        ArrayList<Float> errors=new ArrayList<>();
        double min_x1=MIN_Func(Trainning,0);
        double max_x2=MAX_Func(Trainning,0);
        
        float min_y=MIN_Func(Trainning,1);
        float max_y=MAX_Func(Trainning,1);
        
        for(int i=0;i<epochh;i++)
        {
            errors.clear();
                    int errorCount = 0; // Variable to keep track of the number of errors

            for(int j=0;j<Trainning.size();j++)
            {    float x1___11=normalize((float) Trainning.get(j).getX(), min_x1, max_x2);
                float x_22=normalize ((float)Trainning.get(j).getY(), min_y, max_y);
                float acoutput=(float) (((x1___11*W1)+(x_22*W2))-threshold);
                float yac=Step__function_(acoutput);
               
                float yd=0;
                if(c.get(j)==indexof_color)
                     yd=1;
                else yd=0;
                if (yd != yac) {
                errorCount++;
            }
                float error=yd-yac;
                errors.add(error);
                float d_w1=alpha*x1___11*error;
                float d_w2=alpha*x_22*error;
                W1=W1+d_w1;
                W2=W2+d_w2;
            }
            boolean f=false;
             f=Error_Fun(errors);
             if(f)
               break;
           float percentageError = (float) errorCount / Trainning.size() ;
        
        // Update the errorLabel with the new value
        Start__1.setText("Error: " + percentageError + "%");  
        }
        System.out.println("New_Weights" + W1+"   "+W2);
        classifcation=1;
        double x1___1=(threshold-(0*W1))/(W2-0);
         x1___1=x1___1*350;
        double x_2=(threshold-(1*W1))/(W2-0);
        x_2=x_2*350;
       System.out.println("New_Line___coordanates"+x1___1+ "  "+ x_2);
       Binary_Line=new Drawing(20, (int)x1___1, 350,(int)x_2);
        repaint();
         if((indexof_color==0&&red==-1)||(indexof_color==1&&black==-1))
     {
     Binary_Line.x1point.add(20);
     Binary_Line.x2point.add(200);
     Binary_Line.y1point.add((int)x1___1);
     Binary_Line.y2point.add((int)x_2);
     w_in.add(x1___1);
     w__next.add(x_2);
     classs.add(threshold);
     X______MIN.add(min_x1);
     X______MAX.add(max_x2);
     Binary_Line.classifingarray.add(indexof_color);
     if(indexof_color==0)
         red++;
     if(indexof_color==1)
         black++;
    
     }
     else
     {
         int indexx=Binary_Line.classifingarray.indexOf(indexof_color);
         Binary_Line.x1point.remove(indexx);
         Binary_Line.x2point.remove(indexx);
         Binary_Line.y2point.remove(indexx);
         Binary_Line.y1point.remove(indexx);
         w_in.remove(indexx);
         w__next.remove(indexx);
         classs.remove(indexx);
         X______MIN.remove(indexx);
         X______MAX.remove(indexx);
         classs.add(indexx, threshold);
         Binary_Line.x1point.add(indexx, 20);
         Binary_Line.x2point.add(indexx, 343);
         Binary_Line.y2point.add(indexx, (int)x_2);
         Binary_Line.y1point.add(indexx, (int)x1___1);
         w_in.add(indexx,W1);
         w__next.add(indexx,W2);
         X______MIN.add(indexx, min_x1);
         X______MAX.add(indexx, max_x2);
        
     }
       
    }
    
    public int Step__function_ (float O)  ////////////Stepp Function
   {
       if(O<=0)
            return 0;
        else return 1;
       
    }
     
       
 public float MAX_Func(ArrayList<Point> Trainning,int q)  //max function
   { 
       float max=Float.MIN_VALUE;
        if(q==1){
       for(int i=0;i<Trainning.size();i++)
       {
         if(Trainning.get(i).getY()>max)  
             max=(float) Trainning.get(i).getY();
       }}
        else{
             for(int i=0;i<Trainning.size();i++)
       {
         if(Trainning.get(i).getX()>max)  
             max=(float) Trainning.get(i).getX();
       }
        }
       return max;
       
   }
 
  public float MIN_Func(ArrayList<Point> Trainning,int a) //min function 
   {   
       float min=Float.MAX_VALUE;
       if(a==1){
       for(int i=0;i<Trainning.size();i++)
       {
         if(Trainning.get(i).getY()<min)  
             min=(float) Trainning.get(i).getY();
       }}
       else{
            for(int i=0;i<Trainning.size();i++)
       {
         if(Trainning.get(i).getX()<min)  
             min=(float) Trainning.get(i).getX();
       }
       }
       
       return min;
       }
 public boolean Error_Fun(ArrayList<Float> x)        //function error to calculate the error (yd-ya)
    { 
        float SUM=0;
        for (int i=0;i<x.size();i++)
        {
            SUM= ((float)(Math.pow(x.get(i), 2))+SUM);
        }
        SUM=SUM/(float)ShapO.getarraypoints().size();
         if(SUM<=0.001)return true;
         
        else return false;
      
    }
     public float Weight_()     // function weight to calculate w 
    {int max,min,ZZ;
     float FNum;
     Random r = new Random();
      max = (int)(0.5/0.01);
      min = (int)(-0.5/0.01);
     ZZ = r.nextInt((max - min) + 1) + min;
     FNum = (float) (ZZ * 0.01);
    return FNum;
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start__;
    private javax.swing.JButton Start__1;
    private javax.swing.JComboBox<String> clasesss;
    private javax.swing.JLabel epoch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField lerarn_rate;
    private javax.swing.JSlider lrate;
    private javax.swing.JTextField num_of_epoch;
    private javax.swing.JPanel page;
    private javax.swing.JButton start;
    private javax.swing.JButton testing;
    private javax.swing.JTextField testingtexst;
    // End of variables declaration//GEN-END:variables
}
