/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package truongcdgtvt.bai14tuan6;


/**
 *
 * @author ADMIN
 */
public class Khachhangthanthiet extends Khachhang {
    @Override
    public double Chietkhau()
    {
        return 0.0015;
    }
    @Override
    public double Giamgia()
    {
        double thanhtoan=tongTien();
        if(thanhtoan>=500000&&thanhtoan<=1000000)
        {
            return thanhtoan*0.002;
        }else if(thanhtoan>1000000&&thanhtoan<=2000000)
        {
            return thanhtoan*0.003;
        }else 
        {
            return thanhtoan*0.005;
        }
    }
}
