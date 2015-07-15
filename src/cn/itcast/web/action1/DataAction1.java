package cn.itcast.web.action1;

import cn.itcast.domain.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2015-06-27.
 */
public class DataAction1 extends ActionSupport {

    private User user;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {

        System.out.println(user.getUsername() + "  " + user.getPassword() + "  " + user.getBirthday().toLocaleString());

        return super.execute();
    }
}
