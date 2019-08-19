#author barrysun  2019-7-31
import random

def main():
    s = []
    while(len(s) < 2):
        x = random.randint(1,9)
        if x not in s:
            s.append(x)
    random_num1 = s[0]
    random_num2 = s[1]
    print("第一个特殊数是[{0}],第二个特殊数是[{1}],学生数是[1-100]".format(random_num1,random_num2))

    j = 0
    for i in range(1,101):
        random_num1 = int(random_num1); random_num2=int(random_num2)
        if   i % random_num1 == 0 and i % random_num2 != 0:
            if str(random_num2) in str(i):
                i = 'FizzBuzz'
            else:
                i = 'Fizz'
        elif i % random_num1 != 0 and i % random_num2 == 0:
            if str(random_num1) in str(i):
                i = 'FizzBuzz'
            else:
                i = 'Buzz'
        elif i % random_num1 == 0 and i % random_num2 == 0:
            i = 'FizzBuzz'
        else:
            if str(random_num1) in str(i) and str(random_num2) not in str(i):
                i = 'Fizz'
            elif str(random_num1) not in str(i) and str(random_num2) in str(i):
                i = 'Buzz'
            elif str(random_num1) in str(i)and str(random_num2) in str(i):
                i = 'FizzBuzz'
        j += 1
        print("Student_{0}：{1}".format(j,i))

if __name__ == '__main__':
    main()