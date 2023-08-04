package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class StepDefs {
    private Calculator calculator;
    private int first;
    private int second;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Operands: (-?\\d+) & (-?\\d+)$")
    public void givenAddOperation(int arg0, int arg1) {
        first = arg0;
        second = arg1;
    }

    @When("^Run \\+$")
    public void runAdd() {
        result = calculator.add(first, second);
        System.out.print(result);
    }

    @When("^Run /$")
    public void runDivide() {
        result = calculator.divide(first, second);
        System.out.print(result);
    }

    @When("^Run \\*$")
    public void runMultiply() {
        result = calculator.multiply(first, second);
        System.out.print(result);
    }

    @When("^Run \\^$")
    public void runPower() {
        result = calculator.power(first, second);
        System.out.print(result);
    }

    @Then("^Expected Result: (-?\\d+\\.?\\d*)$")
    public void expectedResultResult(String arg0) {
        Assert.assertEquals(Double.parseDouble(arg0), result, 0);
    }
}