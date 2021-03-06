package hyl.com.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

@Configuration
public class MyFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        URI uri = exchange.getRequest().getURI();
        System.out.println(uri.getPath());

        System.out.println("这里做点登录，权限拦截的什么吧。。。");

        ServerHttpRequest request = exchange.getRequest();
        String method = request.getMethod().toString();
        System.out.println(method);
        //HttpHeaders 实现Map<K, List<V>>
        HttpHeaders httpHeaders = request.getHeaders();

        for (Map.Entry<String, List<String>> entry : httpHeaders.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
        return chain.filter(exchange);
    }
}
