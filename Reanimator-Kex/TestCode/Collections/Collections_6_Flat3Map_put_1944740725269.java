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

public class Flat3Map_put_1944740725269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44067;
     Object term44132;
     Object term44133;

    public Flat3Map_put_1944740725269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44067 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term44067, term44067.getClass(), "delegateMap", null);
        setIntField(term44067, term44067.getClass(), "size", 2);
        setIntField(term44067, term44067.getClass(), "hash2", 0);
        setField(term44067, term44067.getClass(), "value2", null);
        setIntField(term44067, term44067.getClass(), "hash1", 0);
        setField(term44067, term44067.getClass(), "value1", null);
        term44132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44132, term44132.getClass(), "size", 3);
        setIntField(term44132, term44132.getClass(), "hash1", 0);
        setIntField(term44132, term44132.getClass(), "hash2", 0);
        setIntField(term44132, term44132.getClass(), "hash3", 0);
        setField(term44132, term44132.getClass(), "key1", null);
        setField(term44132, term44132.getClass(), "key2", null);
        setField(term44132, term44132.getClass(), "key3", term44132);
        setField(term44132, term44132.getClass(), "value1", null);
        setField(term44132, term44132.getClass(), "value2", null);
        setField(term44132, term44132.getClass(), "value3", null);
        setField(term44132, term44132.getClass(), "delegateMap", null);
        term44133 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44133, term44133.getClass(), "size", 3);
        setIntField(term44133, term44133.getClass(), "hash1", 0);
        setIntField(term44133, term44133.getClass(), "hash2", 0);
        setIntField(term44133, term44133.getClass(), "hash3", 0);
        setField(term44133, term44133.getClass(), "key1", null);
        setField(term44133, term44133.getClass(), "key2", null);
        setField(term44133, term44133.getClass(), "key3", term44133);
        setField(term44133, term44133.getClass(), "value1", null);
        setField(term44133, term44133.getClass(), "value2", null);
        setField(term44133, term44133.getClass(), "value3", null);
        setField(term44133, term44133.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term44067;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term44067, args);
        assertTrue(recursiveEquals(term44067, term44132));
        assertTrue(recursiveEquals(term44067, term44133));
        assertTrue(recursiveEquals(retValue, null));
    }

};


