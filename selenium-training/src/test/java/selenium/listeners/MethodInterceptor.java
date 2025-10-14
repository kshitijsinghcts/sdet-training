package selenium.listeners;

import java.util.*;

import org.testng.IMethodInterceptor;
import org.testng.IMethodInstance;
import org.testng.ITestContext;

public class MethodInterceptor implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        List<IMethodInstance> result = new ArrayList<>();
        for (IMethodInstance method : methods) {
            String methodName = method.getMethod().getMethodName();
            if (methodName.contains("test")) { // Example condition: only run methods containing "test"
                result.add(method);
            }
        }
        return result;
    }

}