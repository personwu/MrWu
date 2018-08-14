package com.unicom.microservice.peixun.web;
import com.unicom.microservice.peixun.domain.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/com/mrwu")
@Api(value = "com/mrwu")
public class ParamController {


    @RequestMapping(value = "params/{pathParam1}",method =RequestMethod.GET)
    @ApiOperation(value = "传参案例")
    public Map<String,Object> testParam(@PathVariable(required = false) String pathParam1,
                                        @RequestParam(required = false) String queryParam1,
                                        @RequestHeader(required = false) String headerParam1,
                                        @CookieValue(required = false) String cookieParam1,
                                        @RequestBody(required = false) User user){

        //存放所有类型参数
        Map<String,Object> params=new HashMap<String,Object>();
        //query参数
        Map<String,Object> querys=new HashMap<String,Object>();
        querys.put("queryParam1",queryParam1);
        params.put("query",querys);
        //header参数
        Map<String,Object> headers=new HashMap<String,Object>();
        headers.put("headerParam1",headerParam1);
        params.put("header",headers);
        //cookie参数
        Map<String,Object>  cookies=new HashMap<String,Object>();
        cookies.put("cookieParam1",cookieParam1);
        params.put("cookie",cookies);
        //路径参数
        Map<String,Object> paths=new HashMap<String,Object>();
        paths.put("pathParam1",pathParam1);
        params.put("path",paths);
        //body参数
        params.put("body",user);
        return params;
    }


}
