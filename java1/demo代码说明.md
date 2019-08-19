# demo代码说明

## 程序说明
### 程序 Main.java
1. main()为入口函数，接收输入的两个特殊数字
2. fizzBuzz() 为主要打印函数，首先判断满不满足"FizzBuzz"的要求，然后依次判断"Fizz"和"Buzz"以保证两个都满足时先出Fizz
3. isFizzBuzz()为判断是否满足"FizzBuzz"
4. isFizzOrBuzz()判断是否满足"Fizz"或"Buzz"

### 测试 MainText.java
1. before函数在最开始构造了一个Main对象
2. isFizzBuzzTest中用断言来判断是否能得到期望的boolean值
3. isFizzOrBuzzTest中同样用断言来判断是否能得到期望的boolean值

### 程序执行方法
在src/main/java目录下依次执行 ```javac Main.java```和```java Main```,根据命令行提示输入两个特殊数字，如3，5可以得到如下的结果

```
请输入数字：3
请再输入数字：5
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
Fizz
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
Fizz
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
Fizz
Fizz
Fizz
Fizz
Fizz
Fizz
Fizz
Fizz
Fizz
Buzz
41
Fizz
Fizz
44
FizzBuzz
46
47
Fizz
49
Buzz
Fizz
Buzz
Fizz
Fizz
Buzz
Buzz
Fizz
Buzz
Buzz
FizzBuzz
61
62
Fizz
64
Buzz
Fizz
67
68
Fizz
Buzz
71
Fizz
Fizz
74
FizzBuzz
76
77
Fizz
79
Buzz
Fizz
82
Fizz
Fizz
Buzz
86
Fizz
88
89
FizzBuzz
91
92
Fizz
94
Buzz
Fizz
97
98
Fizz

```

### 单元测试的执行方法
在IDEA中 run MainTest