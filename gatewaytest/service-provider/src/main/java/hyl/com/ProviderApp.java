package hyl.com;

import com.ace.cache.EnableAceCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAceCache  //开启cache扫描
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApp {
    public static  void main(String [] args){
        SpringApplication.run(ProviderApp.class, args);
    }

}
