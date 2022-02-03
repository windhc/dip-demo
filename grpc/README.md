# grpc demo

## 配置
下载 protoc
https://github.com/protocolbuffers/protobuf/releases

下载 protoc-gen-grpc-java
https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.44.0/

在proto目录下执行
```shell
protoc --proto_path=./ --java_out=../java/ ./HelloService.proto
protoc --plugin=protoc-gen-grpc-java=D:/app/tools/protoc-gen-grpc-java-1.44.0.exe --grpc-java_out=../java/ --proto_path=./ ./HelloService.proto
```
