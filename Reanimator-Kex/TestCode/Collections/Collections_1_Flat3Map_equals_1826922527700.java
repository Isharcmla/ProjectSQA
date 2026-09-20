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

public class Flat3Map_equals_1826922527700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138200;
     Object term138402;
     Object term139103;
     Object term139105;

    public Flat3Map_equals_1826922527700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138200 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138310 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term138200, term138200.getClass(), "delegateMap", null);
        setIntField(term138200, term138200.getClass(), "size", 1);
        setField(term138200, term138200.getClass(), "key1", null);
        setField(term138200, term138200.getClass(), "value1", term138310);
        term138402 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term138440 = newInstance(Class.forName("java.lang.Object"));
        setField(term138402, term138402.getClass(), "delegateMap", null);
        setIntField(term138402, term138402.getClass(), "size", 1);
        setField(term138402, term138402.getClass(), "key1", null);
        setField(term138402, term138402.getClass(), "value1", term138440);
        term139103 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139104 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term139103, term139103.getClass(), "size", 1);
        setIntField(term139103, term139103.getClass(), "hash1", 0);
        setIntField(term139103, term139103.getClass(), "hash2", 0);
        setIntField(term139103, term139103.getClass(), "hash3", 0);
        setField(term139103, term139103.getClass(), "key1", null);
        setField(term139103, term139103.getClass(), "key2", null);
        setField(term139103, term139103.getClass(), "key3", null);
        setFloatField(term139104, term139104.getClass(), "loadFactor", 0.0F);
        setIntField(term139104, term139104.getClass(), "size", 0);
        setField(term139104, term139104.getClass(), "data", null);
        setIntField(term139104, term139104.getClass(), "threshold", 0);
        setIntField(term139104, term139104.getClass(), "modCount", 0);
        setField(term139104, term139104.getClass(), "entrySet", null);
        setField(term139104, term139104.getClass(), "keySet", null);
        setField(term139104, term139104.getClass(), "values", null);
        setField(term139104, term139104.getClass(), "keySet", null);
        setField(term139104, term139104.getClass(), "values", null);
        setField(term139103, term139103.getClass(), "value1", term139104);
        setField(term139103, term139103.getClass(), "value2", null);
        setField(term139103, term139103.getClass(), "value3", null);
        setField(term139103, term139103.getClass(), "delegateMap", null);
        term139105 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term139106 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term139105, term139105.getClass(), "size", 1);
        setIntField(term139105, term139105.getClass(), "hash1", 0);
        setIntField(term139105, term139105.getClass(), "hash2", 0);
        setIntField(term139105, term139105.getClass(), "hash3", 0);
        setField(term139105, term139105.getClass(), "key1", null);
        setField(term139105, term139105.getClass(), "key2", null);
        setField(term139105, term139105.getClass(), "key3", null);
        setField(term139105, term139105.getClass(), "value1", term139106);
        setField(term139105, term139105.getClass(), "value2", null);
        setField(term139105, term139105.getClass(), "value3", null);
        setField(term139105, term139105.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term138402;
        Object retValue = callMethod(klass, "equals", argTypes, term138200, args);
        assertTrue(recursiveEquals(term138200, term139103));
        assertTrue(recursiveEquals(term138402, term139105));
        assertTrue(recursiveEquals(retValue, false));
    }

};
