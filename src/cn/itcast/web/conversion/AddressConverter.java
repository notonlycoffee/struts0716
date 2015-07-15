package cn.itcast.web.conversion;

import cn.itcast.domain.Address;
import cn.itcast.domain.User2;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Administrator on 2015-06-27.
 */
public class AddressConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {

        String re[] = values[0].split(",");
        Address add = new Address();

        if( re.length == 2) {

            add.setCity(re[0]);
            add.setProvince(re[1]);
        }
        return add;

    }

    @Override
    public String convertToString(Map context, Object o) {
        return null;
    }
}
