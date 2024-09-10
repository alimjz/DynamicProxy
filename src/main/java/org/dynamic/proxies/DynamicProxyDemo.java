package org.dynamic.proxies;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DynamicProxyDemo {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        MyInterface realObject = new MyInterfaceImpl();
        MyInterface proxyObject = (MyInterface) Proxy.newProxyInstance(MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class}, new TestInvocationHandler(realObject));

        proxyObject.sayHello();

        //========================= create new object using reflection
        MyInterfaceImpl.class.getConstructors()[0].newInstance();
    }
}