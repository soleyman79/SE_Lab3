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
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Operands are (-?\\d+) & (-?\\d+) and Operator is \\+$")
    public void givenAddOperation(int arg0, int arg1) {
        first = arg0;
        second = arg1;
    }

    @When("^Run$")
    public void run() {
        result = calculator.add(first, second);
        System.out.print(result);
    }

    @Then("^Expected Result: (-?\\d+)$")
    public void expectedResultResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}