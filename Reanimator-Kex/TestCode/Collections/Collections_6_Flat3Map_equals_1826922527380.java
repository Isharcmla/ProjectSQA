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

public class Flat3Map_equals_1826922527380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65332;
     Object term65530;
     Object term65889;
     Object term65891;

    public Flat3Map_equals_1826922527380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65332 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65438 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$CounterCell"));
        setField(term65332, term65332.getClass(), "delegateMap", null);
        setIntField(term65332, term65332.getClass(), "size", 3);
        setField(term65332, term65332.getClass(), "key3", null);
        setField(term65332, term65332.getClass(), "value3", null);
        setField(term65332, term65332.getClass(), "key2", null);
        setField(term65332, term65332.getClass(), "value2", null);
        setField(term65332, term65332.getClass(), "key1", term65438);
        term65530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term65530, term65530.getClass(), "delegateMap", null);
        setIntField(term65530, term65530.getClass(), "size", 3);
        setField(term65530, term65530.getClass(), "key3", null);
        setField(term65530, term65530.getClass(), "value3", null);
        term65889 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65890 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$CounterCell"));
        setIntField(term65889, term65889.getClass(), "size", 3);
        setIntField(term65889, term65889.getClass(), "hash1", 0);
        setIntField(term65889, term65889.getClass(), "hash2", 0);
        setIntField(term65889, term65889.getClass(), "hash3", 0);
        setLongField(term65890, term65890.getClass(), "value", 0L);
        setField(term65889, term65889.getClass(), "key1", term65890);
        setField(term65889, term65889.getClass(), "key2", null);
        setField(term65889, term65889.getClass(), "key3", null);
        setField(term65889, term65889.getClass(), "value1", null);
        setField(term65889, term65889.getClass(), "value2", null);
        setField(term65889, term65889.getClass(), "value3", null);
        setField(term65889, term65889.getClass(), "delegateMap", null);
        term65891 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term65891, term65891.getClass(), "size", 3);
        setIntField(term65891, term65891.getClass(), "hash1", 0);
        setIntField(term65891, term65891.getClass(), "hash2", 0);
        setIntField(term65891, term65891.getClass(), "hash3", 0);
        setField(term65891, term65891.getClass(), "key1", null);
        setField(term65891, term65891.getClass(), "key2", null);
        setField(term65891, term65891.getClass(), "key3", null);
        setField(term65891, term65891.getClass(), "value1", null);
        setField(term65891, term65891.getClass(), "value2", null);
        setField(term65891, term65891.getClass(), "value3", null);
        setField(term65891, term65891.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65530;
        Object retValue = callMethod(klass, "equals", argTypes, term65332, args);
        assertTrue(recursiveEquals(term65332, term65889));
        assertTrue(recursiveEquals(term65530, term65891));
        assertTrue(recursiveEquals(retValue, false));
    }

};


