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

public class Flat3Map_get_229621781351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63596;
     Object term63688;
     Object term63880;
     Object term63881;

    public Flat3Map_get_229621781351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63596 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term63596, term63596.getClass(), "delegateMap", null);
        setIntField(term63596, term63596.getClass(), "size", 2);
        setIntField(term63596, term63596.getClass(), "hash2", 0);
        setField(term63596, term63596.getClass(), "key2", term63596);
        term63688 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term63798 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term63688, term63688.getClass(), "delegateMap", null);
        setIntField(term63688, term63688.getClass(), "size", 2);
        setIntField(term63688, term63688.getClass(), "hash2", 0);
        setIntField(term63798, term63798.getClass(), "size", 0);
        setField(term63688, term63688.getClass(), "value2", term63798);
        setIntField(term63688, term63688.getClass(), "hash1", 0);
        setField(term63688, term63688.getClass(), "value1", null);
        term63880 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term63880, term63880.getClass(), "size", 2);
        setIntField(term63880, term63880.getClass(), "hash1", 0);
        setIntField(term63880, term63880.getClass(), "hash2", 0);
        setIntField(term63880, term63880.getClass(), "hash3", 0);
        setField(term63880, term63880.getClass(), "key1", null);
        setField(term63880, term63880.getClass(), "key2", term63880);
        setField(term63880, term63880.getClass(), "key3", null);
        setField(term63880, term63880.getClass(), "value1", null);
        setField(term63880, term63880.getClass(), "value2", null);
        setField(term63880, term63880.getClass(), "value3", null);
        setField(term63880, term63880.getClass(), "delegateMap", null);
        term63881 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term63882 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term63881, term63881.getClass(), "size", 2);
        setIntField(term63881, term63881.getClass(), "hash1", 0);
        setIntField(term63881, term63881.getClass(), "hash2", 0);
        setIntField(term63881, term63881.getClass(), "hash3", 0);
        setField(term63881, term63881.getClass(), "key1", null);
        setField(term63881, term63881.getClass(), "key2", null);
        setField(term63881, term63881.getClass(), "key3", null);
        setField(term63881, term63881.getClass(), "value1", null);
        setFloatField(term63882, term63882.getClass(), "loadFactor", 0.0F);
        setIntField(term63882, term63882.getClass(), "size", 0);
        setField(term63882, term63882.getClass(), "data", null);
        setIntField(term63882, term63882.getClass(), "threshold", 0);
        setIntField(term63882, term63882.getClass(), "modCount", 0);
        setField(term63882, term63882.getClass(), "entrySet", null);
        setField(term63882, term63882.getClass(), "keySet", null);
        setField(term63882, term63882.getClass(), "values", null);
        setField(term63882, term63882.getClass(), "keySet", null);
        setField(term63882, term63882.getClass(), "values", null);
        setField(term63881, term63881.getClass(), "value2", term63882);
        setField(term63881, term63881.getClass(), "value3", null);
        setField(term63881, term63881.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63688;
        Object retValue = callMethod(klass, "get", argTypes, term63596, args);
        assertTrue(recursiveEquals(term63596, term63880));
        assertTrue(recursiveEquals(term63688, term63881));
        assertTrue(recursiveEquals(retValue, null));
    }

};
