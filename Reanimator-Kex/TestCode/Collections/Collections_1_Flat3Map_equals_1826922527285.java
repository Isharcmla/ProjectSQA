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
import java.util.HashMap;

public class Flat3Map_equals_1826922527285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50837;
     Object term50929;
     Object term51016;
     Object term51017;

    public Flat3Map_equals_1826922527285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50837 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term50837, term50837.getClass(), "delegateMap", null);
        setIntField(term50837, term50837.getClass(), "size", 1);
        setField(term50837, term50837.getClass(), "key1", null);
        HashMap term50977 = new HashMap();
        term50929 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term50929, term50929.getClass(), "delegateMap", null);
        setIntField(term50929, term50929.getClass(), "size", 1);
        setField(term50929, term50929.getClass(), "key1", term50977);
        term51016 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51016, term51016.getClass(), "size", 1);
        setIntField(term51016, term51016.getClass(), "hash1", 0);
        setIntField(term51016, term51016.getClass(), "hash2", 0);
        setIntField(term51016, term51016.getClass(), "hash3", 0);
        setField(term51016, term51016.getClass(), "key1", null);
        setField(term51016, term51016.getClass(), "key2", null);
        setField(term51016, term51016.getClass(), "key3", null);
        setField(term51016, term51016.getClass(), "value1", null);
        setField(term51016, term51016.getClass(), "value2", null);
        setField(term51016, term51016.getClass(), "value3", null);
        setField(term51016, term51016.getClass(), "delegateMap", null);
        HashMap term51018 = new HashMap();
        term51017 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term51017, term51017.getClass(), "size", 1);
        setIntField(term51017, term51017.getClass(), "hash1", 0);
        setIntField(term51017, term51017.getClass(), "hash2", 0);
        setIntField(term51017, term51017.getClass(), "hash3", 0);
        setField(term51017, term51017.getClass(), "key1", term51018);
        setField(term51017, term51017.getClass(), "key2", null);
        setField(term51017, term51017.getClass(), "key3", null);
        setField(term51017, term51017.getClass(), "value1", null);
        setField(term51017, term51017.getClass(), "value2", null);
        setField(term51017, term51017.getClass(), "value3", null);
        setField(term51017, term51017.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50929;
        Object retValue = callMethod(klass, "equals", argTypes, term50837, args);
        assertTrue(recursiveEquals(term50837, term51016));
        assertTrue(recursiveEquals(term50929, term51017));
        assertTrue(recursiveEquals(retValue, false));
    }

};
