package com.lc.gmall.service.impl;

import com.lc.bean.UserAddress;
import com.lc.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Lc
 * @Date 2023/5/19
 * @Description
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setId(0);
        userAddress.setUserAddress("6");
        userAddress.setUserId("4");
        userAddress.setConsignee("66");
        userAddress.setPhoneNum("666");
        userAddress.setIsDefault("6666");
        return Arrays.asList(userAddress);
    }
}
