package section9_interview.easy.itconfigs;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BeanLifecycleBean {

    private String name;

    public BeanLifecycleBean() {
        this.name = "1";
    }

    @PostConstruct
    public void init(){
        System.out.println("Initiated " + BeanLifecycleBean.class.getName());
        this.name = "initiated";
    }

    @PreDestroy
    public void shutdown(){
        System.out.println("Initiated " + BeanLifecycleBean.class.getName());
        this.name = "shutdown";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BeanLifecycleTestClass{" +
                "name='" + name + '\'' +
                '}';
    }
}