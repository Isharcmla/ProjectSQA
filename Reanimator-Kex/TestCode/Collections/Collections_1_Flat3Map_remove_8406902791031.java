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

public class Flat3Map_remove_8406902791031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206537;
     Object term206629;
     Object term206951;
     Object term206952;

    public Flat3Map_remove_8406902791031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206537 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term206537, term206537.getClass(), "delegateMap", null);
        setIntField(term206537, term206537.getClass(), "size", 3);
        setIntField(term206537, term206537.getClass(), "hash3", 0);
        setField(term206537, term206537.getClass(), "key3", null);
        setIntField(term206537, term206537.getClass(), "hash2", 0);
        setField(term206537, term206537.getClass(), "key2", null);
        setIntField(term206537, term206537.getClass(), "hash1", 0);
        setField(term206537, term206537.getClass(), "key1", term206537);
        term206629 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206739 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term206777 = newInstance(Class.forName("java.lang.Object"));
        setField(term206629, term206629.getClass(), "delegateMap", null);
        setIntField(term206629, term206629.getClass(), "size", 3);
        setIntField(term206629, term206629.getClass(), "hash3", 0);
        setIntField(term206739, term206739.getClass(), "size", 0);
        setField(term206629, term206629.getClass(), "value3", term206739);
        setIntField(term206629, term206629.getClass(), "hash2", 0);
        setField(term206629, term206629.getClass(), "value2", null);
        setIntField(term206629, term206629.getClass(), "hash1", 0);
        setField(term206629, term206629.getClass(), "value1", null);
        setField(term206629, term206629.getClass(), "key3", term206777);
        term206951 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term206951, term206951.getClass(), "size", 3);
        setIntField(term206951, term206951.getClass(), "hash1", 0);
        setIntField(term206951, term206951.getClass(), "hash2", 0);
        setIntField(term206951, term206951.getClass(), "hash3", 0);
        setField(term206951, term206951.getClass(), "key1", term206951);
        setField(term206951, term206951.getClass(), "key2", null);
        setField(term206951, term206951.getClass(), "key3", null);
        setField(term206951, term206951.getClass(), "value1", null);
        setField(term206951, term206951.getClass(), "value2", null);
        setField(term206951, term206951.getClass(), "value3", null);
        setField(term206951, term206951.getClass(), "delegateMap", null);
        term206952 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term206953 = newInstance(Class.forName("java.lang.Object"));
        Object term206954 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term206952, term206952.getClass(), "size", 3);
        setIntField(term206952, term206952.getClass(), "hash1", 0);
        setIntField(term206952, term206952.getClass(), "hash2", 0);
        setIntField(term206952, term206952.getClass(), "hash3", 0);
        setField(term206952, term206952.getClass(), "key1", null);
        setField(term206952, term206952.getClass(), "key2", null);
        setField(term206952, term206952.getClass(), "key3", term206953);
        setField(term206952, term206952.getClass(), "value1", null);
        setField(term206952, term206952.getClass(), "value2", null);
        setFloatField(term206954, term206954.getClass(), "loadFactor", 0.0F);
        setIntField(term206954, term206954.getClass(), "size", 0);
        setField(term206954, term206954.getClass(), "data", null);
        setIntField(term206954, term206954.getClass(), "threshold", 0);
        setIntField(term206954, term206954.getClass(), "modCount", 0);
        setField(term206954, term206954.getClass(), "entrySet", null);
        setField(term206954, term206954.getClass(), "keySet", null);
        setField(term206954, term206954.getClass(), "values", null);
        setField(term206954, term206954.getClass(), "keySet", null);
        setField(term206954, term206954.getClass(), "values", null);
        setField(term206952, term206952.getClass(), "value3", term206954);
        setField(term206952, term206952.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term206629;
        Object retValue = callMethod(klass, "remove", argTypes, term206537, args);
        assertTrue(recursiveEquals(term206537, term206951));
        assertTrue(recursiveEquals(term206629, term206952));
        assertTrue(recursiveEquals(retValue, null));
    }

};
