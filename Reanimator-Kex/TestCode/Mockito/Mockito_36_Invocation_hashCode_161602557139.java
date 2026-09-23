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
import java.lang.RuntimeException;
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Invocation_hashCode_161602557139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1663;

    public Invocation_hashCode_161602557139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1663 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term1665 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1666 = (Object[]) newArray("java.lang.Object", 6);
        Object term1667 = newInstance(Class.forName("java.lang.Object"));
        Object term1668 = newInstance(Class.forName("java.lang.Object"));
        Object term1669 = newInstance(Class.forName("java.lang.Object"));
        Object term1670 = newInstance(Class.forName("java.lang.Object"));
        Object term1671 = newInstance(Class.forName("java.lang.Object"));
        Object term1672 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1673 = (Object[]) newArray("java.lang.Object", 2);
        Object term1674 = newInstance(Class.forName("java.lang.Object"));
        Object term1675 = newInstance(Class.forName("java.lang.Object"));
        Object term1676 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term1663, term1663.getClass(), "sequenceNumber", -1339778481);
        setField(term1663, term1663.getClass(), "mock", term1665);
        setField(term1663, term1663.getClass(), "method", null);
        setElement(term1666, 0, term1667);
        setElement(term1666, 1, term1668);
        setElement(term1666, 2, term1669);
        setElement(term1666, 3, term1670);
        setElement(term1666, 4, term1671);
        setElement(term1666, 5, term1672);
        setField(term1663, term1663.getClass(), "arguments", term1666);
        setElement(term1673, 0, term1674);
        setElement(term1673, 1, term1675);
        setField(term1663, term1663.getClass(), "rawArguments", term1673);
        setField(term1676, term1676.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term1663, term1663.getClass(), "location", term1676);
        setBooleanField(term1663, term1663.getClass(), "verified", true);
        setBooleanField(term1663, term1663.getClass(), "verifiedInOrder", false);
        setField(term1663, term1663.getClass(), "realMethod", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hashCode", argTypes, term1663, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


