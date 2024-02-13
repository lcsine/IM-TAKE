package com.tang.tangchat.common;

import com.tang.tangchat.common.user.dao.UserDao;
import com.tang.tangchat.common.user.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DaoTest {
    @Autowired
    private UserDao dao;
    @Test
    public void test(){
        User byid = dao.getById(1);
        User insert = new User();
        insert.setName("11");
        insert.setOpenId("123");
        boolean save = dao.save(insert);
        System.out.println(save);
    }
}
