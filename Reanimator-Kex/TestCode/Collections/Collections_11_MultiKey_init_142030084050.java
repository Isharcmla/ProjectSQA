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

public class MultiKey_init_142030084050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4488;
     Object term4590;
     Object term4734;
     Object term7968;
     Object term7974;
     Object term7976;
     Object term7977;

    public MultiKey_init_142030084050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4488 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term4292 = (Object[]) newArray("java.lang.Object", 0);
        setField(term4488, term4488.getClass(), "keys", term4292);
        term4590 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        term4734 = newInstance(Class.forName("java.util.stream.StreamSpliterators$DelegatingSpliterator$OfPrimitive"));
        term7968 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term7969 = (Object[]) newArray("java.lang.Object", 3);
        Object term7970 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term7971 = (Object[]) newArray("java.lang.Object", 0);
        Object term7972 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object term7973 = newInstance(Class.forName("java.util.stream.StreamSpliterators$DelegatingSpliterator$OfPrimitive"));
        setField(term7970, term7970.getClass(), "keys", term7971);
        setElement(term7969, 0, term7970);
        setField(term7972, term7972.getClass(), "keys", null);
        setElement(term7969, 1, term7972);
        setField(term7973, term7973.getClass(), "supplier", null);
        setField(term7973, term7973.getClass(), "s", null);
        setElement(term7969, 2, term7973);
        setField(term7968, term7968.getClass(), "keys", term7969);
        term7974 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term7975 = (Object[]) newArray("java.lang.Object", 0);
        setField(term7974, term7974.getClass(), "keys", term7975);
        term7976 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        setField(term7976, term7976.getClass(), "keys", null);
        term7977 = newInstance(Class.forName("java.util.stream.StreamSpliterators$DelegatingSpliterator$OfPrimitive"));
        setField(term7977, term7977.getClass(), "supplier", null);
        setField(term7977, term7977.getClass(), "s", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term4488;
        args[1] = term4590;
        args[2] = term4734;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7968));
        assertTrue(recursiveEquals(term4488, term7974));
        assertTrue(recursiveEquals(term4590, term7976));
        assertTrue(recursiveEquals(term4734, term7977));
    }

};


