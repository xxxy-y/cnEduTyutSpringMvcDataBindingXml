package cn.edu.tyut.entity;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName Customer02
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 19:08
 * @Package_Name cn.edu.tyut.entity
 */
public class Customer02 {
    private String username;
    private String password;
    private List<Order> orders;
    private List<String> address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer02{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", orders=" + orders +
                ", address=" + address +
                '}';
    }
}
