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

public class Flat3Map_remove_8406902791013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202221;
     Object term203432;
     Object term203433;
     Object term203427;

    public Flat3Map_remove_8406902791013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202221 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term202276 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term202221, term202221.getClass(), "delegateMap", null);
        setIntField(term202221, term202221.getClass(), "size", 1);
        setIntField(term202221, term202221.getClass(), "hash1", 0);
        setIntField(term202276, term202276.getClass(), "size", 0);
        setField(term202221, term202221.getClass(), "value1", term202276);
        setField(term202221, term202221.getClass(), "key1", term202221);
        term203432 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term203432, term203432.getClass(), "size", 0);
        setIntField(term203432, term203432.getClass(), "hash1", 0);
        setIntField(term203432, term203432.getClass(), "hash2", 0);
        setIntField(term203432, term203432.getClass(), "hash3", 0);
        setField(term203432, term203432.getClass(), "key1", null);
        setField(term203432, term203432.getClass(), "key2", null);
        setField(term203432, term203432.getClass(), "key3", null);
        setField(term203432, term203432.getClass(), "value1", null);
        setField(term203432, term203432.getClass(), "value2", null);
        setField(term203432, term203432.getClass(), "value3", null);
        setField(term203432, term203432.getClass(), "delegateMap", null);
        term203433 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term203433, term203433.getClass(), "size", 0);
        setIntField(term203433, term203433.getClass(), "hash1", 0);
        setIntField(term203433, term203433.getClass(), "hash2", 0);
        setIntField(term203433, term203433.getClass(), "hash3", 0);
        setField(term203433, term203433.getClass(), "key1", null);
        setField(term203433, term203433.getClass(), "key2", null);
        setField(term203433, term203433.getClass(), "key3", null);
        setField(term203433, term203433.getClass(), "value1", null);
        setField(term203433, term203433.getClass(), "value2", null);
        setField(term203433, term203433.getClass(), "value3", null);
        setField(term203433, term203433.getClass(), "delegateMap", null);
        term203427 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term203427, term203427.getClass(), "loadFactor", 0.0F);
        setIntField(term203427, term203427.getClass(), "size", 0);
        setField(term203427, term203427.getClass(), "data", null);
        setIntField(term203427, term203427.getClass(), "threshold", 0);
        setIntField(term203427, term203427.getClass(), "modCount", 0);
        setField(term203427, term203427.getClass(), "entrySet", null);
        setField(term203427, term203427.getClass(), "keySet", null);
        setField(term203427, term203427.getClass(), "values", null);
        setField(term203427, term203427.getClass(), "keySet", null);
        setField(term203427, term203427.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term202221;
        Object retValue = callMethod(klass, "remove", argTypes, term202221, args);
        assertTrue(recursiveEquals(term202221, term203432));
        assertTrue(recursiveEquals(term202221, term203433));
        assertTrue(recursiveEquals(retValue, term203427));
    }

};
