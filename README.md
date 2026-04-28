# Bubble Sort Demo

一个简单的 Java 冒泡排序算法演示项目。

## 项目结构

```
bubble-sort-demo/
├── pom.xml                          # Maven 项目配置
├── README.md                        # 本文件
├── .gitignore
└── src/
    └── main/
        └── java/
            └── com/
                └── example/
                    ├── BubbleSort.java    # 冒泡排序实现
                    └── Main.java          # 程序入口
```

## 运行

```bash
mvn compile exec:java -Dexec.mainClass="com.example.Main"
```

或直接编译运行：

```bash
javac -d target src/main/java/com/example/*.java
java -cp target com.example.Main
```
