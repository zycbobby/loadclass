# Problem
Module2 依赖 Module1

Module2 依赖 commons-io:2.4
Module1 依赖 commons-io:1.4

# 现象1
​在Module2里头用FileUtils, 使用的是2.4的FileUtils
如果去掉module2 对2.4的引用， Module2 用的就是1.4的FileUtils

# 思考

## Load Class不会存在覆盖的问题吗？
会存在的

[代码](https://github.com/zycbobby/loadclass)

# 运行1
java -cp -verbose:classes "commons-io-2.4.jar:module2.jar:commons-io-1.4.jar:module1.jar" Module2Main
正常显示ONE_EB

# 运行2
java -cp -verbose:classes "commons-io-2.4.jar:module2.jar:commons-io-1.4.jar:module1.jar" Module1Main
正常显示ONE_EB

# 运行3
java -cp -verbose:classes "commons-io-1.4.jar:module2.jar:commons-io-2.4.jar:module1.jar" Module1Main
无法显示ONE_EB,也就是load的时候是先到先得，1.4占了FileUtils的坑

# 运行4
java -cp -verbose:classes "commons-io-1.4.jar:module2.jar:commons-io-2.4.jar:module1.jar" Module2Main
无法显示ONE_EB,也就是load的时候是先到先得，1.4占了FileUtils的坑


