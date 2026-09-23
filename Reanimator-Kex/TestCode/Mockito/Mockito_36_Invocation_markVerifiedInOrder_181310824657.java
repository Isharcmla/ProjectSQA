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

public class Invocation_markVerifiedInOrder_181310824657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7950;

    public Invocation_markVerifiedInOrder_181310824657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7950 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term7952 = newInstance(Class.forName("java.lang.Object"));
        Object[] term7953 = (Object[]) newArray("java.lang.Object", 0);
        Object[] term7954 = (Object[]) newArray("java.lang.Object", 9);
        Object term7955 = newInstance(Class.forName("java.lang.Object"));
        Object term7956 = newInstance(Class.forName("java.lang.Object"));
        Object term7957 = newInstance(Class.forName("java.lang.Object"));
        Object term7958 = newInstance(Class.forName("java.lang.Object"));
        Object term7959 = newInstance(Class.forName("java.lang.Object"));
        Object term7960 = newInstance(Class.forName("java.lang.Object"));
        Object term7961 = newInstance(Class.forName("java.lang.Object"));
        Object term7962 = newInstance(Class.forName("java.lang.Object"));
        Object term7963 = newInstance(Class.forName("java.lang.Object"));
        Object term7964 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term7950, term7950.getClass(), "sequenceNumber", 590364439);
        setField(term7950, term7950.getClass(), "mock", term7952);
        setField(term7950, term7950.getClass(), "method", null);
        setField(term7950, term7950.getClass(), "arguments", term7953);
        setElement(term7954, 0, term7955);
        setElement(term7954, 1, term7956);
        setElement(term7954, 2, term7957);
        setElement(term7954, 3, term7958);
        setElement(term7954, 4, term7959);
        setElement(term7954, 5, term7960);
        setElement(term7954, 6, term7961);
        setElement(term7954, 7, term7962);
        setElement(term7954, 8, term7963);
        setField(term7950, term7950.getClass(), "rawArguments", term7954);
        setField(term7964, term7964.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term7950, term7950.getClass(), "location", term7964);
        setBooleanField(term7950, term7950.getClass(), "verified", false);
        setBooleanField(term7950, term7950.getClass(), "verifiedInOrder", true);
        setField(term7950, term7950.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "markVerifiedInOrder", argTypes, term7950, args);
    }

};


