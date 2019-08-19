package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	var num1, num2 int
	//输入
	_, err := fmt.Scan(&num1, &num2)
	if err != nil {
		panic(err)
	}
	count := 100
	fizzBuzz(num1,num2,count)
}

func fizzBuzz(num1, num2, count int){
	var i int
	for i = 1; i <= count; i++ {
		if condition2(i, num1, num2) {
			fmt.Println("FizzBuzz")
		} else if condition1(i, num1) {
			fmt.Println("Fizz")
		} else if condition1(i, num2) {
			fmt.Println("Buzz")
		} else {
			fmt.Println(i)
		}
	}
}

// num的倍数或包含num数值
func condition1(num, num1 int) bool {
	if num%num1 == 0 || strings.Contains(strconv.Itoa(num), strconv.Itoa(num1)) {
		return true
	}
	return false
}

//同时满足两个数的倍数
func condition2(num, num1, num2 int) bool {
	if num%num1 == 0 && num%num2 == 0 {
		return true
	}
	return false
}
