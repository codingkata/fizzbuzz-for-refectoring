##题目概述
####题目名称：00.FizzBuzz
####题目内容：
有一名体育老师，在某次离下课还有五分钟时，决定玩一个报数游戏。此时有100名学生在上课，游戏的规则如下：
- 老师先说出两个不同的特殊数(都是个位数)，比如3, 5；
- 让所有学生拍成一队，然后按顺序报数；
- 学生报数时
- 如果所报数字是「第一个特殊数(3)」的倍数，或者包含「第一个特殊数(3)」，那么不能说该数字，而要说Fizz；
- 如果所报数字是「第二个特殊数(5)」的倍数，或者包含「第二个特殊数(5)」，那么不能说该数字，而要说Buzz；
- 如果所报数字同时是「两个特殊数」的倍数，那么也不能说该数字，而是要说FizzBuzz。
- 如果所报数字中包含某个「特殊数」，那么也不能说该数字，而是要说对应的英文单词（见规则1和规则2）。例如，要报13的同学应该说Fizz；要报52的同学应该说Buzz。
- 如果在一次报数中，匹配上述多个规则，Fizz和Buzz都只能出现一次，Fizz在前。
- 否则，直接说出要报的数字。
####题目要求
- 使用程序模拟执行上述要求，打印出 从1~100所报的内容。每行打印一个报数内容。
##测试代码
####代码环境
- python3.X
####代码功能
- 模拟老师说出两个不同的特殊数(都是个位数)
- 按照题目规则打印同学报数内容
####代码运行
- 执行主函数main()即可自动测试运行
####运行结果
- 每行打印一个报数内容
```
第一个特殊数是[2],第二个特殊数是[5],学生数是[1-100]
Student_1：1
Student_2：Fizz
Student_3：3
Student_4：Fizz
Student_5：Buzz
Student_6：Fizz
Student_7：7
Student_8：Fizz
Student_9：9
Student_10：FizzBuzz
Student_11：11
Student_12：Fizz
Student_13：13
Student_14：Fizz
Student_15：Buzz
Student_16：Fizz
Student_17：17
Student_18：Fizz
Student_19：19
Student_20：FizzBuzz
Student_21：Fizz
Student_22：Fizz
Student_23：Fizz
Student_24：Fizz
Student_25：FizzBuzz
Student_26：Fizz
Student_27：Fizz
Student_28：Fizz
Student_29：Fizz
Student_30：FizzBuzz
Student_31：31
Student_32：Fizz
Student_33：33
Student_34：Fizz
Student_35：Buzz
Student_36：Fizz
Student_37：37
Student_38：Fizz
Student_39：39
Student_40：FizzBuzz
Student_41：41
Student_42：Fizz
Student_43：43
Student_44：Fizz
Student_45：Buzz
Student_46：Fizz
Student_47：47
Student_48：Fizz
Student_49：49
Student_50：FizzBuzz
Student_51：Buzz
Student_52：FizzBuzz
Student_53：Buzz
Student_54：FizzBuzz
Student_55：Buzz
Student_56：FizzBuzz
Student_57：Buzz
Student_58：FizzBuzz
Student_59：Buzz
Student_60：FizzBuzz
Student_61：61
Student_62：Fizz
Student_63：63
Student_64：Fizz
Student_65：Buzz
Student_66：Fizz
Student_67：67
Student_68：Fizz
Student_69：69
Student_70：FizzBuzz
Student_71：71
Student_72：Fizz
Student_73：73
Student_74：Fizz
Student_75：Buzz
Student_76：Fizz
Student_77：77
Student_78：Fizz
Student_79：79
Student_80：FizzBuzz
Student_81：81
Student_82：Fizz
Student_83：83
Student_84：Fizz
Student_85：Buzz
Student_86：Fizz
Student_87：87
Student_88：Fizz
Student_89：89
Student_90：FizzBuzz
Student_91：91
Student_92：Fizz
Student_93：93
Student_94：Fizz
Student_95：Buzz
Student_96：Fizz
Student_97：97
Student_98：Fizz
Student_99：99
Student_100：FizzBuzz
```