package hyl.com.rest;

import com.ace.cache.annotation.Cache;
import hyl.com.vo.TestVo;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TestRest {
    @RequestMapping("/test")
    public String test( String name) {
        return  "hello!"+name;
    }
    @RequestMapping("/list")
    @Cache(key="testList")
    public  @ResponseBody List<TestVo> testVoList(){
        List<TestVo> list = new ArrayList<TestVo>();
        list.add(new TestVo("张三",18));
        list.add(new TestVo("里斯",28));
        return  list;
    }
}
