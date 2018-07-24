package springexercise;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hthl.dao.UserMapper;
import com.hthl.pojo.User;
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 
public class Test1 {
    @Resource
    private UserMapper userDao = null;  
    @Test
    public void test(){
        User user = userDao.selectByPrimaryKey("373eb242933b4f5ca3bd43503c34668b");
        System.out.println(user.toString());
    }
}
