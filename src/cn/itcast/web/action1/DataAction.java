package cn.itcast.web.action1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2015-06-26.
 */
public class DataAction extends ActionSupport {

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
    public String execute() throws Exception {
        System.out.println(username + "  " + password);
        return super.execute();
    }
}
