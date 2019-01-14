Spring Cloud 模块组合案例
====================

## 启动顺序：
### Consul

```shell
consul agent -dev
```

### 注册服务
启动项目：service-wx

### 启动调用层
启动项目：service-client

### 通过浏览器访问
http://127.0.0.1:8080?a=1&b=2

