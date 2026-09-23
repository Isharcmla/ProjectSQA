package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_init_128798871113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term91;
     Object term95;
     Object term96;

    public MultiKey_init_128798871113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term2 = newInstance(Class.forName("java.lang.Object"));
        term91 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term92 = (Object[]) newArray("java.lang.Object", 2);
        Object term93 = newInstance(Class.forName("java.lang.Object"));
        Object term94 = newInstance(Class.forName("java.lang.Object"));
        setElement(term92, 0, term93);
        setElement(term92, 1, term94);
        setField(term91, term91.getClass(), "keys", term92);
        term95 = newInstance(Class.forName("java.lang.Object"));
        term96 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term2;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91));
        assertTrue(recursiveEquals(term1, term95));
        assertTrue(recursiveEquals(term2, term96));
    }

};


