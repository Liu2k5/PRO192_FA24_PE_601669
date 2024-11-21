/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Truong
 */
public class SpecFurniture extends Furniture {

    private String style;

    public SpecFurniture() {
    }

    public SpecFurniture(String name, int price, String style) {
        super(name, price);
        this.style = style;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + style + ", " + super.getPrice();
    }

    public String getStyle() {
        return style;
    }

    public void setData() {
        int a = this.getPrice();
        while (a >= 10) {
            a /= 10;
        }
        this.setName(a + this.getName());
    }

    public String getValue() {
        if (super.getPrice() < 10) {
            return super.getName() + style;
        } else {
            return super.getName();
        }
    }

}
