package cn.edu.tyut.entity;

/**
 * @Author 羊羊
 * @ClassName User
 * @SubmitTime 周四
 * @DATE 2023/12/7
 * @Time 21:39
 * @Package_Name cn.edu.tyut.entity
 */
public class User {
    private String username;
    private String password;

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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
