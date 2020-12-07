package cn.base;

/**
 * 结果返回的工具类
 */
public class ResultUtil {
    /**
     * 返回成功，且带有数据
     * @param obj
     * @return
     */
    public static Result success(Object obj){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(obj);
        return result;
    }

    /**
     * 返回失败
     * @return
     */
    public static Result fail(){
        Result result = new Result();
        result.setCode(ResultEnum.FAIL.getCode());
        result.setMsg(ResultEnum.FAIL.getMsg());
        return result;
    }
}
