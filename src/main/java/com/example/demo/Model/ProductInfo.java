package com.example.demo.Model;

public class ProductInfo {

    private String title;
    private String sellPoint;
    private String productImageUrl;
    private String cat;
    private Float price;
    private String name;
    //人气
    private int heatValue;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeatValue() {
        return heatValue;
    }

    public void setHeatValue(int heatValue) {
        this.heatValue = heatValue;
    }

    public ProductInfo(String title, String sellPoint, String productImageUrl, String cat, Float price, String name, int heatValue) {
        this.title = title;
        this.sellPoint = sellPoint;
        this.productImageUrl = productImageUrl;
        this.cat = cat;
        this.price = price;
        this.name = name;
        this.heatValue = heatValue;
    }
}
