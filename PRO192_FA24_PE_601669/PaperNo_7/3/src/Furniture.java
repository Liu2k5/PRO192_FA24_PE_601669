/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Truong
 */
public class Furniture {

    private String name;
    private int price;
    
    public Furniture() {
    }
    
    public Furniture(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setFurniture(Furniture furniture) {
        this.setName(furniture.getName());
        this.setPrice(furniture.getPrice());
    }
    
}
