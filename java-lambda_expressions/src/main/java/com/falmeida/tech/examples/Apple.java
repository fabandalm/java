package com.falmeida.tech.examples;

public class Apple {

    private Integer weight = 0;
    private String color = "";

    public Apple(Integer weight, String color) {
      this.weight = weight;
      this.color = color;
    }

    public Integer getWeight() {
      return weight;
    }

    public void setWeight(Integer weight) {
      this.weight = weight;
    }

    public String getColor() {
      return color;
    }

    public void setColor(String color) {
      this.color = color;
    }
    
    @Override
    public String toString() {
      return String.format("Apple{color='%s', weight=%d}", color, weight);
    }

}




