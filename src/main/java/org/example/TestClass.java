package org.example;

public class TestClass {

    private String testString;
    private int testInt;

    TestClass(String testString, int testInt) {
        this.testString = testString;
        this.testInt = testInt;
    }

    public int getTestInt() {
        return testInt;
    }

    public String getTestString() {
        return testString;
    }


    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }


    @Override
    public String toString() {
        return String.format("String: %s, Int: %d", testString, testInt);
    }
}
