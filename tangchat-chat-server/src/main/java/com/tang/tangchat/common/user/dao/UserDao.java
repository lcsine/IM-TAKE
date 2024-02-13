package com.tang.tangchat.common.user.dao;

import com.tang.tangchat.common.user.domain.entity.User;
import com.tang.tangchat.common.user.mapper.UserMapper;
import com.tang.tangchat.common.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author <a href="https://github.com/lcsine">tang</a>
 * @since 2024-02-13
 */
@Service
public class UserDao extends ServiceImpl<UserMapper, User> implements IUserService {

}
