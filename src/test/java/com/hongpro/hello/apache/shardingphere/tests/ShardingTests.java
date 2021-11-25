package com.hongpro.hello.apache.shardingphere.tests;

import com.hongpro.hello.apache.shardingsphere.ShardingSphereApplication;
import com.hongpro.hello.apache.shardingsphere.domain.TbOrder;
import com.hongpro.hello.apache.shardingsphere.mapper.TbOrderDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zhangzihong
 * @CreateTime: 2021/8/6
 * @Version:
 */
@SpringBootTest(classes = ShardingSphereApplication.class)
@RunWith(SpringRunner.class)
public class ShardingTests {
    @Resource
    private TbOrderDao tbOrderDao;

    @Test
    public void testInsertOrder() {
        TbOrder tbOrder = TbOrder.builder().orderId(1).userId(1).build();
        tbOrderDao.insert(tbOrder);
    }

    @Test
    public void select() {
        tbOrderDao.selectByPrimaryKey(1);
    }
}
