package src.coffee.control;/*Welcome to my show !

@author: NgKhanh
Date: 4/26/2022
Time: 8:57 AM

ProjectName: JavaBasic2*/

public class Product {
    int code;
    String product;
    double price;
    public Product(int code, String product, int price){
        this.code = code;
        this.price = price;
        this.product = product;
    }

    public int getCode() {
        return code;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
