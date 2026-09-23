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

public class Invocation_getMock_88904981331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17;

    public Invocation_getMock_88904981331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term19 = newInstance(Class.forName("java.lang.Object"));
        Object[] term20 = (Object[]) newArray("java.lang.Object", 3);
        Object term21 = newInstance(Class.forName("java.lang.Object"));
        Object term22 = newInstance(Class.forName("java.lang.Object"));
        Object term23 = newInstance(Class.forName("java.lang.Object"));
        Object[] term24 = (Object[]) newArray("java.lang.Object", 4);
        Object term25 = newInstance(Class.forName("java.lang.Object"));
        Object term26 = newInstance(Class.forName("java.lang.Object"));
        Object term27 = newInstance(Class.forName("java.lang.Object"));
        Object term28 = newInstance(Class.forName("java.lang.Object"));
        Object term29 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term17, term17.getClass(), "sequenceNumber", 1162663216);
        setField(term17, term17.getClass(), "mock", term19);
        setField(term17, term17.getClass(), "method", null);
        setElement(term20, 0, term21);
        setElement(term20, 1, term22);
        setElement(term20, 2, term23);
        setField(term17, term17.getClass(), "arguments", term20);
        setElement(term24, 0, term25);
        setElement(term24, 1, term26);
        setElement(term24, 2, term27);
        setElement(term24, 3, term28);
        setField(term17, term17.getClass(), "rawArguments", term24);
        setField(term29, term29.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term17, term17.getClass(), "location", term29);
        setBooleanField(term17, term17.getClass(), "verified", false);
        setBooleanField(term17, term17.getClass(), "verifiedInOrder", false);
        setField(term17, term17.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMock", argTypes, term17, args);
    }

};


