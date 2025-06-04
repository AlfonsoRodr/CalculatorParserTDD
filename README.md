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

### Refactorization (if needed)
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

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)

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
