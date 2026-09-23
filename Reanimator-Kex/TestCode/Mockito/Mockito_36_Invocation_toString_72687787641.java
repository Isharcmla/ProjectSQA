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
import java.util.LinkedList;

public class Invocation_toString_72687787641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2076;
     Object term2188;
     Object term2194;

    public Invocation_toString_72687787641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2076 = newInstance(Class.forName("org.mockito.internal.invocation.Invocation"));
        Object term2078 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2079 = (Object[]) newArray("java.lang.Object", 3);
        Object term2080 = newInstance(Class.forName("java.lang.Object"));
        Object term2081 = newInstance(Class.forName("java.lang.Object"));
        Object term2082 = newInstance(Class.forName("java.lang.Object"));
        Object[] term2083 = (Object[]) newArray("java.lang.Object", 5);
        Object term2084 = newInstance(Class.forName("java.lang.Object"));
        Object term2085 = newInstance(Class.forName("java.lang.Object"));
        Object term2086 = newInstance(Class.forName("java.lang.Object"));
        Object term2087 = newInstance(Class.forName("java.lang.Object"));
        Object term2088 = newInstance(Class.forName("java.lang.Object"));
        Object term2089 = newInstance(Class.forName("org.mockito.internal.debugging.Location"));
        setIntField(term2076, term2076.getClass(), "sequenceNumber", -522618178);
        setField(term2076, term2076.getClass(), "mock", term2078);
        setField(term2076, term2076.getClass(), "method", null);
        setElement(term2079, 0, term2080);
        setElement(term2079, 1, term2081);
        setElement(term2079, 2, term2082);
        setField(term2076, term2076.getClass(), "arguments", term2079);
        setElement(term2083, 0, term2084);
        setElement(term2083, 1, term2085);
        setElement(term2083, 2, term2086);
        setElement(term2083, 3, term2087);
        setElement(term2083, 4, term2088);
        setField(term2076, term2076.getClass(), "rawArguments", term2083);
        setField(term2089, term2089.getClass(), "where", "-> at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
        setField(term2076, term2076.getClass(), "location", term2089);
        setBooleanField(term2076, term2076.getClass(), "verified", true);
        setBooleanField(term2076, term2076.getClass(), "verifiedInOrder", true);
        setField(term2076, term2076.getClass(), "realMethod", null);
        term2188 = new LinkedList();
        ((LinkedList) term2188).add((Object)null);
        ((LinkedList) term2188).add((Object)null);
        ((LinkedList) term2188).add((Object)null);
        LinkedList term2196 = new LinkedList();
        term2194 = newInstance(Class.forName("org.mockito.internal.reporting.PrintSettings"));
        setBooleanField(term2194, term2194.getClass(), "multiline", true);
        setField(term2194, term2194.getClass(), "withTypeInfo", term2196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("org.mockito.internal.reporting.PrintSettings");
        Object[] args = new Object[2];
        args[0] = term2188;
        args[1] = term2194;
        try {
            callMethod(klass, "toString", argTypes, term2076, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


