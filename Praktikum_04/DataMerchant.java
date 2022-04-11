package Praktikum_04;

import java.util.Arrays;
import java.util.Scanner;

public class DataMerchant {
    static Scanner sc = new Scanner(System.in);
    static Merchant[] merch = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] merchBaru = Arrays.copyOf(merch, merch.length + 1);
        merchBaru[merch.length] = merchant;
        return merchBaru;
    }

    public static void tampilData(){
        for (Merchant mch1 : merch) {
            System.out.println("====Tampilan Data Merchant UBFOOD====");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : Rp " + (int)mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        for (Merchant mch2 : merch) {
            if (mch2.getNamaMerchant().equalsIgnoreCase(nama))
                tampilMerchant(mch2);
                return mch2;
        }
        System.out.println("Merchant dengan nama '" + nama + "' tidak ditemukan");
        return null;
    }

    public static void tampilMerchant(Merchant merchant) {
        System.out.println("====Tampilan Data Merchant UBFOOD====");
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : Rp " + (int)merchant.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merchant) {
        System.out.print("Nama Merchant : ");
        merchant.setNamaMerchant(sc.nextLine());
        System.out.print("Nama Produk   : ");
        merchant.setNamaProduk(sc.nextLine());
        System.out.print("Harga Makanan : ");
        merchant.setHargaMakanan(Double.parseDouble(sc.nextLine()));
    }
}
