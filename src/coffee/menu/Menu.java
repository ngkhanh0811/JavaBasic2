package src.coffee.menu;/*Welcome to my show !

@author: NgKhanh
Date: 4/27/2022
Time: 8:17 PM

ProjectName: JavaBasic2*/

import java.util.List;

public class Menu {
    private int product;
    private int amount;
    private int price;
    public Menu(int product, int amount, int price){
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "product=" + product +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
