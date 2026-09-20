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

public class Flat3Map_equals_1826922527711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140883;
     Object term141079;
     Object term141998;
     Object term142000;

    public Flat3Map_equals_1826922527711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140883 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term140987 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$ArrayAccessor$1"));
        setField(term140883, term140883.getClass(), "delegateMap", null);
        setIntField(term140883, term140883.getClass(), "size", 3);
        setField(term140883, term140883.getClass(), "key3", null);
        setField(term140883, term140883.getClass(), "value3", null);
        setField(term140883, term140883.getClass(), "key2", term140987);
        term141079 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term141079, term141079.getClass(), "delegateMap", null);
        setIntField(term141079, term141079.getClass(), "size", 3);
        setField(term141079, term141079.getClass(), "key3", null);
        setField(term141079, term141079.getClass(), "value3", null);
        setIntField(term141079, term141079.getClass(), "hash3", -1);
        setIntField(term141079, term141079.getClass(), "hash2", -1);
        setIntField(term141079, term141079.getClass(), "hash1", 0);
        term141998 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141999 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$ArrayAccessor$1"));
        setIntField(term141998, term141998.getClass(), "size", 3);
        setIntField(term141998, term141998.getClass(), "hash1", 0);
        setIntField(term141998, term141998.getClass(), "hash2", 0);
        setIntField(term141998, term141998.getClass(), "hash3", 0);
        setField(term141998, term141998.getClass(), "key1", null);
        setIntField(term141999, term141999.getClass(), "hashCodeForCache", 0);
        setField(term141999, term141999.getClass(), "identity", null);
        setField(term141999, term141999.getClass(), "version", null);
        setField(term141998, term141998.getClass(), "key2", term141999);
        setField(term141998, term141998.getClass(), "key3", null);
        setField(term141998, term141998.getClass(), "value1", null);
        setField(term141998, term141998.getClass(), "value2", null);
        setField(term141998, term141998.getClass(), "value3", null);
        setField(term141998, term141998.getClass(), "delegateMap", null);
        term142000 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term142000, term142000.getClass(), "size", 3);
        setIntField(term142000, term142000.getClass(), "hash1", 0);
        setIntField(term142000, term142000.getClass(), "hash2", -1);
        setIntField(term142000, term142000.getClass(), "hash3", -1);
        setField(term142000, term142000.getClass(), "key1", null);
        setField(term142000, term142000.getClass(), "key2", null);
        setField(term142000, term142000.getClass(), "key3", null);
        setField(term142000, term142000.getClass(), "value1", null);
        setField(term142000, term142000.getClass(), "value2", null);
        setField(term142000, term142000.getClass(), "value3", null);
        setField(term142000, term142000.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term141079;
        Object retValue = callMethod(klass, "equals", argTypes, term140883, args);
        assertTrue(recursiveEquals(term140883, term141998));
        assertTrue(recursiveEquals(term141079, term142000));
        assertTrue(recursiveEquals(retValue, false));
    }

};
