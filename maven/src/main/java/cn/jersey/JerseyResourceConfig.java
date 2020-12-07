package cn.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

/**
 * 创建jersey Resources
 *
 * packages：方式是采用扫描包的方式批量注册
 * register：是单个注册
 */
public class JerseyResourceConfig extends ResourceConfig {
    public JerseyResourceConfig() {

        register(RequestContextFilter.class);

        // 加载资源文件,这里直接扫描cn.controller下的所有api
        packages("cn.controller");
        //register(HelloController.class);  //@wjw_note: 这种是注册单个的 JAX-RS component!
    }
}
