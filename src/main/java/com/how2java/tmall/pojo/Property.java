package com.how2java.tmall.pojo;

public class Property {
    private Integer id;

    private Integer cid;

    private String name;

    /*非数据库字段*/
    private Category  category;

    private ProductImage firstProductImage;

    public ProductImage getFirstProductImage(){
        return firstProductImage;
    }

    public void setFirstProductImage(ProductImage firstProductImage){
        this.firstProductImage = firstProductImage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}