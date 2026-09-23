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

public class Flat3Map_put_1944740725826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212797;

    public Flat3Map_put_1944740725826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212797 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212843 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term212898 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term212797, term212797.getClass(), "delegateMap", null);
        setIntField(term212797, term212797.getClass(), "size", 2);
        setIntField(term212797, term212797.getClass(), "hash2", 0);
        setField(term212797, term212797.getClass(), "value2", null);
        setIntField(term212797, term212797.getClass(), "hash1", 0);
        setField(term212797, term212797.getClass(), "value1", null);
        setField(term212797, term212797.getClass(), "key2", null);
        setField(term212843, term212843.getClass(), "delegateMap", term212898);
        setField(term212797, term212797.getClass(), "key1", term212843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term212797;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term212797, args);
        assertTrue(recursiveEquals(term212797, 15));
        assertTrue(recursiveEquals(retValue, null));
    }

};


