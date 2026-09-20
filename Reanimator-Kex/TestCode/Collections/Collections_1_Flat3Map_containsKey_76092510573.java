package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;

public class Flat3Map_containsKey_76092510573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109671;
     Object term109785;
     Object term109798;
     Object term109799;

    public Flat3Map_containsKey_76092510573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109671 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term109671, term109671.getClass(), "delegateMap", null);
        setIntField(term109671, term109671.getClass(), "size", 2);
        term109785 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
        term109798 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term109798, term109798.getClass(), "size", 2);
        setIntField(term109798, term109798.getClass(), "hash1", 0);
        setIntField(term109798, term109798.getClass(), "hash2", 0);
        setIntField(term109798, term109798.getClass(), "hash3", 0);
        setField(term109798, term109798.getClass(), "key1", null);
        setField(term109798, term109798.getClass(), "key2", null);
        setField(term109798, term109798.getClass(), "key3", null);
        setField(term109798, term109798.getClass(), "value1", null);
        setField(term109798, term109798.getClass(), "value2", null);
        setField(term109798, term109798.getClass(), "value3", null);
        setField(term109798, term109798.getClass(), "delegateMap", null);
        term109799 = newInstance(Class.forName("org.apache.commons.collections.functors.NOPTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term109785;
        callMethod(klass, "containsKey", argTypes, term109671, args);
        assertTrue(recursiveEquals(term109671, term109798));
        assertTrue(recursiveEquals(term109785, term109799));
    }

};
