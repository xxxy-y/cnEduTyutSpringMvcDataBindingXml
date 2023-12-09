package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName Product
 * @SubmitTime 周六
 * @DATE 2023/12/9
 * @Time 15:42
 * @Package_Name cn.edu.tyut.entity
 */
public class Product {
    private String proId;
    private String proName;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                '}';
    }
}
