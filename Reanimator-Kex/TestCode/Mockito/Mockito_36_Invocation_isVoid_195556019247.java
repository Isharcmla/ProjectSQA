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

public class Invocation_isVoid_195556019247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6058;

    public Invocation_isVoid_195556019247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6058 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term6060 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6061 = (Object[]) newArray("java.lang.Object", 4);
        Object term6062 = newInstance(Class.forName("java.lang.Object"));
        Object term6063 = newInstance(Class.forName("java.lang.Object"));
        Object term6064 = newInstance(Class.forName("java.lang.Object"));
        Object term6065 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6066 = (Object[]) newArray("java.lang.Object", 4);
        Object term6067 = newInstance(Class.forName("java.lang.Object"));
        Object term6068 = newInstance(Class.forName("java.lang.Object"));
        Object term6069 = newInstance(Class.forName("java.lang.Object"));
        Object term6070 = newInstance(Class.forName("java.lang.Object"));
        Object term6071 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term6058, term6058.getClass(), "sequenceNumber", -1685132342);
        setField(term6058, term6058.getClass(), "mock", term6060);
        setField(term6058, term6058.getClass(), "method", null);
        setElement(term6061, 0, term6062);
        setElement(term6061, 1, term6063);
        setElement(term6061, 2, term6064);
        setElement(term6061, 3, term6065);
        setField(term6058, term6058.getClass(), "arguments", term6061);
        setElement(term6066, 0, term6067);
        setElement(term6066, 1, term6068);
        setElement(term6066, 2, term6069);
        setElement(term6066, 3, term6070);
        setField(term6058, term6058.getClass(), "rawArguments", term6066);
        setField(term6071, term6071.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term6058, term6058.getClass(), "location", term6071);
        setBooleanField(term6058, term6058.getClass(), "verified", true);
        setBooleanField(term6058, term6058.getClass(), "verifiedInOrder", true);
        setField(term6058, term6058.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isVoid", argTypes, term6058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


