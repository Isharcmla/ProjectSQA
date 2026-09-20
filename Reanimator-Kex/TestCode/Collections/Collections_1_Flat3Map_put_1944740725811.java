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

public class Flat3Map_put_1944740725811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165496;
     Object term165609;
     Object term165611;

    public Flat3Map_put_1944740725811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165542 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term165496, term165496.getClass(), "delegateMap", null);
        setIntField(term165496, term165496.getClass(), "size", 1);
        setIntField(term165496, term165496.getClass(), "hash1", 0);
        setField(term165496, term165496.getClass(), "value1", null);
        setField(term165496, term165496.getClass(), "key1", term165542);
        term165609 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165609, term165609.getClass(), "size", 2);
        setIntField(term165609, term165609.getClass(), "hash1", 0);
        setIntField(term165609, term165609.getClass(), "hash2", 0);
        setIntField(term165609, term165609.getClass(), "hash3", 0);
        setIntField(term165610, term165610.getClass(), "size", 0);
        setIntField(term165610, term165610.getClass(), "hash1", 0);
        setIntField(term165610, term165610.getClass(), "hash2", 0);
        setIntField(term165610, term165610.getClass(), "hash3", 0);
        setField(term165610, term165610.getClass(), "key1", null);
        setField(term165610, term165610.getClass(), "key2", null);
        setField(term165610, term165610.getClass(), "key3", null);
        setField(term165610, term165610.getClass(), "value1", null);
        setField(term165610, term165610.getClass(), "value2", null);
        setField(term165610, term165610.getClass(), "value3", null);
        setField(term165610, term165610.getClass(), "delegateMap", null);
        setField(term165609, term165609.getClass(), "key1", term165610);
        setField(term165609, term165609.getClass(), "key2", term165609);
        setField(term165609, term165609.getClass(), "key3", null);
        setField(term165609, term165609.getClass(), "value1", null);
        setField(term165609, term165609.getClass(), "value2", null);
        setField(term165609, term165609.getClass(), "value3", null);
        setField(term165609, term165609.getClass(), "delegateMap", null);
        term165611 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term165612 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term165611, term165611.getClass(), "size", 2);
        setIntField(term165611, term165611.getClass(), "hash1", 0);
        setIntField(term165611, term165611.getClass(), "hash2", 0);
        setIntField(term165611, term165611.getClass(), "hash3", 0);
        setIntField(term165612, term165612.getClass(), "size", 0);
        setIntField(term165612, term165612.getClass(), "hash1", 0);
        setIntField(term165612, term165612.getClass(), "hash2", 0);
        setIntField(term165612, term165612.getClass(), "hash3", 0);
        setField(term165612, term165612.getClass(), "key1", null);
        setField(term165612, term165612.getClass(), "key2", null);
        setField(term165612, term165612.getClass(), "key3", null);
        setField(term165612, term165612.getClass(), "value1", null);
        setField(term165612, term165612.getClass(), "value2", null);
        setField(term165612, term165612.getClass(), "value3", null);
        setField(term165612, term165612.getClass(), "delegateMap", null);
        setField(term165611, term165611.getClass(), "key1", term165612);
        setField(term165611, term165611.getClass(), "key2", term165611);
        setField(term165611, term165611.getClass(), "key3", null);
        setField(term165611, term165611.getClass(), "value1", null);
        setField(term165611, term165611.getClass(), "value2", null);
        setField(term165611, term165611.getClass(), "value3", null);
        setField(term165611, term165611.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term165496;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term165496, args);
        assertTrue(recursiveEquals(term165496, term165609));
        assertTrue(recursiveEquals(term165496, term165611));
        assertTrue(recursiveEquals(retValue, null));
    }

};
