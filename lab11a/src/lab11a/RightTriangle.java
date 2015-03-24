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
public class RightTriangle extends Shape2D{
    double mA,mB, mC, mArea, mCircum;
    // You may assume a and b are the legs and c is the hypo
    public RightTriangle(double a, double b) {
        mA= a;
        mB= b;
        mC = Math.sqrt(Math.pow(mA, 2)+Math.pow(mB, 2));
        mNumAngles=3;
    }
    
    public double getArea(){
       
         mArea = .5*mB*mA;
         return mArea;
     }
    
    public double getCircumference(){
         
         mCircum = mA+mB+mC;
         return mCircum;
     }
}

