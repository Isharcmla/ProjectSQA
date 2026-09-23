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

public class Invocation_getArguments_199474878933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;

    public Invocation_getArguments_199474878933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term429 = newInstance(Class.forName("java.lang.Object"));
        Object[] term430 = (Object[]) newArray("java.lang.Object", 2);
        Object term431 = newInstance(Class.forName("java.lang.Object"));
        Object term432 = newInstance(Class.forName("java.lang.Object"));
        Object[] term433 = (Object[]) newArray("java.lang.Object", 6);
        Object term434 = newInstance(Class.forName("java.lang.Object"));
        Object term435 = newInstance(Class.forName("java.lang.Object"));
        Object term436 = newInstance(Class.forName("java.lang.Object"));
        Object term437 = newInstance(Class.forName("java.lang.Object"));
        Object term438 = newInstance(Class.forName("java.lang.Object"));
        Object term439 = newInstance(Class.forName("java.lang.Object"));
        Object term440 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term427, term427.getClass(), "sequenceNumber", 391863371);
        setField(term427, term427.getClass(), "mock", term429);
        setField(term427, term427.getClass(), "method", null);
        setElement(term430, 0, term431);
        setElement(term430, 1, term432);
        setField(term427, term427.getClass(), "arguments", term430);
        setElement(term433, 0, term434);
        setElement(term433, 1, term435);
        setElement(term433, 2, term436);
        setElement(term433, 3, term437);
        setElement(term433, 4, term438);
        setElement(term433, 5, term439);
        setField(term427, term427.getClass(), "rawArguments", term433);
        setField(term440, term440.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term427, term427.getClass(), "location", term440);
        setBooleanField(term427, term427.getClass(), "verified", true);
        setBooleanField(term427, term427.getClass(), "verifiedInOrder", true);
        setField(term427, term427.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArguments", argTypes, term427, args);
    }

};


