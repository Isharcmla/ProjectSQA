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

public class Flat3Map_equals_1826922527615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118352;
     Object term118554;
     Object term118690;
     Object term118692;

    public Flat3Map_equals_1826922527615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118352 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118462 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term118352, term118352.getClass(), "delegateMap", null);
        setIntField(term118352, term118352.getClass(), "size", 2);
        setField(term118352, term118352.getClass(), "key2", null);
        setField(term118352, term118352.getClass(), "value2", term118462);
        term118554 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118592 = newInstance(Class.forName("java.lang.Object"));
        setField(term118554, term118554.getClass(), "delegateMap", null);
        setIntField(term118554, term118554.getClass(), "size", 2);
        setField(term118554, term118554.getClass(), "key2", null);
        setField(term118554, term118554.getClass(), "value2", term118592);
        term118690 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118691 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term118690, term118690.getClass(), "size", 2);
        setIntField(term118690, term118690.getClass(), "hash1", 0);
        setIntField(term118690, term118690.getClass(), "hash2", 0);
        setIntField(term118690, term118690.getClass(), "hash3", 0);
        setField(term118690, term118690.getClass(), "key1", null);
        setField(term118690, term118690.getClass(), "key2", null);
        setField(term118690, term118690.getClass(), "key3", null);
        setField(term118690, term118690.getClass(), "value1", null);
        setFloatField(term118691, term118691.getClass(), "loadFactor", 0.0F);
        setIntField(term118691, term118691.getClass(), "size", 0);
        setField(term118691, term118691.getClass(), "data", null);
        setIntField(term118691, term118691.getClass(), "threshold", 0);
        setIntField(term118691, term118691.getClass(), "modCount", 0);
        setField(term118691, term118691.getClass(), "entrySet", null);
        setField(term118691, term118691.getClass(), "keySet", null);
        setField(term118691, term118691.getClass(), "values", null);
        setField(term118691, term118691.getClass(), "keySet", null);
        setField(term118691, term118691.getClass(), "values", null);
        setField(term118690, term118690.getClass(), "value2", term118691);
        setField(term118690, term118690.getClass(), "value3", null);
        setField(term118690, term118690.getClass(), "delegateMap", null);
        term118692 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term118693 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term118692, term118692.getClass(), "size", 2);
        setIntField(term118692, term118692.getClass(), "hash1", 0);
        setIntField(term118692, term118692.getClass(), "hash2", 0);
        setIntField(term118692, term118692.getClass(), "hash3", 0);
        setField(term118692, term118692.getClass(), "key1", null);
        setField(term118692, term118692.getClass(), "key2", null);
        setField(term118692, term118692.getClass(), "key3", null);
        setField(term118692, term118692.getClass(), "value1", null);
        setField(term118692, term118692.getClass(), "value2", term118693);
        setField(term118692, term118692.getClass(), "value3", null);
        setField(term118692, term118692.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term118554;
        Object retValue = callMethod(klass, "equals", argTypes, term118352, args);
        assertTrue(recursiveEquals(term118352, term118690));
        assertTrue(recursiveEquals(term118554, term118692));
        assertTrue(recursiveEquals(retValue, false));
    }

};
