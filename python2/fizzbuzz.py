# decode
# 00 -> Num      -> 0
# 01 -> Fizz     -> 1
# 10 -> Buzz     -> 2
# 11 -> FizzBuzz -> 3

    
class Solution:
    def __init__(self, num_a, num_b):
        self.num_a = num_a
        self.num_b = num_b
        self.result = []
    
    def solution(self):
        if self.num_a + self.num_b > 18:
            return None
        result = []
        for cur_num in range(1, 101):
            num_str = str(cur_num)
            tmp = 0
            for j in num_str:
                if int(j) == self.num_a:
                    tmp |= 1
                if int(j) == self.num_b:
                    tmp |= 2
            if self.num_a != 0 and cur_num % self.num_a == 0:
                tmp |= 1
            if self.num_b != 0 and cur_num % self.num_b == 0:
                tmp |= 2
            result.append(self._decode_(tmp, cur_num))
        self.result = result

    def _decode_(self, flag, n):
        if flag == 0:
            return n
        if flag == 1:
            return 'Fizz'
        if flag == 2:
            return 'Buzz'
        if flag == 3:
            return 'FizzBuzz'

    def print_result(self):
        self.solution()
        if self.result:
            for line in self.result:
                print(line)
