/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Baitap1;

/**
 *
 * @author linhp
 */
public class Context {
    Itinh tinhToan;
    public void setTinhToan(Itinh tinhToan){
       this.tinhToan = tinhToan;
    }

    public float tinh(float a, float b){
        return this.tinhToan.tinh(a, b);
    }
}
