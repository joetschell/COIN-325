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
public class Rectangle extends Shape2D{
    double mHeight, mWidth, mArea, mCircum;
    public Rectangle(double height, double width) {
        mHeight = height;
        mWidth = width;
        mNumAngles=4;
    }
    
     public double getArea(){
       
         mArea = mHeight*mWidth;
         return mArea;
     }
     
     public double getCircumference(){
         
         mCircum = 2*mHeight + 2*mWidth;
         return mCircum;
     }
}

