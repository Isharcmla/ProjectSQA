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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Invocation_equals_11673388968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1251;
     Object term1359;

    public Invocation_equals_11673388968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1251 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1253 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1254 = (Object[]) newArray("java.lang.Object", 3);
        Object term1255 = newInstance(Class.forName("java.lang.Object"));
        Object term1256 = newInstance(Class.forName("java.lang.Object"));
        Object term1257 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1258 = (Object[]) newArray("java.lang.Object", 1);
        Object term1259 = newInstance(Class.forName("java.lang.Object"));
        Object term1260 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term1251, term1251.getClass(), "sequenceNumber", -2038273078);
        setField(term1251, term1251.getClass(), "mock", term1253);
        setField(term1251, term1251.getClass(), "method", null);
        setElement(term1254, 0, term1255);
        setElement(term1254, 1, term1256);
        setElement(term1254, 2, term1257);
        setField(term1251, term1251.getClass(), "arguments", term1254);
        setElement(term1258, 0, term1259);
        setField(term1251, term1251.getClass(), "rawArguments", term1258);
        setField(term1260, term1260.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1251, term1251.getClass(), "location", term1260);
        setBooleanField(term1251, term1251.getClass(), "verified", true);
        setBooleanField(term1251, term1251.getClass(), "verifiedInOrder", false);
        setField(term1251, term1251.getClass(), "realMethod", null);
        term1359 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1359;
        callMethod(klass, "equals", argTypes, term1251, args);
    }

};


