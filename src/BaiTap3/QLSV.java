/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author linhp
 */
import java.util.ArrayList;
import java.util.Date;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dssv = new ArrayList<>();

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void themSV(SinhVien sv){
        dssv.add(sv);
    }
    
    private void swap(SinhVien sv1, SinhVien sv2) {
        float diemTB = sv1.getDiemTB();
        String hoTen = new String(String.valueOf(sv1.getHoTen()));
        Date ngaySinh = new Date(sv1.getNgaySinh().getTime());
          
        sv1.setDiemTB(sv2.getDiemTB());
        sv1.setHoTen(new String(String.valueOf(sv2.getHoTen())));
        sv1.setNgaySinh(new Date(sv2.getNgaySinh().getTime()));

        sv2.setDiemTB(diemTB);
        sv2.setHoTen(hoTen);
        sv2.setNgaySinh(ngaySinh);
    }
    
    public void sapXep(){
        for (int i=0; i < dssv.size(); i++){
            for (int j = i + 1; j < dssv.size(); j++){
                if(soSanh.SoSanh(dssv.get(i), dssv.get(j)) == 1){
                    swap(dssv.get(i),dssv.get(j));     
//                    System.out.println("so sanh OK");
                }
                
            }
        }
    }

    public void inDS(){
        for (int i=0; i<dssv.size(); i++){
            System.out.println("Sinh viên thứ " + (i+1));
            dssv.get(i).hienThi();
        }
    }
    
}

/*
    lag à
*/