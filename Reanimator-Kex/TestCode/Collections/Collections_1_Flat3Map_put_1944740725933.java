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

public class Flat3Map_put_1944740725933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187600;
     Object term187707;
     Object term187708;
     Object term187702;

    public Flat3Map_put_1944740725933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187600 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term187655 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term187600, term187600.getClass(), "delegateMap", null);
        setIntField(term187600, term187600.getClass(), "size", 3);
        setIntField(term187600, term187600.getClass(), "hash3", 0);
        setField(term187600, term187600.getClass(), "value3", null);
        setIntField(term187600, term187600.getClass(), "hash2", 0);
        setIntField(term187655, term187655.getClass(), "size", 0);
        setField(term187600, term187600.getClass(), "value2", term187655);
        setIntField(term187600, term187600.getClass(), "hash1", 0);
        setField(term187600, term187600.getClass(), "value1", null);
        setField(term187600, term187600.getClass(), "key3", null);
        setField(term187600, term187600.getClass(), "key2", term187600);
        term187707 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term187707, term187707.getClass(), "size", 3);
        setIntField(term187707, term187707.getClass(), "hash1", 0);
        setIntField(term187707, term187707.getClass(), "hash2", 0);
        setIntField(term187707, term187707.getClass(), "hash3", 0);
        setField(term187707, term187707.getClass(), "key1", null);
        setField(term187707, term187707.getClass(), "key2", term187707);
        setField(term187707, term187707.getClass(), "key3", null);
        setField(term187707, term187707.getClass(), "value1", null);
        setField(term187707, term187707.getClass(), "value2", null);
        setField(term187707, term187707.getClass(), "value3", null);
        setField(term187707, term187707.getClass(), "delegateMap", null);
        term187708 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term187708, term187708.getClass(), "size", 3);
        setIntField(term187708, term187708.getClass(), "hash1", 0);
        setIntField(term187708, term187708.getClass(), "hash2", 0);
        setIntField(term187708, term187708.getClass(), "hash3", 0);
        setField(term187708, term187708.getClass(), "key1", null);
        setField(term187708, term187708.getClass(), "key2", term187708);
        setField(term187708, term187708.getClass(), "key3", null);
        setField(term187708, term187708.getClass(), "value1", null);
        setField(term187708, term187708.getClass(), "value2", null);
        setField(term187708, term187708.getClass(), "value3", null);
        setField(term187708, term187708.getClass(), "delegateMap", null);
        term187702 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setFloatField(term187702, term187702.getClass(), "loadFactor", 0.0F);
        setIntField(term187702, term187702.getClass(), "size", 0);
        setField(term187702, term187702.getClass(), "data", null);
        setIntField(term187702, term187702.getClass(), "threshold", 0);
        setIntField(term187702, term187702.getClass(), "modCount", 0);
        setField(term187702, term187702.getClass(), "entrySet", null);
        setField(term187702, term187702.getClass(), "keySet", null);
        setField(term187702, term187702.getClass(), "values", null);
        setField(term187702, term187702.getClass(), "keySet", null);
        setField(term187702, term187702.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term187600;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term187600, args);
        assertTrue(recursiveEquals(term187600, term187707));
        assertTrue(recursiveEquals(term187600, term187708));
        assertTrue(recursiveEquals(retValue, term187702));
    }

};
