package org.mockito.internal.invocation;

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
import java.lang.NullPointerException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class InvocationMatcher_getMethod_72259304816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;

    public InvocationMatcher_getMethod_72259304816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term532 = new ArrayList();
        term418 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term419 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term421 = newInstance(Class.forName("java.lang.Object"));
        Object[] term422 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term423 = (Object[]) newArray("java.lang.Object", 9);
        Object term424 = newInstance(Class.forName("java.lang.Object"));
        Object term425 = newInstance(Class.forName("java.lang.Object"));
        Object term426 = newInstance(Class.forName("java.lang.Object"));
        Object term427 = newInstance(Class.forName("java.lang.Object"));
        Object term428 = newInstance(Class.forName("java.lang.Object"));
        Object term429 = newInstance(Class.forName("java.lang.Object"));
        Object term430 = newInstance(Class.forName("java.lang.Object"));
        Object term431 = newInstance(Class.forName("java.lang.Object"));
        Object term432 = newInstance(Class.forName("java.lang.Object"));
        Object term433 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term531 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term419, term419.getClass(), "sequenceNumber", 1484323161);
        setField(term419, term419.getClass(), "mock", term421);
        setField(term419, term419.getClass(), "method", null);
        setField(term419, term419.getClass(), "arguments", term422);
        setElement(term423, 0, term424);
        setElement(term423, 1, term425);
        setElement(term423, 2, term426);
        setElement(term423, 3, term427);
        setElement(term423, 4, term428);
        setElement(term423, 5, term429);
        setElement(term423, 6, term430);
        setElement(term423, 7, term431);
        setElement(term423, 8, term432);
        setField(term419, term419.getClass(), "rawArguments", term423);
        setField(term433, term433.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term419, term419.getClass(), "location", term433);
        setBooleanField(term419, term419.getClass(), "verified", false);
        setField(term419, term419.getClass(), "realMethod", null);
        setField(term531, term531.getClass(), "stubbedAt", null);
        setField(term419, term419.getClass(), "stubInfo", term531);
        setField(term418, term418.getClass(), "invocation", term419);
        setField(term418, term418.getClass(), "matchers", term532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getMethod", argTypes, term418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


