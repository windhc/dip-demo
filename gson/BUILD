load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name="java-maven-lib",
    srcs = glob(["src/main/java/com/windhc/gson/*.java"]),
    deps = [
        "@maven//:com_google_code_gson_gson"
    ],
)

java_binary(
    name = "gson",
    main_class = "com.windhc.gson.Main",
    runtime_deps=[":java-maven-lib"]
)
