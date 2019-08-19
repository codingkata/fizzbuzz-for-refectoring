import unittest
from fizzbuzz import Solution

class TestFizzbuzz(unittest.TestCase):
    def test_zero(self):
        sol = Solution(0, 1)
        sol.solution()
        res = sol.result
        self.assertEqual(len(res), 100)
        res_right = [
            'Buzz', 'Buzz', 'Buzz', 'Buzz', 'Buzz', 'Buzz',
            'Buzz', 'Buzz', 'Buzz', 'FizzBuzz',
            'Buzz', 'Buzz', 'Buzz', 'Buzz', 'Buzz', 'Buzz',
            'Buzz', 'Buzz', 'Buzz', 'FizzBuzz', 'Buzz', 'Buzz'
        ]
        self.assertEqual(res[:len(res_right)], res_right)
    
    def test_invalid_num(self):
        sol = Solution(10, 9)
        sol.solution()
        res = sol.result
        self.assertEqual(res, [])

    def test_equal_num(self):
        sol = Solution(4, 4)
        sol.solution()
        res = sol.result
        self.assertEqual(len(res), 100)
        res_right = [
            1, 2, 3, 'FizzBuzz', 5, 6, 7, 'FizzBuzz', 9, 10,
            11, 'FizzBuzz', 13
        ]
        self.assertEqual(res[:len(res_right)], res_right)

    def test_function(self):
        sol = Solution(3, 5)
        sol.solution()
        res = sol.result
        self.assertEqual(len(res), 100)
        res_right = [
            1, 2, 'Fizz', 4, 'Buzz', 'Fizz', 7, 8, 'Fizz', 'Buzz',
            11, 'Fizz', 'Fizz', 14, 'FizzBuzz', 16
        ]
        self.assertEqual(res[:len(res_right)], res_right)


if __name__ == "__main__":
    unittest.main()
