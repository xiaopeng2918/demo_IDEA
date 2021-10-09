package top.yxp2918.utils;

import java.util.UUID;

/**
 * @author yxp2918
 * @date 2021-10-09-17:08
 */
public class IDutils {

    public static String getRandomId(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
