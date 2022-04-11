package Praktikum_04;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tampilData();

        DataMerchant.merch = DataMerchant.tambahMerchant(new Merchant(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        DataMerchant.tampilData();
    }
}
