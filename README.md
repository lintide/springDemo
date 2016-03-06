# 环境搭建

操作系统： `OS X 10.11.3`

```
$ 安装 brew
$ 安装 java sdk
```

安装 spring boot cli

```
$ brew tap pivotal/tap
$ brew install springboot
```

# 创建项目

```
$ spring init -d=web,jpa --build=gradle spring-demo
```

# 运行

```
$ cd spring-demo
$ spring run . --watch
```

# 验证运行结果
默认打开 8080 端口，使用浏览器或者 curl 等验证你的输出，个人推荐使用 [httpie](https://github.com/jkbrzt/httpie)

```
$ http http://localhost:8080/
```

# 参考
[Spring Boot 介绍]( http://projects.spring.io/spring-boot/)

[Spring Boot Reference Guide](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
