1.spring-boot-starter-actuator   监控

    应用配置类 /autoconfig  /beans  /configprops  /env  /mappings  /info
    度量指标类 /metrics   /health  /dump   /trace
    操作控制类 /shutdown


2.spring Could Eureka

    服务注册
    服务发现

3. Netfixe Eureka

     注： 版本需1.5.1以上 ，否则报错class无法找到 org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration

    >1.spring-cloud-starter-eureka-server
    >2.spring-cloud-dependencies
    >3.通过@EnableEurekaServer注解启动一个服务注册中心

    >1.spring-cloud-starter-eureka
    >2.spring-cloud-dependencies
    >3.通过@EnableEurekaClient注解一个客户端

    >1.spring-cloud-starter-ribbon
    >2.通过@EnableDiscoveryClient注解让客户端拥有服务发现能力
    >3.通过@LoadBalanced开启客户端负载均衡


    注：
    SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。
    1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现； 
    2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
    如果你的classpath中添加了eureka，则它们的作用是一样的。
    
    
    
    