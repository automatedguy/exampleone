package base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CustomisedListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    // ...
    @Override
    public void onFinish(ITestContext testContext) {
        LOGGER.info("PASSED TEST CASES");
        testContext.getPassedTests().getAllResults()
                .forEach(result -> {LOGGER.info(result.getName());});

        LOGGER.info("FAILED TEST CASES");
        testContext.getFailedTests().getAllResults()
                .forEach(result -> {LOGGER.info(result.getName());});

        LOGGER.info(
                "Test completed on: " + testContext.getEndDate().toString());
    }

    //...
}