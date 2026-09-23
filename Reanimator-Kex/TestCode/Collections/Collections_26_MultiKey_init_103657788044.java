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

public class MultiKey_init_103657788044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2352;
     Object term4777;
     Object term4780;

    public MultiKey_init_103657788044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2544 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term2544, term2544.getClass(), "keys", null);
        term2352 = (Object[]) newArray("java.lang.Object", 3);
        setElement(term2352, 0, term2544);
        setElement(term2352, 1, term2544);
        setElement(term2352, 2, term2544);
        term4777 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        Object[] term4778 = (Object[]) newArray("java.lang.Object", 3);
        Object term4779 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term4779, term4779.getClass(), "keys", null);
        setElement(term4778, 0, term4779);
        setElement(term4778, 1, term4779);
        setElement(term4778, 2, term4779);
        setField(term4777, term4777.getClass(), "keys", term4778);
        term4780 = (Object[]) newArray("java.lang.Object", 3);
        Object term4781 = newInstance(Class.forName("org.apache.commons.collections4.keyvalue.MultiKey"));
        setField(term4781, term4781.getClass(), "keys", null);
        setElement(term4780, 0, term4781);
        setElement(term4780, 1, term4781);
        setElement(term4780, 2, term4781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2352;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4777));
        assertTrue(recursiveEquals(term2352, term4780));
    }

};


