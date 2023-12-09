package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Order
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 16:58
 * @Package_Name cn.edu.tyut.entity
 */
public class Order {
    private String orderId;
    private String orderName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
