package cn.controller;

import cn.service.ReadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class Index {

    @Autowired
    public ReadFile readFile;

    @RequestMapping("/hello")
    public List<StringBuilder> hello(){
        List<StringBuilder> list = new ArrayList<StringBuilder>();
        System.out.println("进入Hello页面。。。");
        for(int i=0;i<10;i++){
            list.add(readFile.read());
        }
        System.out.println("read Over");

        return list;
    }


}
