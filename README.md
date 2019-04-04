Spring Cloud 模块组合案例
====================

[![Build Status](https://travis-ci.org/iceopen/spring-cloud-consul-demo.svg?branch=master)](https://travis-ci.org/iceopen/spring-cloud-consul-demo)

## 依赖：
- maven 
- jdk
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
http://127.0.0.1:8080?a=1&b=2

### 构建清除
```shell
make clean
```
构建清除 ./bin 目录内容

## 开发测试方法
推荐 idea/sts4 进行开发测试

测试启动顺序：
- consul
- service-wx
- service-client
- service-gateway