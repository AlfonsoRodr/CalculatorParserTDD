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

### Refactorization (if needed)

### Test Number 2

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)

### Test Number 3

### Test Code

### Test Fail

### Minimun Functionality

### Every Test Pass

### Refactorization (if needed)

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
