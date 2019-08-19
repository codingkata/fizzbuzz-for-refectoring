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
  if (
    !(
      students > 0 &&
      students % 1 === 0 &&
      0 < n1 < 10 &&
      0 < n2 < 10 &&
      n1 % 1 === 0 &&
      n2 % 1 === 0
    )
  ) {
    console.error("Input error!");
    return;
  }
  const fbarr = [];
  const studentsArr = getStudentArr(students);
  studentsArr.forEach(value => {
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
