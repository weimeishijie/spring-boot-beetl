package com.demo.beetl.init;

import com.demo.beetl.consts.ConstantsContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by li wen ya on 2020/4/25
 */
@Component
public class BeetlConfigParam implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(BeetlConfigParam.class);

    @Override
    public void run(String... strings) throws Exception {
        ConstantsContext.getConstntsMap().put("li", "ONE");
        ConstantsContext.getConstntsMap().put("wen", "TWO");
        ConstantsContext.getConstntsMap().put("ya", "THREE");
        ConstantsContext.getConstntsMap().put("boo", true);
        logger.info("初始化常量完成");
    }
}
