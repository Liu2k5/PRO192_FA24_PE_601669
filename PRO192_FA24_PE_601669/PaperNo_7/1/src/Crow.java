/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Truong
 */
public class Crow {
    private String origin;
    private int weight;

    public Crow() {
    }

    public Crow(String origin, int weight) {
        this.origin = origin;
        this.weight = weight;
    }

    public String getOrigin() {
        return weight + origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight + 3;
    }
    
}
