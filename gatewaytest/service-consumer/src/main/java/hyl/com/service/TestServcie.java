package hyl.com.service;

import hyl.com.fallback.TestServcieFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider",fallback = TestServcieFallBack.class)
public interface TestServcie {

    /**
     * 这里@RequestParam 一定要写，否则无法传到其它服务
     * @param name
     * @return
     */
    @RequestMapping("/api/test")
    String getName(@RequestParam("name")String name);

    @RequestMapping("/api/list")
    String getlist();
}
