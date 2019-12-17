package com.zookeeper.api;

import java.util.List;

public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);

}
