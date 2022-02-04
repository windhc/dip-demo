# aws-lambda

## 打包
```shell
bazel build //...
```

## 部署到aws lambda
- 打开 https://console.aws.amazon.com/lambda/home
- 上传bazel-bin/lambda_deploy.zip
- 上传步骤参考 https://github.com/demos-driven/java-aws-lambda-maven-demo#%E4%BA%8C%E6%89%8B%E5%8A%A8%E6%96%B9%E5%BC%8F
