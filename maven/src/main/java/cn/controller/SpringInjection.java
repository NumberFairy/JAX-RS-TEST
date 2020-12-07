package cn.controller;

import cn.base.Result;
import cn.base.ResultUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试：spring的几个注解
 */
@RestController
public class SpringInjection {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "helloWorld";
    }

    // http://localhost:8080/map?name=cczhao
    @RequestMapping("/map")
    public Result getData(@RequestParam("name") String name){
        Result result = ResultUtil.success(name);
        return result;
    }

    // http://localhost:8080/path/2341
    @RequestMapping("/path/{variable}")
    public Result pathVariable(@PathVariable("variable") String variable){
        Result result = ResultUtil.success(variable);
        return result;
    }
}
