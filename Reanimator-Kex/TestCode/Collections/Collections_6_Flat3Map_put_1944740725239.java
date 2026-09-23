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
import java.lang.Object;

public class Flat3Map_put_1944740725239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38936;
     Object term38984;
     Object term39619;
     Object term39621;

    public Flat3Map_put_1944740725239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term38936, term38936.getClass(), "delegateMap", null);
        setIntField(term38936, term38936.getClass(), "size", 1);
        term38984 = newInstance(Class.forName("java.util.Collections"));
        term39619 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39620 = newInstance(Class.forName("java.util.Collections"));
        setIntField(term39619, term39619.getClass(), "size", 2);
        setIntField(term39619, term39619.getClass(), "hash1", 0);
        setIntField(term39619, term39619.getClass(), "hash2", 2022099664);
        setIntField(term39619, term39619.getClass(), "hash3", 0);
        setField(term39619, term39619.getClass(), "key1", null);
        setField(term39619, term39619.getClass(), "key2", term39620);
        setField(term39619, term39619.getClass(), "key3", null);
        setField(term39619, term39619.getClass(), "value1", null);
        setField(term39619, term39619.getClass(), "value2", null);
        setField(term39619, term39619.getClass(), "value3", null);
        setField(term39619, term39619.getClass(), "delegateMap", null);
        term39621 = newInstance(Class.forName("java.util.Collections"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term38984;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term38936, args);
        assertTrue(recursiveEquals(term38936, term39619));
        assertTrue(recursiveEquals(term38984, term39621));
        assertTrue(recursiveEquals(retValue, null));
    }

};


