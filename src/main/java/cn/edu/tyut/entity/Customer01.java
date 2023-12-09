package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Customer
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 16:59
 * @Package_Name cn.edu.tyut.entity
 */
public class Customer01 {
    private String username;
    private String password;
    private Order order;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", order=" + order +
                '}';
    }
}
