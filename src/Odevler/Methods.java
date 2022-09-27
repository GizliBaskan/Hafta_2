package Odevler;

public class Methods {

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println(aranacak + " sayısı listede var");
        } else {
            System.out.println(aranacak + " sayısı listede yok");
        }
    }

}
