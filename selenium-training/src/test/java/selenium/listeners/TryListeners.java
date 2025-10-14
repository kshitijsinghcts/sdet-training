package selenium.listeners;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

// will be trying MethodInterceptor, CustomListener, and Retry Case
@Listeners({ MethodInterceptor.class, TestCustomListener.class })
public class TryListeners {
    @Test(retryAnalyzer = RetryCase.class)
    public void test1() {
        System.out.println("Test1");
        org.testng.Assert.assertTrue(false);
    }

    @Test
    public void atest2() {
        System.out.println("Test2");
    }

    @Test
    public void test3() {
        System.out.println("Test3");
    }

    // this won't run since it doesn't have 'test' in name
    @Test
    public void case4() {
        System.out.println("Test4");
        org.testng.Assert.assertTrue(true);
    }

}
