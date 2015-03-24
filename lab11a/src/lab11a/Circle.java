/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11a;

/**
 *
 * @author jschell157503
 */
public class Circle extends Shape2D{
    double mRadius, mArea, mCircum;
    public Circle(double radius) {
        mRadius = radius;
        mNumAngles=0;
    }
    
    public double getArea(){
       
        mArea = mRadius*mRadius*Math.PI;
        return mArea;
   }
    
   public double getCircumference(){
     
       mCircum = 2*Math.PI*mRadius;
       return mCircum;
   }
   
   
   
  
}
