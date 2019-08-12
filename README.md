Spring Cloud 模块组合案例
====================

[![Build Status](https://travis-ci.org/iceopen/spring-cloud-consul-demo.svg?branch=master)](https://travis-ci.org/iceopen/spring-cloud-consul-demo)

## 依赖：

- maven 3.5
- jdk 1.8
- make

## 启动顺序：
### [Consul](https://www.consul.io/downloads.html)

```shell
consul agent -dev
```

访问地址：http://127.0.0.1:8500/ui/dc1/services 查看服务是否运营正常 

### 构建应用

```shell
make
```

构建成功后会在目录 ./bin 下

### 执行测试

```shell
java -jar ./bin/service-wx-对应版本.jar
java -jar ./bin/service-client-对应版本.jar
java -jar ./bin/service-gateway-对应版本.jar
```

### 通过浏览器访问

> http://127.0.0.1:8080?a=1&b=2

### 构建清除

```shell
make clean
```

构建清除 ./bin 目录内容

## 开发测试方法

推荐 idea/sts4 进行开发测试

## 访问地址

访问消费者端

http://127.0.0.1:8080/?a=1&b=2

访问网关

http://127.0.0.1:8081/service_to_user/add?a=1&b=3

## 附加添加内容

### [Zipkin](https://zipkin.io/pages/quickstart.html) 链路追踪

[Spring Cloud 官方文档地址](https://cloud.spring.io/spring-cloud-static/Greenwich.RELEASE/single/spring-cloud.html#_spring_cloud_sleuth)

```shell
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

### [Prometheus](https://prometheus.io/) 监控支持

### [Grafana](https://prometheus.io/) 监控报表展示

报表使用 [JVM (Micrometer)](https://grafana.com/grafana/dashboards/4701)

## 测试启动顺序：

### 必须启动
   
- consul
- service-wx
- service-client
- service-gateway

### 按需启动

- Zipkin
- Prometheus
- Grafana
- Alertmanager 告警
