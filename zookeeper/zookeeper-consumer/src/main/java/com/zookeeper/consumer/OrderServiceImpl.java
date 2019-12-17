package com.zookeeper.consumer;

import com.zookeeper.api.OrderService;
import com.zookeeper.api.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import com.zookeeper.api.UserService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id： " + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
