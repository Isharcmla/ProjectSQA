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

public class Flat3Map_equals_1826922527383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66254;
     Object term66442;
     Object term66483;
     Object term66485;

    public Flat3Map_equals_1826922527383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66254 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term66348 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term66254, term66254.getClass(), "delegateMap", term66348);
        term66442 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        term66483 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term66484 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setIntField(term66483, term66483.getClass(), "size", 0);
        setIntField(term66483, term66483.getClass(), "hash1", 0);
        setIntField(term66483, term66483.getClass(), "hash2", 0);
        setIntField(term66483, term66483.getClass(), "hash3", 0);
        setField(term66483, term66483.getClass(), "key1", null);
        setField(term66483, term66483.getClass(), "key2", null);
        setField(term66483, term66483.getClass(), "key3", null);
        setField(term66483, term66483.getClass(), "value1", null);
        setField(term66483, term66483.getClass(), "value2", null);
        setField(term66483, term66483.getClass(), "value3", null);
        setField(term66484, term66484.getClass(), "header", null);
        setFloatField(term66484, term66484.getClass(), "loadFactor", 0.0F);
        setIntField(term66484, term66484.getClass(), "size", 0);
        setField(term66484, term66484.getClass(), "data", null);
        setIntField(term66484, term66484.getClass(), "threshold", 0);
        setIntField(term66484, term66484.getClass(), "modCount", 0);
        setField(term66484, term66484.getClass(), "entrySet", null);
        setField(term66484, term66484.getClass(), "keySet", null);
        setField(term66484, term66484.getClass(), "values", null);
        setField(term66484, term66484.getClass(), "keySet", null);
        setField(term66484, term66484.getClass(), "values", null);
        setField(term66483, term66483.getClass(), "delegateMap", term66484);
        term66485 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term66485, term66485.getClass(), "header", null);
        setFloatField(term66485, term66485.getClass(), "loadFactor", 0.0F);
        setIntField(term66485, term66485.getClass(), "size", 0);
        setField(term66485, term66485.getClass(), "data", null);
        setIntField(term66485, term66485.getClass(), "threshold", 0);
        setIntField(term66485, term66485.getClass(), "modCount", 0);
        setField(term66485, term66485.getClass(), "entrySet", null);
        setField(term66485, term66485.getClass(), "keySet", null);
        setField(term66485, term66485.getClass(), "values", null);
        setField(term66485, term66485.getClass(), "keySet", null);
        setField(term66485, term66485.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66442;
        Object retValue = callMethod(klass, "equals", argTypes, term66254, args);
        assertTrue(recursiveEquals(term66254, term66483));
        assertTrue(recursiveEquals(term66442, term66485));
        assertTrue(recursiveEquals(retValue, true));
    }

};


