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
import static org.mockito.internal.invocation.EqualityUtils.*;
import java.lang.Object;

public class Invocation_getMethod_44403061732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;

    public Invocation_getMethod_44403061732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term224 = newInstance(Class.forName("java.lang.Object"));
        Object[] term225 = (Object[]) newArray("java.lang.Object", 1);
        Object term226 = newInstance(Class.forName("java.lang.Object"));
        Object[] term227 = (Object[]) newArray("java.lang.Object", 6);
        Object term228 = newInstance(Class.forName("java.lang.Object"));
        Object term229 = newInstance(Class.forName("java.lang.Object"));
        Object term230 = newInstance(Class.forName("java.lang.Object"));
        Object term231 = newInstance(Class.forName("java.lang.Object"));
        Object term232 = newInstance(Class.forName("java.lang.Object"));
        Object term233 = newInstance(Class.forName("java.lang.Object"));
        Object term234 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term222, term222.getClass(), "sequenceNumber", 1484323161);
        setField(term222, term222.getClass(), "mock", term224);
        setField(term222, term222.getClass(), "method", null);
        setElement(term225, 0, term226);
        setField(term222, term222.getClass(), "arguments", term225);
        setElement(term227, 0, term228);
        setElement(term227, 1, term229);
        setElement(term227, 2, term230);
        setElement(term227, 3, term231);
        setElement(term227, 4, term232);
        setElement(term227, 5, term233);
        setField(term222, term222.getClass(), "rawArguments", term227);
        setField(term234, term234.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term222, term222.getClass(), "location", term234);
        setBooleanField(term222, term222.getClass(), "verified", false);
        setBooleanField(term222, term222.getClass(), "verifiedInOrder", true);
        setField(term222, term222.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term222, args);
    }

};


