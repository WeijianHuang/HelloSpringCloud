package cloud.discover.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WaKim on 2016/3/22.
 */

@RestController
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class DiscoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoverApplication.class, args);
    }
}
