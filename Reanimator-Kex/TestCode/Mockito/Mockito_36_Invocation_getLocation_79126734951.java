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

public class Invocation_getLocation_79126734951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6821;

    public Invocation_getLocation_79126734951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6821 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term6823 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6824 = (Object[]) newArray("java.lang.Object", 7);
        Object term6825 = newInstance(Class.forName("java.lang.Object"));
        Object term6826 = newInstance(Class.forName("java.lang.Object"));
        Object term6827 = newInstance(Class.forName("java.lang.Object"));
        Object term6828 = newInstance(Class.forName("java.lang.Object"));
        Object term6829 = newInstance(Class.forName("java.lang.Object"));
        Object term6830 = newInstance(Class.forName("java.lang.Object"));
        Object term6831 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6832 = (Object[]) newArray("java.lang.Object", 7);
        Object term6833 = newInstance(Class.forName("java.lang.Object"));
        Object term6834 = newInstance(Class.forName("java.lang.Object"));
        Object term6835 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term6821, term6821.getClass(), "sequenceNumber", -655067527);
        setField(term6821, term6821.getClass(), "mock", term6823);
        setField(term6821, term6821.getClass(), "method", null);
        setElement(term6824, 0, term6825);
        setElement(term6824, 1, term6826);
        setElement(term6824, 2, term6827);
        setElement(term6824, 3, term6828);
        setElement(term6824, 4, term6829);
        setElement(term6824, 5, term6830);
        setElement(term6824, 6, term6831);
        setField(term6821, term6821.getClass(), "arguments", term6824);
        setElement(term6832, 0, term6833);
        setElement(term6832, 1, term6834);
        setElement(term6832, 2, term6831);
        setElement(term6832, 3, term6833);
        setElement(term6832, 4, term6823);
        setElement(term6832, 5, term6829);
        setElement(term6832, 6, term6827);
        setField(term6821, term6821.getClass(), "rawArguments", term6832);
        setField(term6835, term6835.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term6821, term6821.getClass(), "location", term6835);
        setBooleanField(term6821, term6821.getClass(), "verified", false);
        setBooleanField(term6821, term6821.getClass(), "verifiedInOrder", false);
        setField(term6821, term6821.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term6821, args);
    }

};


