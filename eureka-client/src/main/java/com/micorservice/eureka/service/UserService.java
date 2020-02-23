package com.micorservice.eureka.service;

import com.micorservice.admin.common.api.CommonResult;
import com.micorservice.admin.entity.User;

import java.util.List;
import java.util.concurrent.Future;

public interface UserService {

    CommonResult getUser(Long id);

    CommonResult getUserCommand(Long id);

    CommonResult getUserException(Long id);

    CommonResult getUserCache(Long id);

    CommonResult removeCache(Long id);

    Future<User> getUserFuture(Long id);

    List<User> getUserByIds(List<Long> ids);

}
