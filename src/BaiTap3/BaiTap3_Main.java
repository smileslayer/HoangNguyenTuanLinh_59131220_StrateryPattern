/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BaiTap3;
import java.util.Date;


/**
 *
 * @author linhp
 */
public class BaiTap3_Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Lee San", new Date(99, 1, 12), 9.5f);
        SinhVien sv2 = new SinhVien("Yasuo Linh", new Date(99, 1, 13), 8.5f);
        QLSV qlsv = new QLSV();
        qlsv.themSV(sv1);
        qlsv.themSV(sv2);
        qlsv.inDS();
        
        SoSanhTheoDiem ssdiem = new SoSanhTheoDiem();
        qlsv.setSoSanh(ssdiem);
        qlsv.sapXep();
        qlsv.inDS();

        SoSanhTheoTen ssTen = new SoSanhTheoTen();
        qlsv.setSoSanh(ssTen);
        qlsv.sapXep();
        qlsv.inDS();
    }

}
