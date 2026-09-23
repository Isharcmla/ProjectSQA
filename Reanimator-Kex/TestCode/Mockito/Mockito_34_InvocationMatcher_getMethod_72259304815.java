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

public class InvocationMatcher_getMethod_72259304815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;

    public InvocationMatcher_getMethod_72259304815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term535 = new ArrayList();
        term420 = newInstance(Class.forName("org.mockito.internal.invocation.InvocationMatcher"));
        Object term421 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term423 = newInstance(Class.forName("java.lang.Object"));
        Object[] term424 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term425 = (Object[]) newArray("java.lang.Object", 9);
        Object term426 = newInstance(Class.forName("java.lang.Object"));
        Object term427 = newInstance(Class.forName("java.lang.Object"));
        Object term428 = newInstance(Class.forName("java.lang.Object"));
        Object term429 = newInstance(Class.forName("java.lang.Object"));
        Object term430 = newInstance(Class.forName("java.lang.Object"));
        Object term431 = newInstance(Class.forName("java.lang.Object"));
        Object term432 = newInstance(Class.forName("java.lang.Object"));
        Object term433 = newInstance(Class.forName("java.lang.Object"));
        Object term434 = newInstance(Class.forName("java.lang.Object"));
        Object term435 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        Object term534 = newInstance(Class.forName("org.mockito.internal.invocation.StubInfo"));
        setIntField(term421, term421.getClass(), "sequenceNumber", 1484323161);
        setField(term421, term421.getClass(), "mock", term423);
        setField(term421, term421.getClass(), "method", null);
        setField(term421, term421.getClass(), "arguments", term424);
        setElement(term425, 0, term426);
        setElement(term425, 1, term427);
        setElement(term425, 2, term428);
        setElement(term425, 3, term429);
        setElement(term425, 4, term430);
        setElement(term425, 5, term431);
        setElement(term425, 6, term432);
        setElement(term425, 7, term433);
        setElement(term425, 8, term434);
        setField(term421, term421.getClass(), "rawArguments", term425);
        setField(term435, term435.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term421, term421.getClass(), "location", term435);
        setBooleanField(term421, term421.getClass(), "verified", true);
        setBooleanField(term421, term421.getClass(), "verifiedInOrder", true);
        setField(term421, term421.getClass(), "realMethod", null);
        setField(term534, term534.getClass(), "stubbedAt", null);
        setField(term421, term421.getClass(), "stubInfo", term534);
        setField(term420, term420.getClass(), "invocation", term421);
        setField(term420, term420.getClass(), "matchers", term535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.InvocationMatcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getMethod", argTypes, term420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


