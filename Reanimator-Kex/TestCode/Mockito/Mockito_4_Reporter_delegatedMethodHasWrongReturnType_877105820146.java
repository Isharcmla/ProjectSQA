package org.mockito.exceptions;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Reporter_delegatedMethodHasWrongReturnType_877105820146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22517;
     Object term22518;
     Object term22761;
     Object term22985;
     Object term22986;

    public Reporter_delegatedMethodHasWrongReturnType_877105820146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22517 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term80078 = Class.forName((String) "java.lang.invoke.MethodHandleNatives");
        Class<? extends Object> term80290 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term80322 = Class.forName((String) "java.lang.invoke.MethodHandle");
        Class<? extends Object> term80341 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term80371 = Class.forName((String) "java.lang.invoke.MethodType");
        Class<? extends Object> term80390 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term80998 = Class.forName((String) "org.hamcrest.Matchers");
        Class term80989 = Array.newInstance(term80998, 0).getClass();
        Class term80974 = Array.newInstance(term80989, 0).getClass();
        Class term80953 = Array.newInstance(term80974, 0).getClass();
        Class term80926 = Array.newInstance(term80953, 0).getClass();
        Class term80893 = Array.newInstance(term80926, 0).getClass();
        Class term80854 = Array.newInstance(term80893, 0).getClass();
        Class term80809 = Array.newInstance(term80854, 0).getClass();
        Class term80758 = Array.newInstance(term80809, 0).getClass();
        Class term80411 = Array.newInstance(term80758, 0).getClass();
        Object[] term80412 = (Object[]) newArray("java.lang.Class", 6);
        setElement(term80412, 0, term80290);
        setElement(term80412, 1, term80322);
        setElement(term80412, 2, term80341);
        setElement(term80412, 3, term80371);
        setElement(term80412, 4, term80390);
        setElement(term80412, 5, term80411);
        term22518 = ((Class) term80078).getDeclaredMethod((String) "linkCallSiteTracing", (Class[]) term80412);
        ((Method) term22518).setAccessible(true);
        Class<? extends Object> term81831 = Class.forName((String) "org.mockito.cglib.proxy.CallbackHelper");
        Object[] term82028 = (Object[]) newArray("java.lang.Class", 0);
        term22761 = ((Class) term81831).getDeclaredMethod((String) "getCallbackTypes", (Class[]) term82028);
        ((Method) term22761).setAccessible(true);
        term22985 = newInstance(Class.forName("java.lang.Object"));
        term22986 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        argTypes[1] = Class.forName("java.lang.reflect.Method");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = term22518;
        args[1] = term22761;
        args[2] = term22985;
        args[3] = term22986;
        try {
            callMethod(klass, "delegatedMethodHasWrongReturnType", argTypes, term22517, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


