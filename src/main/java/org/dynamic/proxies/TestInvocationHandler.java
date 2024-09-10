package org.dynamic.proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvocationHandler implements InvocationHandler {
    MyInterface target;

    public TestInvocationHandler(MyInterface target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before Method Execution");
        Object result = method.invoke(target, args);
        System.out.println("After Method Execution");
        return result;
    }
}
