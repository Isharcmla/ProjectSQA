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

public class Flat3Map_get_229621781305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54884;
     Object term54983;
     Object term54985;

    public Flat3Map_get_229621781305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54884 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54939 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term54884, term54884.getClass(), "delegateMap", null);
        setIntField(term54884, term54884.getClass(), "size", 2);
        setIntField(term54884, term54884.getClass(), "hash2", 0);
        setIntField(term54939, term54939.getClass(), "size", 0);
        setField(term54884, term54884.getClass(), "value2", term54939);
        setIntField(term54884, term54884.getClass(), "hash1", 0);
        setField(term54884, term54884.getClass(), "value1", null);
        term54983 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54984 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term54983, term54983.getClass(), "size", 2);
        setIntField(term54983, term54983.getClass(), "hash1", 0);
        setIntField(term54983, term54983.getClass(), "hash2", 0);
        setIntField(term54983, term54983.getClass(), "hash3", 0);
        setField(term54983, term54983.getClass(), "key1", null);
        setField(term54983, term54983.getClass(), "key2", null);
        setField(term54983, term54983.getClass(), "key3", null);
        setField(term54983, term54983.getClass(), "value1", null);
        setFloatField(term54984, term54984.getClass(), "loadFactor", 0.0F);
        setIntField(term54984, term54984.getClass(), "size", 0);
        setField(term54984, term54984.getClass(), "data", null);
        setIntField(term54984, term54984.getClass(), "threshold", 0);
        setIntField(term54984, term54984.getClass(), "modCount", 0);
        setField(term54984, term54984.getClass(), "entrySet", null);
        setField(term54984, term54984.getClass(), "keySet", null);
        setField(term54984, term54984.getClass(), "values", null);
        setField(term54984, term54984.getClass(), "keySet", null);
        setField(term54984, term54984.getClass(), "values", null);
        setField(term54983, term54983.getClass(), "value2", term54984);
        setField(term54983, term54983.getClass(), "value3", null);
        setField(term54983, term54983.getClass(), "delegateMap", null);
        term54985 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54986 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term54985, term54985.getClass(), "size", 2);
        setIntField(term54985, term54985.getClass(), "hash1", 0);
        setIntField(term54985, term54985.getClass(), "hash2", 0);
        setIntField(term54985, term54985.getClass(), "hash3", 0);
        setField(term54985, term54985.getClass(), "key1", null);
        setField(term54985, term54985.getClass(), "key2", null);
        setField(term54985, term54985.getClass(), "key3", null);
        setField(term54985, term54985.getClass(), "value1", null);
        setFloatField(term54986, term54986.getClass(), "loadFactor", 0.0F);
        setIntField(term54986, term54986.getClass(), "size", 0);
        setField(term54986, term54986.getClass(), "data", null);
        setIntField(term54986, term54986.getClass(), "threshold", 0);
        setIntField(term54986, term54986.getClass(), "modCount", 0);
        setField(term54986, term54986.getClass(), "entrySet", null);
        setField(term54986, term54986.getClass(), "keySet", null);
        setField(term54986, term54986.getClass(), "values", null);
        setField(term54986, term54986.getClass(), "keySet", null);
        setField(term54986, term54986.getClass(), "values", null);
        setField(term54985, term54985.getClass(), "value2", term54986);
        setField(term54985, term54985.getClass(), "value3", null);
        setField(term54985, term54985.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54884;
        Object retValue = callMethod(klass, "get", argTypes, term54884, args);
        assertTrue(recursiveEquals(term54884, term54983));
        assertTrue(recursiveEquals(term54884, term54985));
        assertTrue(recursiveEquals(retValue, null));
    }

};
