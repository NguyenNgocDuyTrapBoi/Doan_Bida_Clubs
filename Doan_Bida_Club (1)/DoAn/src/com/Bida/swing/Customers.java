
package com.Bida.swing;

public class Customers {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public Customers(String id, String name, String phone, boolean gender, String image) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.image = image;
    }

    public Customers() {
    }

    public void setImage(String image) {
        this.image = image;
    }
    private String id;
    private String name;
    private String phone;
    private boolean gender;
    private String image;
}
