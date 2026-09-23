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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88259;
     Object term88591;

    public Flat3Map_put_1944740725477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88259 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term88369 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term88499 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term88369, term88369.getClass(), "size", 0);
        setField(term88259, term88259.getClass(), "delegateMap", term88369);
        setIntField(term88259, term88259.getClass(), "size", 3);
        setIntField(term88259, term88259.getClass(), "hash3", 0);
        setField(term88259, term88259.getClass(), "key3", term88259);
        setIntField(term88259, term88259.getClass(), "hash2", 0);
        setField(term88259, term88259.getClass(), "key2", null);
        setIntField(term88259, term88259.getClass(), "hash1", 0);
        setField(term88259, term88259.getClass(), "key1", null);
        setField(term88259, term88259.getClass(), "value3", term88499);
        setField(term88259, term88259.getClass(), "value2", null);
        setField(term88259, term88259.getClass(), "value1", null);
        term88591 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term88591, term88591.getClass(), "delegateMap", null);
        setIntField(term88591, term88591.getClass(), "size", 3);
        setIntField(term88591, term88591.getClass(), "hash3", 0);
        setField(term88591, term88591.getClass(), "value3", null);
        setIntField(term88591, term88591.getClass(), "hash2", 0);
        setField(term88591, term88591.getClass(), "value2", null);
        setIntField(term88591, term88591.getClass(), "hash1", 0);
        setField(term88591, term88591.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term88591;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term88259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


