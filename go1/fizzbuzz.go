package fizzbuzz


func FizzBuzz(specialNum1,specialNum2 int)(res []interface{}) {

	for i:=1;i<=100;i++{
		resfizz:=judge(i,specialNum1) //是否需要报Fizz
		resbuzz:=judge(i,specialNum2) //是否需要报Buzz

		if resfizz == 1 && resbuzz == 0 {
		    res=append(res,"Fizz")
		} else if resfizz == 0 && resbuzz == 1{
		    res=append(res,"Buzz")
		} else if resfizz == 1 && resbuzz == 1 {
			res=append(res,"FizzBuzz")
		} else if resfizz==0 && resbuzz == 0 {
			res=append(res,i)
		}
	}
	return res
}


//是否要报Fizz或者Buzz 返回值为1表示需要报，返回值为0表示不需要报
func judge(num,specialNum int) (res int){
	if num%specialNum==0{
		return 1
	} else {
		for ;num!=0;num/=10{
			curbit:=num%10
			if curbit==specialNum{
				return 1
			}
		}
	}
	return 0
}


