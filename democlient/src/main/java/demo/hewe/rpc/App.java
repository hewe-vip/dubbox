package demo.hewe.rpc;

import demo.hewe.rpc.model.Account;
import demo.hewe.rpc.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        context.start();
        StopWatch watch = new StopWatch();
        watch.start("初始化bean");
        AccountService accountService = (AccountService) context.getBean("accountService");
        watch.stop();
        for (int i = 0; i < 10; i++) {
            watch.start("获取数据   " + i);
            Account account = accountService.findByName("nihao" + i);
            System.out.println("result: " + account);
            watch.stop();
        }


        System.out.println(watch.prettyPrint());
    }
}
