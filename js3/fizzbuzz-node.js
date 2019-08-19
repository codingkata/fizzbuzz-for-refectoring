const assert = require("assert").strict;

function isDivisible(dvd, dvs) {
  return dvd % dvs === 0;
}

function isPartial(w, p) {
  return w.toString().indexOf(p.toString()) !== -1;
}

function getStudentArr(num) {
  const arr = new Array(num).fill(0);
  return arr.map((value, index) => {
    return index + 1;
  });
}

function fizzbuzz(students, n1, n2) {
  if (!(0 < n1 < 10 && 0 < n2 < 10 && n1 % 1 === 0 && n2 % 1 === 0)) return;
  const fbarr = [];
  students.forEach(value => {
    let fbStr = "";
    if (isDivisible(value, n1) || isPartial(value, n1)) {
      fbStr += "Fizz";
    }
    if (isDivisible(value, n2) || isPartial(value, n2)) {
      fbStr += "Buzz";
    }
    if (fbStr.length === 0) {
      fbStr = value.toString();
    }
    fbarr.push(fbStr);
  });
  return fbarr.join("\n");
}

const students = getStudentArr(10);
const result = fizzbuzz(students, 3, 5);
const assertResult = [
  "1",
  "2",
  "Fizz",
  "4",
  "Buzz",
  "Fizz",
  "7",
  "8",
  "Fizz",
  "Buzz",
].join("\n");
assert(result === assertResult, "FizzBuzz测试错误"); // 测试通过不会有提示，测试未通过会有错误提示
