/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package truongcdgtvt.bai14tuan6;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class Sanpham {
    private String tensanpham;
    private double gia;
    private int soluong;
    

    public Sanpham(String tensanpham, double gia, int soluong) {
        this.tensanpham = tensanpham;
        this.gia = gia;
        this.soluong = soluong;
    }
   public double getThanhTien()
   {
       return gia*soluong;
   }

    public Sanpham() {
    }
   
    public void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten san pham:");
        tensanpham=sc.nextLine();
        System.out.println("Nhap gia san pham:");
        gia=sc.nextInt();
        System.out.println("Nhap so luong san pham:");
        soluong=sc.nextInt();
    }
    public void Xuat()
    {
        DecimalFormat decimalFormat=new DecimalFormat("#0");
        System.out.println("San pham "+tensanpham+" co gia"+decimalFormat.format(gia));
        System.out.println("So luong san pham: "+soluong);
    }
}
