package cn.controller;

import cn.base.Result;
import cn.base.ResultUtil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * 获取页面传递过来的参数(Path形式)
 */
@Path("/")
public class WordControl {

    //http://localhost:8080/rest/getString/1234
    @GET
    @Path("/getData/{data}")
    @Produces(MediaType.APPLICATION_JSON)
    public Result getString(@PathParam("data") String data){
        Result result = ResultUtil.success(data);

        return result;
    }

    // 前端传参时的变量名称要和这里的一致！！
    // http://localhost:8080/rest/query?data=120&obj=123
    @GET
    @Path("/query")
    @Produces(MediaType.APPLICATION_JSON)
    public Result queryParam(@QueryParam("data") String data, @QueryParam("obj") String obj){
        Result result = ResultUtil.success(data+"~~"+obj);

        return result;
    }
}
