<?php

function sayFizzBuzz($num, $specialNum1, $specialNum2)
{
    if ($num % $specialNum1 == 0 || strpos(strval($num), strval($specialNum1)) !== false) {
        if ($num % $specialNum2 == 0 || strpos(strval($num), strval($specialNum2)) !== false) {
            return 'FizzBuzz';
        }
        return 'Fizz';
    } else if ($num % $specialNum2 == 0 || strpos(strval($num), strval($specialNum2)) !== false) {
        return 'Buzz';
    } else {
        return strval($num);
    }
}

$specialNumArr = array();
fwrite(STDOUT, "请输入第一个特殊数：");
array_push($specialNumArr, intval(trim(fgets(STDIN))));
fwrite(STDOUT, "请输入第二个特殊数：");
array_push($specialNumArr, intval(trim(fgets(STDIN))));
sort($specialNumArr);

for ($i = 1; $i <= 100; $i++) {
    echo sayFizzBuzz($i, $specialNumArr[0], $specialNumArr[1]) . "\n";
}
