package com.demo.beetl.init;

import com.demo.beetl.consts.ConstantsContext;
import com.demo.beetl.domain.ParamSource;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by li wen ya on 2020/4/25
 */
public class BeetlConfigurationInit extends BeetlGroupUtilConfiguration {

    /**
     * 父类定义的扩展方法
     */
    @Override
    protected void initOther() {
        // 做其他数据的初始化 可直接调用 groupTemplate 模板
        Map<String, Object> mapShared = new HashMap<>();
        mapShared.put("shared","hello beetl");
        // 初始化共享变量
        groupTemplate.setSharedVars(mapShared);
        // 初始化共享方法
        groupTemplate.registerFunctionPackage("param", new ParamSource());
        groupTemplate.registerFunctionPackage("constants", new ConstantsContext());
    }
}
