package cn.itcast.web.action1;

import cn.itcast.domain.User2;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2015-06-27.
 */
public class AddressAction extends ActionSupport {
    private User2 user2;

    public User2 getUser2() {
        return user2;
    }

    public void setUser2(User2 user2) {
        this.user2 = user2;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user2.getAdd().getCity() + "  " +user2.getAdd().getProvince());

        return super.execute();
    }
}
