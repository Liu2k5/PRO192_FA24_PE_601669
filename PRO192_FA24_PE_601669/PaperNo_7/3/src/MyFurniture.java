
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Truong
 */
public class MyFurniture implements IFurniture {

    private boolean hasNAtTheEnd(String string) {
        if (string.charAt(string.length() - 1) == 'n') {
            return true;
        }
        return false;
    }

    private boolean digitNumSt(String string) {
        if (Character.isDigit(string.charAt(0))) {
            return true;
        }
        return false;
    }

    @Override
    public int f1(List<Furniture> t) {
        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            if (hasNAtTheEnd(t.get(i).getName())) {
                sum += t.get(i).getPrice();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Furniture> t) {
        Furniture temp = new Furniture();
        for (int i = 1; i < t.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (digitNumSt(t.get(i).getName()) && digitNumSt(t.get(j).getName())) {
                    if (t.get(j).getPrice() > t.get(i).getPrice()) {
                        temp.setFurniture(t.get(j));
                        t.get(j).setFurniture(t.get(i));
                        t.get(i).setFurniture(temp);
                    }
                }

            }
        }
    }

    @Override
    public void f3(List<Furniture> t) {
        double avg = 0;
        for (int i = 0; i < t.size(); i++) {
            avg += t.get(i).getPrice();
        }
        avg /= t.size();
        for (int i = 0; i < t.size(); i++) {
            while (digitNumSt(t.get(i).getName()) && t.get(i).getPrice() < avg) {
                t.remove(i);
            }
        }
    }

}
