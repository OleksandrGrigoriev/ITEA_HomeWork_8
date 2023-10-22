package org.hw8task2;

public class Car implements Comparable<Car> {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Car anotherCar) {

        if (this.speed > anotherCar.speed) {
            return 1;
        } else if (this.speed < anotherCar.speed){
            return -1;
        } else {
            if (this.price > anotherCar.price) {
                return 1;
            } else if (this.price < anotherCar.price) {
                return -1;
            } else {
                if (this.model.compareTo(anotherCar.model) > 0) {
                    return 1;
                } else if (this.model.compareTo(anotherCar.model) < 0) {
                    return -1;
                } else {
                    if (this.color.compareTo(anotherCar.color) > 0) {
                        return 1;
                    } else if (this.color.compareTo(anotherCar.color) < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}

