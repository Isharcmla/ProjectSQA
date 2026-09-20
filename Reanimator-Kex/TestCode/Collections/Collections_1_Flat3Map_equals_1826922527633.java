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

public class Flat3Map_equals_1826922527633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123378;
     Object term123574;
     Object term123690;
     Object term123692;

    public Flat3Map_equals_1826922527633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123378 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123482 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$ArrayAccessor$1"));
        setField(term123378, term123378.getClass(), "delegateMap", null);
        setIntField(term123378, term123378.getClass(), "size", 3);
        setField(term123378, term123378.getClass(), "key3", null);
        setField(term123378, term123378.getClass(), "value3", null);
        setField(term123378, term123378.getClass(), "key2", term123482);
        term123574 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term123574, term123574.getClass(), "delegateMap", null);
        setIntField(term123574, term123574.getClass(), "size", 3);
        setField(term123574, term123574.getClass(), "key3", null);
        setField(term123574, term123574.getClass(), "value3", null);
        term123690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term123691 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$ArrayAccessor$1"));
        setIntField(term123690, term123690.getClass(), "size", 3);
        setIntField(term123690, term123690.getClass(), "hash1", 0);
        setIntField(term123690, term123690.getClass(), "hash2", 0);
        setIntField(term123690, term123690.getClass(), "hash3", 0);
        setField(term123690, term123690.getClass(), "key1", null);
        setIntField(term123691, term123691.getClass(), "hashCodeForCache", 0);
        setField(term123691, term123691.getClass(), "identity", null);
        setField(term123691, term123691.getClass(), "version", null);
        setField(term123690, term123690.getClass(), "key2", term123691);
        setField(term123690, term123690.getClass(), "key3", null);
        setField(term123690, term123690.getClass(), "value1", null);
        setField(term123690, term123690.getClass(), "value2", null);
        setField(term123690, term123690.getClass(), "value3", null);
        setField(term123690, term123690.getClass(), "delegateMap", null);
        term123692 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term123692, term123692.getClass(), "size", 3);
        setIntField(term123692, term123692.getClass(), "hash1", 0);
        setIntField(term123692, term123692.getClass(), "hash2", 0);
        setIntField(term123692, term123692.getClass(), "hash3", 0);
        setField(term123692, term123692.getClass(), "key1", null);
        setField(term123692, term123692.getClass(), "key2", null);
        setField(term123692, term123692.getClass(), "key3", null);
        setField(term123692, term123692.getClass(), "value1", null);
        setField(term123692, term123692.getClass(), "value2", null);
        setField(term123692, term123692.getClass(), "value3", null);
        setField(term123692, term123692.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123574;
        Object retValue = callMethod(klass, "equals", argTypes, term123378, args);
        assertTrue(recursiveEquals(term123378, term123690));
        assertTrue(recursiveEquals(term123574, term123692));
        assertTrue(recursiveEquals(retValue, false));
    }

};
