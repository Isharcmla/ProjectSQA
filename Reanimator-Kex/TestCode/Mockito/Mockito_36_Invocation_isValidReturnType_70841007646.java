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

public class Invocation_isValidReturnType_70841007646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5854;

    public Invocation_isValidReturnType_70841007646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5854 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term5856 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5857 = (Object[]) newArray("java.lang.Object", 1);
        Object term5858 = newInstance(Class.forName("java.lang.Object"));
        Object[] term5859 = (Object[]) newArray("java.lang.Object", 5);
        Object term5860 = newInstance(Class.forName("java.lang.Object"));
        Object term5861 = newInstance(Class.forName("java.lang.Object"));
        Object term5862 = newInstance(Class.forName("java.lang.Object"));
        Object term5863 = newInstance(Class.forName("java.lang.Object"));
        Object term5864 = newInstance(Class.forName("java.lang.Object"));
        Object term5865 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term5854, term5854.getClass(), "sequenceNumber", 597278769);
        setField(term5854, term5854.getClass(), "mock", term5856);
        setField(term5854, term5854.getClass(), "method", null);
        setElement(term5857, 0, term5858);
        setField(term5854, term5854.getClass(), "arguments", term5857);
        setElement(term5859, 0, term5860);
        setElement(term5859, 1, term5861);
        setElement(term5859, 2, term5862);
        setElement(term5859, 3, term5863);
        setElement(term5859, 4, term5864);
        setField(term5854, term5854.getClass(), "rawArguments", term5859);
        setField(term5865, term5865.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term5854, term5854.getClass(), "location", term5865);
        setBooleanField(term5854, term5854.getClass(), "verified", true);
        setBooleanField(term5854, term5854.getClass(), "verifiedInOrder", true);
        setField(term5854, term5854.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isValidReturnType", argTypes, term5854, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


