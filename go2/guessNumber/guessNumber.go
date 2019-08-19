package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main()  {
	result := []int{1,2,3,4}
	var nums[4] int
	inputReader := bufio.NewReader(os.Stdin)
	fmt.Println("Please enter the input: ")
	for i := 0; i < 6; i++ {
		input, err := inputReader.ReadString('\n')
		if err != nil {
			panic(err)
		}
		inputSplit := strings.Split(strings.TrimSpace(input), " ")
		if len(inputSplit) != 4 {
			fmt.Println("输入不正确，重新输入")
			continue
		}
		var tmp int
		//存在重复数字标记
		var flag bool
		for i := 0;i < 4 ; i++  {
			tmp,_ = strconv.Atoi(inputSplit[i])
			for j := 0;j < i ; j++  {
				if nums[j] == tmp {
					flag = true
					break
				}
			}
			nums[i] = tmp
		}

		if flag {
			fmt.Println("输入不正确，重新输入")
			continue
		}

		var a,b int
		for i := 0;i < 4 ; i++  {
			for j := 0;j < 4 ; j++  {
				if result[i] == nums[j] {
					b++
				}
			}
			if result[i] == nums[i]{
				a++
			}
		}
		fmt.Println(strconv.Itoa(a)+"A"+strconv.Itoa(b-a)+"B")
	}
}
