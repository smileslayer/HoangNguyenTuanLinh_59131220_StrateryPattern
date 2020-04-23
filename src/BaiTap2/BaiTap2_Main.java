/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author linhp
 */
public class BaiTap2_Main {
    public static void main(String[] args) {
       GioHang giohang1 = new GioHang();
       GioHang giohang2 = new GioHang();
       
       giohang1.setHinhThucTT(new ThanhToanOnline());
       giohang2.setHinhThucTT(new ThanhToanCOD());
       
       HangHoa HH1 = new HangHoa("Cơm",20000,"Đây là Cơm");
       HangHoa HH2 = new HangHoa("Trứng",130000,"Đây là Trứng");
       HangHoa HH3 = new HangHoa("Thịt",520000,"Đây là Thịt");
       HangHoa HH4 = new HangHoa("Cá",400000,"Đây là Cá");
       
       giohang1.themHangHoa(HH1);
       giohang1.themHangHoa(HH2);
       giohang1.themHangHoa(HH3);
       giohang1.themHangHoa(HH4);
       
       giohang2.themHangHoa(HH1);
       giohang2.themHangHoa(HH2);
       giohang2.themHangHoa(HH3);
       giohang2.themHangHoa(HH4);
       
       System.out.println("\nDanh sách hàng hóa của giỏ hàng 1(online)");
       giohang1.hienthi();
       System.out.println("Giỏ hàng 1: tổng tiền hàng: " + giohang1.tinhTienHang() + " Tiền khách trả: "+giohang1.tinhTienKhachTra());

       System.out.println("\nDanh sách hàng hóa của giỏ hàng 2(COD)");
       giohang2.hienthi();
       System.out.println("Giỏ hàng 2: tổng tiền hàng: " + giohang2.tinhTienHang() + " Tiền khách trả: "+giohang2.tinhTienKhachTra());
    }
    
}
