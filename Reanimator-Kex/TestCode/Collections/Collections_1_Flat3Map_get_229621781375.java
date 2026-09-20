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
import java.util.HashMap;

public class Flat3Map_get_229621781375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68097;
     Object term68313;
     Object term68389;
     Object term68393;

    public Flat3Map_get_229621781375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term68221 = new HashMap();
        term68097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68135 = newInstance(Class.forName("java.lang.Object"));
        Object term68173 = newInstance(Class.forName("java.lang.Object"));
        setField(term68097, term68097.getClass(), "delegateMap", null);
        setIntField(term68097, term68097.getClass(), "size", 3);
        setIntField(term68097, term68097.getClass(), "hash3", 0);
        setField(term68097, term68097.getClass(), "key3", term68135);
        setIntField(term68097, term68097.getClass(), "hash2", 0);
        setField(term68097, term68097.getClass(), "key2", term68173);
        setIntField(term68097, term68097.getClass(), "hash1", 0);
        setField(term68097, term68097.getClass(), "key1", term68221);
        term68313 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term68313, term68313.getClass(), "delegateMap", null);
        setIntField(term68313, term68313.getClass(), "size", 3);
        setIntField(term68313, term68313.getClass(), "hash3", 0);
        setField(term68313, term68313.getClass(), "value3", null);
        setIntField(term68313, term68313.getClass(), "hash2", 0);
        setField(term68313, term68313.getClass(), "value2", null);
        setIntField(term68313, term68313.getClass(), "hash1", 0);
        setField(term68313, term68313.getClass(), "value1", null);
        HashMap term68390 = new HashMap();
        term68389 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term68391 = newInstance(Class.forName("java.lang.Object"));
        Object term68392 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term68389, term68389.getClass(), "size", 3);
        setIntField(term68389, term68389.getClass(), "hash1", 0);
        setIntField(term68389, term68389.getClass(), "hash2", 0);
        setIntField(term68389, term68389.getClass(), "hash3", 0);
        setField(term68389, term68389.getClass(), "key1", term68390);
        setField(term68389, term68389.getClass(), "key2", term68391);
        setField(term68389, term68389.getClass(), "key3", term68392);
        setField(term68389, term68389.getClass(), "value1", null);
        setField(term68389, term68389.getClass(), "value2", null);
        setField(term68389, term68389.getClass(), "value3", null);
        setField(term68389, term68389.getClass(), "delegateMap", null);
        term68393 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term68393, term68393.getClass(), "size", 3);
        setIntField(term68393, term68393.getClass(), "hash1", 0);
        setIntField(term68393, term68393.getClass(), "hash2", 0);
        setIntField(term68393, term68393.getClass(), "hash3", 0);
        setField(term68393, term68393.getClass(), "key1", null);
        setField(term68393, term68393.getClass(), "key2", null);
        setField(term68393, term68393.getClass(), "key3", null);
        setField(term68393, term68393.getClass(), "value1", null);
        setField(term68393, term68393.getClass(), "value2", null);
        setField(term68393, term68393.getClass(), "value3", null);
        setField(term68393, term68393.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68313;
        Object retValue = callMethod(klass, "get", argTypes, term68097, args);
        assertTrue(recursiveEquals(term68097, term68389));
        assertTrue(recursiveEquals(term68313, term68393));
        assertTrue(recursiveEquals(retValue, null));
    }

};
