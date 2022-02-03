# thrift demo

## 安装 thrift
- mac: brew install thrift
- win: https://thrift.apache.org/download 下载并配置到环境变量

## 生成java代码

```shell
thrift -r -gen java AnimalService.thrift
```

##
运行server和client

