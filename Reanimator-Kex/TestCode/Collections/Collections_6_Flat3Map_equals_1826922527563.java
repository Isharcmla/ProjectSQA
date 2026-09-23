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

public class Flat3Map_equals_1826922527563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113757;
     Object term113959;
     Object term113995;
     Object term113997;

    public Flat3Map_equals_1826922527563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113867 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term113867, term113867.getClass(), "size", 0);
        setField(term113757, term113757.getClass(), "delegateMap", term113867);
        term113959 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term113959, term113959.getClass(), "delegateMap", null);
        setIntField(term113959, term113959.getClass(), "size", -1);
        term113995 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113996 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term113995, term113995.getClass(), "size", 0);
        setIntField(term113995, term113995.getClass(), "hash1", 0);
        setIntField(term113995, term113995.getClass(), "hash2", 0);
        setIntField(term113995, term113995.getClass(), "hash3", 0);
        setField(term113995, term113995.getClass(), "key1", null);
        setField(term113995, term113995.getClass(), "key2", null);
        setField(term113995, term113995.getClass(), "key3", null);
        setField(term113995, term113995.getClass(), "value1", null);
        setField(term113995, term113995.getClass(), "value2", null);
        setField(term113995, term113995.getClass(), "value3", null);
        setFloatField(term113996, term113996.getClass(), "loadFactor", 0.0F);
        setIntField(term113996, term113996.getClass(), "size", 0);
        setField(term113996, term113996.getClass(), "data", null);
        setIntField(term113996, term113996.getClass(), "threshold", 0);
        setIntField(term113996, term113996.getClass(), "modCount", 0);
        setField(term113996, term113996.getClass(), "entrySet", null);
        setField(term113996, term113996.getClass(), "keySet", null);
        setField(term113996, term113996.getClass(), "values", null);
        setField(term113996, term113996.getClass(), "keySet", null);
        setField(term113996, term113996.getClass(), "values", null);
        setField(term113995, term113995.getClass(), "delegateMap", term113996);
        term113997 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term113997, term113997.getClass(), "size", -1);
        setIntField(term113997, term113997.getClass(), "hash1", 0);
        setIntField(term113997, term113997.getClass(), "hash2", 0);
        setIntField(term113997, term113997.getClass(), "hash3", 0);
        setField(term113997, term113997.getClass(), "key1", null);
        setField(term113997, term113997.getClass(), "key2", null);
        setField(term113997, term113997.getClass(), "key3", null);
        setField(term113997, term113997.getClass(), "value1", null);
        setField(term113997, term113997.getClass(), "value2", null);
        setField(term113997, term113997.getClass(), "value3", null);
        setField(term113997, term113997.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term113959;
        Object retValue = callMethod(klass, "equals", argTypes, term113757, args);
        assertTrue(recursiveEquals(term113757, term113995));
        assertTrue(recursiveEquals(term113959, term113997));
        assertTrue(recursiveEquals(retValue, false));
    }

};


