package org.apache.commons.collections4.keyvalue;

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
import static org.apache.commons.collections4.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections4.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_96672157914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term106;
     Object term110;
     Object term111;

    public MultiKey_init_96672157914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term2 = newInstance(Class.forName("java.lang.Object"));
        term106 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term107 = (Object[]) newArray("java.lang.Object", 2);
        Object term108 = newInstance(Class.forName("java.lang.Object"));
        Object term109 = newInstance(Class.forName("java.lang.Object"));
        setElement(term107, 0, term108);
        setElement(term107, 1, term109);
        setField(term106, term106.getClass(), "keys", term107);
        term110 = newInstance(Class.forName("java.lang.Object"));
        term111 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term2;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term106));
        assertTrue(recursiveEquals(term1, term110));
        assertTrue(recursiveEquals(term2, term111));
    }

};


