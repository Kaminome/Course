package JAVA;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      String Name = "";
      String itemType = "";
      String paymentType = "";
      int itemCode = 0;
      int qtyPurchase = 0;
      int pctCharge = 0;
      int paymentCode = 0;
      double unitPrice = 0;
      double grossBill = 0;
      double addedCharge = 0;
      double netBill = 0;

      do{
        System.out.println("Purchase Name: ");
        Name = scanner.nextLine();
      }while(Name.isBlank());
      
      while(Name.length() < 2 || Name.length() > 25) {
        System.out.println("Name must contain 2-25 characters: ");
        Name = scanner.nextLine();
      }

      System.out.println("Item Code (15-65):");
      itemCode = scanner.nextInt();

      while(itemCode>65 || itemCode<15) {
        System.out.println("Please enter a number between 15-65 for your Item Code:");
        itemCode = scanner.nextInt();
      }
      
      System.out.println("Qty Purchased (2-50):");
      qtyPurchase = scanner.nextInt();

      while(qtyPurchase>50 || qtyPurchase<2) {
        System.out.println("Please enter a number between 2-50 for your Qty purchase:");
        qtyPurchase = scanner.nextInt();
      }
      
      System.out.println("Payment Code (1/2):");
      paymentCode = scanner.nextInt();

      while(paymentCode<1 || paymentCode>2) {
        System.out.println("Please enter a number between 1-2 for your Payment Code:");
        paymentCode = scanner.nextInt();
      }

      scanner.close();

      if (itemCode<36) {
        itemType = "Hakata Printer";
        unitPrice = 6560.50;
      }
      else if(itemCode>=36) {
        itemType = "Atami System Unit";
        unitPrice = 9365.50;
      }
      else if(itemCode<=50) {
        itemType = "Atami System Unit";
        unitPrice = 9365.50;
      }
      else if(itemCode>=51) {
        itemType = "Hakata Monitor";
        unitPrice = 5500.43;
      }
      else if(itemCode<=58) {
        itemType = "Hakata Monitor";
        unitPrice = 5500.43;
      }
      else{
        itemType = "Hakone Keyboard";
        unitPrice = 3678.99;
      }

      if(paymentCode==1) {
        paymentType = "Cash";
        pctCharge = 0;
      }
      else{
        paymentType = "Check";
        pctCharge = 10;
      }

      grossBill = qtyPurchase * unitPrice;
      addedCharge = grossBill * pctCharge / 100;
      netBill = grossBill + addedCharge;

      System.out.println("Purchase Name: " + Name);
      System.out.println("Item Type: " + itemType);
      System.out.println("Payment Type: " + paymentType);
      System.out.println("Net Bill: " + netBill);

    }
}
