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

public class Flat3Map_remove_8406902791080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214112;
     Object term214296;
     Object term214899;
     Object term214901;

    public Flat3Map_remove_8406902791080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214112 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214204 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term214112, term214112.getClass(), "delegateMap", null);
        setIntField(term214112, term214112.getClass(), "size", 3);
        setIntField(term214112, term214112.getClass(), "hash3", 0);
        setField(term214112, term214112.getClass(), "key3", null);
        setIntField(term214112, term214112.getClass(), "hash2", 0);
        setField(term214112, term214112.getClass(), "key2", null);
        setIntField(term214112, term214112.getClass(), "hash1", 0);
        setField(term214204, term214204.getClass(), "delegateMap", null);
        setIntField(term214204, term214204.getClass(), "size", 3);
        setField(term214204, term214204.getClass(), "key3", null);
        setField(term214204, term214204.getClass(), "value3", term214204);
        setField(term214112, term214112.getClass(), "key1", term214204);
        term214296 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214406 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term214296, term214296.getClass(), "delegateMap", null);
        setIntField(term214296, term214296.getClass(), "size", 3);
        setIntField(term214296, term214296.getClass(), "hash3", 0);
        setIntField(term214406, term214406.getClass(), "size", 0);
        setField(term214296, term214296.getClass(), "value3", term214406);
        setIntField(term214296, term214296.getClass(), "hash2", 0);
        setField(term214296, term214296.getClass(), "value2", null);
        setIntField(term214296, term214296.getClass(), "hash1", 0);
        setField(term214296, term214296.getClass(), "value1", null);
        setField(term214296, term214296.getClass(), "key3", null);
        term214899 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term214899, term214899.getClass(), "size", 3);
        setIntField(term214899, term214899.getClass(), "hash1", 0);
        setIntField(term214899, term214899.getClass(), "hash2", 0);
        setIntField(term214899, term214899.getClass(), "hash3", 0);
        setIntField(term214900, term214900.getClass(), "size", 3);
        setIntField(term214900, term214900.getClass(), "hash1", 0);
        setIntField(term214900, term214900.getClass(), "hash2", 0);
        setIntField(term214900, term214900.getClass(), "hash3", 0);
        setField(term214900, term214900.getClass(), "key1", null);
        setField(term214900, term214900.getClass(), "key2", null);
        setField(term214900, term214900.getClass(), "key3", null);
        setField(term214900, term214900.getClass(), "value1", null);
        setField(term214900, term214900.getClass(), "value2", null);
        setField(term214900, term214900.getClass(), "value3", term214900);
        setField(term214900, term214900.getClass(), "delegateMap", null);
        setField(term214899, term214899.getClass(), "key1", term214900);
        setField(term214899, term214899.getClass(), "key2", null);
        setField(term214899, term214899.getClass(), "key3", null);
        setField(term214899, term214899.getClass(), "value1", null);
        setField(term214899, term214899.getClass(), "value2", null);
        setField(term214899, term214899.getClass(), "value3", null);
        setField(term214899, term214899.getClass(), "delegateMap", null);
        term214901 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term214902 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term214901, term214901.getClass(), "size", 3);
        setIntField(term214901, term214901.getClass(), "hash1", 0);
        setIntField(term214901, term214901.getClass(), "hash2", 0);
        setIntField(term214901, term214901.getClass(), "hash3", 0);
        setField(term214901, term214901.getClass(), "key1", null);
        setField(term214901, term214901.getClass(), "key2", null);
        setField(term214901, term214901.getClass(), "key3", null);
        setField(term214901, term214901.getClass(), "value1", null);
        setField(term214901, term214901.getClass(), "value2", null);
        setFloatField(term214902, term214902.getClass(), "loadFactor", 0.0F);
        setIntField(term214902, term214902.getClass(), "size", 0);
        setField(term214902, term214902.getClass(), "data", null);
        setIntField(term214902, term214902.getClass(), "threshold", 0);
        setIntField(term214902, term214902.getClass(), "modCount", 0);
        setField(term214902, term214902.getClass(), "entrySet", null);
        setField(term214902, term214902.getClass(), "keySet", null);
        setField(term214902, term214902.getClass(), "values", null);
        setField(term214902, term214902.getClass(), "keySet", null);
        setField(term214902, term214902.getClass(), "values", null);
        setField(term214901, term214901.getClass(), "value3", term214902);
        setField(term214901, term214901.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term214296;
        Object retValue = callMethod(klass, "remove", argTypes, term214112, args);
        assertTrue(recursiveEquals(term214112, term214899));
        assertTrue(recursiveEquals(term214296, term214901));
        assertTrue(recursiveEquals(retValue, null));
    }

};
