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

public class Invocation_returnsPrimitive_177309785050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6634;

    public Invocation_returnsPrimitive_177309785050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6634 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term6636 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6637 = (Object[]) newArray("java.lang.Object", 6);
        Object term6638 = newInstance(Class.forName("java.lang.Object"));
        Object term6639 = newInstance(Class.forName("java.lang.Object"));
        Object term6640 = newInstance(Class.forName("java.lang.Object"));
        Object term6641 = newInstance(Class.forName("java.lang.Object"));
        Object term6642 = newInstance(Class.forName("java.lang.Object"));
        Object term6643 = newInstance(Class.forName("java.lang.Object"));
        Object[] term6644 = (Object[]) newArray("java.lang.Object", 1);
        Object term6645 = newInstance(Class.forName("java.lang.Object"));
        Object term6646 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term6634, term6634.getClass(), "sequenceNumber", 1048535127);
        setField(term6634, term6634.getClass(), "mock", term6636);
        setField(term6634, term6634.getClass(), "method", null);
        setElement(term6637, 0, term6638);
        setElement(term6637, 1, term6639);
        setElement(term6637, 2, term6640);
        setElement(term6637, 3, term6641);
        setElement(term6637, 4, term6642);
        setElement(term6637, 5, term6643);
        setField(term6634, term6634.getClass(), "arguments", term6637);
        setElement(term6644, 0, term6645);
        setField(term6634, term6634.getClass(), "rawArguments", term6644);
        setField(term6646, term6646.getClass(), "where", "-> at jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)");
        setField(term6634, term6634.getClass(), "location", term6646);
        setBooleanField(term6634, term6634.getClass(), "verified", true);
        setBooleanField(term6634, term6634.getClass(), "verifiedInOrder", false);
        setField(term6634, term6634.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "returnsPrimitive", argTypes, term6634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


