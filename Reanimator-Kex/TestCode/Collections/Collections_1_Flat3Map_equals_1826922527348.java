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

public class Flat3Map_equals_1826922527348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62493;
     Object term62585;
     Object term63171;
     Object term63172;

    public Flat3Map_equals_1826922527348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62493 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term62493, term62493.getClass(), "delegateMap", null);
        setIntField(term62493, term62493.getClass(), "size", 0);
        term62585 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term62679 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term62585, term62585.getClass(), "delegateMap", term62679);
        term63171 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term63171, term63171.getClass(), "size", 0);
        setIntField(term63171, term63171.getClass(), "hash1", 0);
        setIntField(term63171, term63171.getClass(), "hash2", 0);
        setIntField(term63171, term63171.getClass(), "hash3", 0);
        setField(term63171, term63171.getClass(), "key1", null);
        setField(term63171, term63171.getClass(), "key2", null);
        setField(term63171, term63171.getClass(), "key3", null);
        setField(term63171, term63171.getClass(), "value1", null);
        setField(term63171, term63171.getClass(), "value2", null);
        setField(term63171, term63171.getClass(), "value3", null);
        setField(term63171, term63171.getClass(), "delegateMap", null);
        term63172 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term63173 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term63172, term63172.getClass(), "size", 0);
        setIntField(term63172, term63172.getClass(), "hash1", 0);
        setIntField(term63172, term63172.getClass(), "hash2", 0);
        setIntField(term63172, term63172.getClass(), "hash3", 0);
        setField(term63172, term63172.getClass(), "key1", null);
        setField(term63172, term63172.getClass(), "key2", null);
        setField(term63172, term63172.getClass(), "key3", null);
        setField(term63172, term63172.getClass(), "value1", null);
        setField(term63172, term63172.getClass(), "value2", null);
        setField(term63172, term63172.getClass(), "value3", null);
        setField(term63173, term63173.getClass(), "header", null);
        setFloatField(term63173, term63173.getClass(), "loadFactor", 0.0F);
        setIntField(term63173, term63173.getClass(), "size", 0);
        setField(term63173, term63173.getClass(), "data", null);
        setIntField(term63173, term63173.getClass(), "threshold", 0);
        setIntField(term63173, term63173.getClass(), "modCount", 0);
        setField(term63173, term63173.getClass(), "entrySet", null);
        setField(term63173, term63173.getClass(), "keySet", null);
        setField(term63173, term63173.getClass(), "values", null);
        setField(term63173, term63173.getClass(), "keySet", null);
        setField(term63173, term63173.getClass(), "values", null);
        setField(term63172, term63172.getClass(), "delegateMap", term63173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62585;
        Object retValue = callMethod(klass, "equals", argTypes, term62493, args);
        assertTrue(recursiveEquals(term62493, term63171));
        assertTrue(recursiveEquals(term62585, term63172));
        assertTrue(recursiveEquals(retValue, true));
    }

};
