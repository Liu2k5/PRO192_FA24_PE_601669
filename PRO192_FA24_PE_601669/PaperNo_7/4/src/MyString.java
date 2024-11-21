/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Truong
 */
public class MyString implements IString{

    private boolean isPalind(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int f1(String string) {
        String tach[] = string.split(" ");
        int temp = 0;
        int count = 0;
        for (int i = 0; i < tach.length; i++) {
            if (isPalind(tach[i])) {
                temp = tach[i].length();
                break;
            }
        }
        for (int i = 0; i < tach.length; i++) {
            if (isPalind(tach[i])) {
                if (tach[i].length() < temp) {
                    temp = tach[i].length();
                }
            }
        }
        for (int i = 0; i < tach.length; i++) {
            if (isPalind(tach[i]) && tach[i].length() == temp) {
                count++;
            }   
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String tach[] = string.split(" ");
        int temp = 0;
        for (int i = 0; i < tach.length; i++) {
            if (isPalind(tach[i]) && tach[i].length() > temp) {
                temp = tach[i].length();
            }
        }
        for (int i = 0; i < tach.length; i++) {
            if (isPalind(tach[i]) && tach[i].length() == temp) {
                return tach[i];
            }
        }
        return "";
    }
    
}
