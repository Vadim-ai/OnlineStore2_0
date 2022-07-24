package pro.sky.online_store_2_0;

public class Basket {

    public Basket(String nameOfProduct, int price, int id) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    private String nameOfProduct;
    private int price;
    private int id;
}
