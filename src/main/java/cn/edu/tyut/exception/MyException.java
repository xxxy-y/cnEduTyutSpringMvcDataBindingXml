package cn.edu.tyut.exception;

/**
 * @Author 羊羊
 * @ClassName MyException
 * @SubmitTime 周二
 * @DATE 2023/12/12
 * @Time 10:28
 * @Package_Name cn.edu.tyut.exception
 */
public class MyException extends Exception {
    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
