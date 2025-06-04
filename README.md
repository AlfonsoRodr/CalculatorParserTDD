# CalculatorParserTDD

## Authors
- Alfonso Rodríguez Gutt
- Marc Burgos Ucendo

## Table of Contents
- [Test Only One Number](#test-only-one-number)
  - [Test Number 1](#test-number-1)
  - [Test Number 2](#test-number-2)
  - [Test Number 3](#test-number-3) 
- [Test Arithmethic Sum](#test-arithmethic-sum)
- [Test Arithmethic Substraction](#test-arithmethic-substraction)
- [Expression with a Single Letter Test](#expression-with-a-single-letter-test)
- [Expresion with Multiple Letters Test](#expression-with-multiple-letters-test)
- [Expression with Numbers and Letters Test](#expression-with-numbers-and-letters-test)

> [!IMPORTANT]
> In order to do the refactorization, we apply the `Rule of 3` while refactoring.

## Test Only One Number

### Test Number 1

### Test Code
````java
   @Test
    public void TestOneNumber(){
        String operation = "1";
        int res = this.calculator.parse(operation);
        assertEquals(1,res);
    }
````

### Test Fail
```log
java.lang.UnsupportedOperationException: Not implemented yet
 at es.codeurjc.test.CalculatorParser.parse(CalculatorParser.java:6)
 at es.codeurjc.test.CalculatorParserTest.TestOneNumber(CalculatorParserTest.java:18)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
````

### Minimun Functionality
````java
   public int parse(String expression) {
        if ("1".equals(expression)) {
            return 1;
        }
        throw new IllegalArgumentException("Expected number 1");
    }
````

### Every Test Pass
![Test Pass1](https://github.com/AlfonsoRodr/CalculatorParserTDD/blob/main/Screenshots/TestP1.png)
### Test Number 2

### Test Code
````java
@Test
    public void TestOneNumber2(){
        String operation = "2";
        int res = this.calculator.parse(operation);
        assertEquals(2,res);
    }
````
### Test Fail
```log
**java.lang.IllegalArgumentException: Expected number 1
 at es.codeurjc.test.CalculatorParser.parse(CalculatorParser.java:9)
 at es.codeurjc.test.CalculatorParserTest.TestOneNumber2(CalculatorParserTest.java:24)
 at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
 at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
**
````
### Minimun Functionality
````java
   public int parse(String expression) {
        if ("1".equals(expression)) {
            return 1;
        }else if("2".equals(expression)){
            return 2;
        }
        throw new IllegalArgumentException("Expected number 1");
    }
````

### Every Test Pass
![Test Pass2](https://github.com/AlfonsoRodr/CalculatorParserTDD/blob/main/Screenshots/TestP2.png)
### Test Number 3

### Test Code

````java
@Test
    public void TestOneNumber3(){
        String operation = "3";
        int res = this.calculator.parse(operation);
        assertEquals(3,res);
    }
````

### Test Fail
````log
java.lang.IllegalArgumentException: Expected number 1
 at es.codeurjc.test.CalculatorParser.parse(CalculatorParser.java:11)
 at es.codeurjc.test.CalculatorParserTest.TestOneNumber3(CalculatorParserTest.java:31)
 at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
 at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
````
### Minimun Functionality
````java
 public int parse(String expression) {
        if ("1".equals(expression)) {
            return 1;
        }else if("2".equals(expression)){
            return 2;
        }else if("3".equals(expression)){
            return 3;
        }  
        throw new IllegalArgumentException("Expected number 1");
    }
````

### Every Test Pass
![Test Pass3](https://github.com/AlfonsoRodr/CalculatorParserTDD/blob/main/Screenshots/TestP3.png)
### Refactorization
First we refactorize the test
````java
  @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testOneNumber(String operation) {
        int res = this.calculator.parse(operation);
        assertEquals(Integer.parseInt(operation), res);
    }
````
then we do it with the minimum functionality
````java
  public int parse(String expression) {
       return Integer.parseInt(expression);
    }
````

## Test Arithmethic Sum

### Test Sum 1

### Test Code
````java
@Test
public void sumTest1() {
  String expression = "1 + 1";
  int res = this.calculator.parse(expression);
  assertEquals(2, res);
}
````

### Test Fail
```log
java.lang.NumberFormatException: For input string: "1 + 1"
 at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
 at java.base/java.lang.Integer.parseInt(Unknown Source)
 at java.base/java.lang.Integer.parseInt(Unknown Source)
 at es.codeurjc.test.CalculatorParser.parse(CalculatorParser.java:6)
 at es.codeurjc.test.CalculatorParserTest.sumTest1(CalculatorParserTest.java:26)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
````

### Minimun Functionality
```java
public int parse(String expression) {
  if (expression.equals("1 + 1")) {
    return 2;
  }
  return Integer.parseInt(expression);
}
````

### Every Test Pass

### Test Sum 2

### Test Code
````java
@Test
public void sumTest2() {
  String expression = "2 + 3";
  int res = this.calculator.parse(expression);
  assertEquals(5, res);
}
````

### Test Fail
```log
java.lang.NumberFormatException: For input string: "2 + 3"
 at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
 at java.base/java.lang.Integer.parseInt(Unknown Source)
 at java.base/java.lang.Integer.parseInt(Unknown Source)
 at es.codeurjc.test.CalculatorParser.parse(CalculatorParser.java:9)
 at es.codeurjc.test.CalculatorParserTest.sumTest2(CalculatorParserTest.java:33)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
````

### Minimun Functionality
```java
public int parse(String expression) {
  if (expression.equals("1 + 1")) {
    return 2;
  }
  else if (expression.equals("2 + 3")) {
    return 5;
  }
  return Integer.parseInt(expression);
}
````

### Every Test Pass

### Test Sum 3

### Test Code
````java
@Test
public void sumTest3() {
  String expression = "2 + 3 + 4";
  int res = this.calculator.parse(expression);
  assertEquals(9, res);
}
````

### Test Fail
```log
java.lang.NumberFormatException: For input string: "2 + 3 + 4"
 at java.base/java.lang.NumberFormatException.forInputString(Unknown Source)
 at java.base/java.lang.Integer.parseInt(Unknown Source)
 at java.base/java.lang.Integer.parseInt(Unknown Source)
 at es.codeurjc.test.CalculatorParser.parse(CalculatorParser.java:12)
 at es.codeurjc.test.CalculatorParserTest.sumTest3(CalculatorParserTest.java:40)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
 at java.base/java.util.ArrayList.forEach(Unknown Source)
````

### Minimun Functionality
```java
public int parse(String expression) {
  if (expression.equals("1 + 1")) {
    return 2;
  }
  else if (expression.equals("2 + 3")) {
    return 5;
  }
  else if (expression.equals("2 + 3 + 4")) {
    return 9;
  }
  return Integer.parseInt(expression);
}
````

### Every Test Pass

### Refactorization

#### Functionality
````java
public int parse(String expression) {
  String[] tokens = expression.split("\\+");
  int result = 0;
  for (String token : tokens) {
      result += Integer.parseInt(token.trim());
  }
  return result;
}
````

#### Test
````java
@ParameterizedTest
@ValueSource(strings = {"1 + 1:2", "2 + 3:5", "2 + 3 + 4:9"})
public void sumTests(String input) {
  String[] parts = input.split(":");
  String expression = parts[0];
  int expected = Integer.parseInt(parts[1]);
  int res = this.calculator.parse(expression);
  assertEquals(expected, res);
}
````

#### Test Pass After Refactoring

### Test Sum 4

> [!IMPORTANT]
> Since we refactorize in the previous test case by applying the `Rule of 3`, in this test case the test will pass and it will only be needed to add this case to the `ParameterizedTest`, aditionally, the functionality will not need any further changes

### Test Code
````java
@ParameterizedTest
@ValueSource(strings = {"1 + 1:2", "2 + 3:5", "2 + 3 + 4:9", "1 + 2 + 3 + 4:10"})
public void sumTests(String input) {
  String[] parts = input.split(":");
  String expression = parts[0];
  int expected = Integer.parseInt(parts[1]);
  int res = this.calculator.parse(expression);
  assertEquals(expected, res);
}
````

### Test Fail
The test does not fail because of the explanation provided above.

### Minimun Functionality
It will not have any changes due to the explanation provided above.

### Every Test Pass

## Test Arithmethic Substraction

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)

## Expression with a Single Letter Test

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)

## Expression with Multiple Letters Test

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)

## Expression with Numbers and Letters Test

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)
