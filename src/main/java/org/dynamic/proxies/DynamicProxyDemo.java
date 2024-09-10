package org.dynamic.proxies;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        MyInterface realObject = new MyInterfaceImpl();
        MyInterface proxyObject = (MyInterface) Proxy.newProxyInstance(MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class}, new TestInvocationHandler(realObject));

        proxyObject.sayHello();
    }
}