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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Invocation_toString_212678526140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869;

    public Invocation_toString_212678526140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1869 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1871 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1872 = (Object[]) newArray("java.lang.Object", 1);
        Object term1873 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1874 = (Object[]) newArray("java.lang.Object", 9);
        Object term1875 = newInstance(Class.forName("java.lang.Object"));
        Object term1876 = newInstance(Class.forName("java.lang.Object"));
        Object term1877 = newInstance(Class.forName("java.lang.Object"));
        Object term1878 = newInstance(Class.forName("java.lang.Object"));
        Object term1879 = newInstance(Class.forName("java.lang.Object"));
        Object term1880 = newInstance(Class.forName("java.lang.Object"));
        Object term1881 = newInstance(Class.forName("java.lang.Object"));
        Object term1882 = newInstance(Class.forName("java.lang.Object"));
        Object term1883 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term1869, term1869.getClass(), "sequenceNumber", 1725571209);
        setField(term1869, term1869.getClass(), "mock", term1871);
        setField(term1869, term1869.getClass(), "method", null);
        setElement(term1872, 0, term1873);
        setField(term1869, term1869.getClass(), "arguments", term1872);
        setElement(term1874, 0, term1875);
        setElement(term1874, 1, term1876);
        setElement(term1874, 2, term1877);
        setElement(term1874, 3, term1878);
        setElement(term1874, 4, term1879);
        setElement(term1874, 5, term1880);
        setElement(term1874, 6, term1881);
        setElement(term1874, 7, term1882);
        setElement(term1874, 8, term1880);
        setField(term1869, term1869.getClass(), "rawArguments", term1874);
        setField(term1883, term1883.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1869, term1869.getClass(), "location", term1883);
        setBooleanField(term1869, term1869.getClass(), "verified", false);
        setBooleanField(term1869, term1869.getClass(), "verifiedInOrder", true);
        setField(term1869, term1869.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term1869, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


