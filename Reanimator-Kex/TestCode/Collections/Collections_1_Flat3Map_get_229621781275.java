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

public class Flat3Map_get_229621781275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49280;
     Object term49380;
     Object term49382;
     Object term49361;

    public Flat3Map_get_229621781275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49280 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49335 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term49280, term49280.getClass(), "delegateMap", null);
        setIntField(term49280, term49280.getClass(), "size", 2);
        setIntField(term49280, term49280.getClass(), "hash2", 0);
        setIntField(term49335, term49335.getClass(), "size", 0);
        setField(term49280, term49280.getClass(), "value2", term49335);
        setIntField(term49280, term49280.getClass(), "hash1", 0);
        setField(term49280, term49280.getClass(), "value1", null);
        setField(term49280, term49280.getClass(), "key2", term49280);
        term49380 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49381 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term49380, term49380.getClass(), "size", 2);
        setIntField(term49380, term49380.getClass(), "hash1", 0);
        setIntField(term49380, term49380.getClass(), "hash2", 0);
        setIntField(term49380, term49380.getClass(), "hash3", 0);
        setField(term49380, term49380.getClass(), "key1", null);
        setField(term49380, term49380.getClass(), "key2", term49380);
        setField(term49380, term49380.getClass(), "key3", null);
        setField(term49380, term49380.getClass(), "value1", null);
        setFloatField(term49381, term49381.getClass(), "loadFactor", 0.0F);
        setIntField(term49381, term49381.getClass(), "size", 0);
        setField(term49381, term49381.getClass(), "data", null);
        setIntField(term49381, term49381.getClass(), "threshold", 0);
        setIntField(term49381, term49381.getClass(), "modCount", 0);
        setField(term49381, term49381.getClass(), "entrySet", null);
        setField(term49381, term49381.getClass(), "keySet", null);
        setField(term49381, term49381.getClass(), "values", null);
        setField(term49381, term49381.getClass(), "keySet", null);
        setField(term49381, term49381.getClass(), "values", null);
        setField(term49380, term49380.getClass(), "value2", term49381);
        setField(term49380, term49380.getClass(), "value3", null);
        setField(term49380, term49380.getClass(), "delegateMap", null);
        term49382 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term49383 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term49382, term49382.getClass(), "size", 2);
        setIntField(term49382, term49382.getClass(), "hash1", 0);
        setIntField(term49382, term49382.getClass(), "hash2", 0);
        setIntField(term49382, term49382.getClass(), "hash3", 0);
        setField(term49382, term49382.getClass(), "key1", null);
        setField(term49382, term49382.getClass(), "key2", term49382);
        setField(term49382, term49382.getClass(), "key3", null);
        setField(term49382, term49382.getClass(), "value1", null);
        setFloatField(term49383, term49383.getClass(), "loadFactor", 0.0F);
        setIntField(term49383, term49383.getClass(), "size", 0);
        setField(term49383, term49383.getClass(), "data", null);
        setIntField(term49383, term49383.getClass(), "threshold", 0);
        setIntField(term49383, term49383.getClass(), "modCount", 0);
        setField(term49383, term49383.getClass(), "entrySet", null);
        setField(term49383, term49383.getClass(), "keySet", null);
        setField(term49383, term49383.getClass(), "values", null);
        setField(term49383, term49383.getClass(), "keySet", null);
        setField(term49383, term49383.getClass(), "values", null);
        setField(term49382, term49382.getClass(), "value2", term49383);
        setField(term49382, term49382.getClass(), "value3", null);
        setField(term49382, term49382.getClass(), "delegateMap", null);
        term49361 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term49361, term49361.getClass(), "loadFactor", 0.0F);
        setIntField(term49361, term49361.getClass(), "size", 0);
        setField(term49361, term49361.getClass(), "data", null);
        setIntField(term49361, term49361.getClass(), "threshold", 0);
        setIntField(term49361, term49361.getClass(), "modCount", 0);
        setField(term49361, term49361.getClass(), "entrySet", null);
        setField(term49361, term49361.getClass(), "keySet", null);
        setField(term49361, term49361.getClass(), "values", null);
        setField(term49361, term49361.getClass(), "keySet", null);
        setField(term49361, term49361.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term49280;
        Object retValue = callMethod(klass, "get", argTypes, term49280, args);
        assertTrue(recursiveEquals(term49280, term49380));
        assertTrue(recursiveEquals(term49280, term49382));
        assertTrue(recursiveEquals(retValue, term49361));
    }

};
