package section9_interview.easy.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import section9_interview.easy.itconfigs.BeanLifecycleBean;

@ContextConfiguration(classes = {BeanLifecycleBean.class})
@SpringBootTest
public class BeansLifecycleIT {

    @Autowired
    private BeanLifecycleBean bean;

    /**
     * https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/
     */
    @Test
    public void beansLifecycle_Demo(){
        Assertions.assertNotNull(bean);
        Assertions.assertEquals("initiated", bean.getName());
    }
}