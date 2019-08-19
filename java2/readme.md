### 程序开发环境
语言：java   
JDK版本：jdk8   
IDE：IDEA+gradle+junit
### 程序使用说明
程序解决问题[：问题](https://github.com/codingkata/kata-puzzle/blob/master/00.FizzBuzz.md)   

- Solution类是解决上述问题的类，main方法是程序执行入口。
- getFizzBuzz(int start, int end)返回报数的字符串结果。其中参数start是报数开始的下标，end是报数结束的下标
- containDigitOrMultiple(int source, int target)返回数字source是否是target的倍数或者包含target。
### 测试用例说明
测试用例测试了public方法getFizzBuzz(int start, int end)

|case|start | end|expected|actual|
|---|---|---|---|---|
|case1:|0|0|"0"|"0"|
|case2:|-1|-20|""|""|
|case1:|50|50|"Buzz\n"|"Buzz\n"|
|case2:|100|-1|""|""|
|case1:|1|15|"1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz\n"|"1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz\n"|
