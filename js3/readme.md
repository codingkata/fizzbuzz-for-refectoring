# FuzzBuzz游戏
[FuzzBuzz游戏描述](https://github.com/codingkata/kata-puzzle/blob/master/00.FizzBuzz.md)
## 使用语言
**Javascript**
## 目录结构描述
├── .babelrc                // babel配置文件

├── fizzbuzz-function.js    // fizzbuzz函数文件

├── fizzbuzz-node.js        // node测试代码文件

├── fizzbuzz-jest.js        // 导出至jest的函数文件

├── fizzbuzz.test.js        // jest测试代码文件

├── package.json            // 包管理文件
## 运行主程序
1.打开chrome/QQbrowser/Firefox等浏览器，按下F12唤醒控制台；

2.将fizzbuzz-function.js中的代码复制，输入控制台；

3.构造输入案例。替换变量后，将以下代码输入到控制台：
```console.log(fizzbuzz(学生数量,报数1,报数2));```
比如共有100位学生，所报数分别为3和5：
```console.log(fizzbuzz(100,3,5));```

4.更换不同的变量查看输入输出。

## 运行测试案例
单元测试功能由两个平台提供，分别是jest和node。
### 运行jest自动化测试
jest以10位同学报数3、5为例进行测试，期待输出数组["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]。

1.下载nodeJS和npm，打开命令行工具，输入```cd the/path/to/source/file```，定位至fizzbuzz-jest.js文件处；

2.输入```npm install -D```下载所有依赖；

3.输入```npm run test```运行jest单元测试；

### 运行node单元测试
node以10位同学报数3、5为例进行测试，期待输出数组["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]。

1.下载nodeJS和npm，打开命令行工具，输入```cd the/path/to/source/file```，定位至fizzbuzz-node.js文件处；

2.输入```node fizzbuzz-node```进行测试。若无报错，则测试通过。