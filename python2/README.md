# FizzBuzz
## > 解题思路
当测试一个数字时，对其每一位进行判断，然后再判断这个数字与输入特殊数字的倍数关系，从而得到每个数字应该输出的结果。
由于只会出现 原数字、Fizz、Buzz、FizzBuzz四种情况，因此这四种情况编码为00，01，10，11，记为flag。

    # 00 -> Num      -> 0
    # 01 -> Fizz     -> 1
    # 10 -> Buzz     -> 2
    # 11 -> FizzBuzz -> 3
    
输入的特殊数字如果满足Fizz/Buzz的要求，则改变flag对应的位置，最后根据flag的值决定最终的输出结果。

## > 代码结构
    class Solution:
		# 类构造函数，输入数字a，b作为题目中的Fizz和Buzz数字
    	def __init__(num_a, num_b)
		# 执行数字到FizzBuzz的变换，结果存在类成员变量result中
    	def solution()
		# 输出结果，每行一个报数内容
    	def print_result()
		# 将对数字的判断结果转换为数字、Fizz、Buzz或FizzBuzz之一
		def _decode_()
  
## > 测试内容
### 1.输入特殊数字为0
    # 当输入数字为0时，保证程序不会出错
    test_zero()
### 2.输入特殊数字相同
    # 当输入数字相同时，正确输出结果
    test_equal_num()
### 3.测试是否能够输出正确的结果
    # 当输入数字符合题目要求时，能够正确输出结果
    test_function()
### 4.输入数字不合规范
    # 当输入数字不是个位数时，程序返回空的list
    test_invalid_num()
  
## > 运行程序
    sol = Solution(num_a=3, num_b=5)
    # 调用solution函数执行报数过程
    sol.solution()
    # 执行结果(为list类型)存放在sol.result中
    res = sol.result
    # 按照题目要求输出，一行一个
    sol.print_result()
  
## > 运行测试
    unittest.main()
