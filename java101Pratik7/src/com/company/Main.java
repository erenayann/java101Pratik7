package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        String userName,passWord;

        System.out.print("Kullanıcı Adınız:");
        userName=input.nextLine();
        System.out.print("Şifreniz:");
        passWord=input.nextLine();

        if(userName.equals("admin") && passWord.equals("admin")){
            System.out.println("Giriş Yaptınız");
        }else{
            System.out.println("Bilgileriniz yanlış,sıfırlamak ister misiniz? \n1-Evet\n2-Hayır");
            int select=input.nextInt();
            input.nextLine();

            if(select==1){
                String newPassword;
                System.out.print("Yeni şifre giriniz:");
                newPassword= input.nextLine();
                if (newPassword.equals(passWord)){
                    System.out.println("Yeni şifreniz bir öncekiyle aynı olamaz");
                }else{
                    System.out.println("Şifre başarıyla değiştirildi");
                }
            }else{
                System.out.println("Bilgilerinizi kontrol edip tekrar deneyiniz!");
            }
        }
    }
}
