package cn.babyp2p.consts;

public class UserSession {
    private int code; //报错编号 202 或者200
    private String data; //数据
    private String msg;//报错信息

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
