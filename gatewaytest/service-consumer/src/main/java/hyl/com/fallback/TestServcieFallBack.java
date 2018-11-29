package hyl.com.fallback;

import hyl.com.service.TestServcie;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TestServcieFallBack implements TestServcie {

    @Override
    public String getName(@RequestParam("name") String name) {
        return "系统出错";
    }

    @Override
    public String getlist() {
        return "系统繁忙";
    }
}
