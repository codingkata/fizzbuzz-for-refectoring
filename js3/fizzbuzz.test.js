import { fizzbuzz } from "./fizzbuzz-jest";

test("测试案例：10位同学，报数分别为3和5", () => {
  const result = [
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
  expect(fizzbuzz(10, 3, 5)).toBe(result);
});
