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

public class Flat3Map_put_1944740725667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151178;
     Object term152520;
     Object term152522;

    public Flat3Map_put_1944740725667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151178 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term151233 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term151178, term151178.getClass(), "delegateMap", null);
        setIntField(term151178, term151178.getClass(), "size", 2);
        setIntField(term151178, term151178.getClass(), "hash2", 0);
        setField(term151178, term151178.getClass(), "value2", term151233);
        term152520 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152521 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term152520, term152520.getClass(), "size", 3);
        setIntField(term152520, term152520.getClass(), "hash1", 0);
        setIntField(term152520, term152520.getClass(), "hash2", 0);
        setIntField(term152520, term152520.getClass(), "hash3", 0);
        setField(term152520, term152520.getClass(), "key1", null);
        setField(term152520, term152520.getClass(), "key2", null);
        setField(term152520, term152520.getClass(), "key3", term152520);
        setField(term152520, term152520.getClass(), "value1", null);
        setFloatField(term152521, term152521.getClass(), "loadFactor", 0.0F);
        setIntField(term152521, term152521.getClass(), "size", 0);
        setField(term152521, term152521.getClass(), "data", null);
        setIntField(term152521, term152521.getClass(), "threshold", 0);
        setIntField(term152521, term152521.getClass(), "modCount", 0);
        setField(term152521, term152521.getClass(), "entrySet", null);
        setField(term152521, term152521.getClass(), "keySet", null);
        setField(term152521, term152521.getClass(), "values", null);
        setField(term152521, term152521.getClass(), "keySet", null);
        setField(term152521, term152521.getClass(), "values", null);
        setField(term152520, term152520.getClass(), "value2", term152521);
        setField(term152520, term152520.getClass(), "value3", null);
        setField(term152520, term152520.getClass(), "delegateMap", null);
        term152522 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term152523 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term152522, term152522.getClass(), "size", 3);
        setIntField(term152522, term152522.getClass(), "hash1", 0);
        setIntField(term152522, term152522.getClass(), "hash2", 0);
        setIntField(term152522, term152522.getClass(), "hash3", 0);
        setField(term152522, term152522.getClass(), "key1", null);
        setField(term152522, term152522.getClass(), "key2", null);
        setField(term152522, term152522.getClass(), "key3", term152522);
        setField(term152522, term152522.getClass(), "value1", null);
        setFloatField(term152523, term152523.getClass(), "loadFactor", 0.0F);
        setIntField(term152523, term152523.getClass(), "size", 0);
        setField(term152523, term152523.getClass(), "data", null);
        setIntField(term152523, term152523.getClass(), "threshold", 0);
        setIntField(term152523, term152523.getClass(), "modCount", 0);
        setField(term152523, term152523.getClass(), "entrySet", null);
        setField(term152523, term152523.getClass(), "keySet", null);
        setField(term152523, term152523.getClass(), "values", null);
        setField(term152523, term152523.getClass(), "keySet", null);
        setField(term152523, term152523.getClass(), "values", null);
        setField(term152522, term152522.getClass(), "value2", term152523);
        setField(term152522, term152522.getClass(), "value3", null);
        setField(term152522, term152522.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term151178;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term151178, args);
        assertTrue(recursiveEquals(term151178, term152520));
        assertTrue(recursiveEquals(term151178, term152522));
        assertTrue(recursiveEquals(retValue, null));
    }

};


