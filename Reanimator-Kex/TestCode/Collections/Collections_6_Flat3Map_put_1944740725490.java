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

public class Flat3Map_put_1944740725490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91423;
     Object term91791;
     Object term91793;

    public Flat3Map_put_1944740725490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91423 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91478 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term91423, term91423.getClass(), "delegateMap", null);
        setIntField(term91423, term91423.getClass(), "size", 3);
        setIntField(term91423, term91423.getClass(), "hash3", 0);
        setField(term91423, term91423.getClass(), "value3", null);
        setIntField(term91423, term91423.getClass(), "hash2", 0);
        setIntField(term91478, term91478.getClass(), "size", 0);
        setField(term91423, term91423.getClass(), "value2", term91478);
        setIntField(term91423, term91423.getClass(), "hash1", 0);
        setField(term91423, term91423.getClass(), "value1", null);
        setField(term91423, term91423.getClass(), "key3", term91423);
        term91791 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91792 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term91791, term91791.getClass(), "size", 3);
        setIntField(term91791, term91791.getClass(), "hash1", 0);
        setIntField(term91791, term91791.getClass(), "hash2", 0);
        setIntField(term91791, term91791.getClass(), "hash3", 0);
        setField(term91791, term91791.getClass(), "key1", null);
        setField(term91791, term91791.getClass(), "key2", null);
        setField(term91791, term91791.getClass(), "key3", term91791);
        setField(term91791, term91791.getClass(), "value1", null);
        setFloatField(term91792, term91792.getClass(), "loadFactor", 0.0F);
        setIntField(term91792, term91792.getClass(), "size", 0);
        setField(term91792, term91792.getClass(), "data", null);
        setIntField(term91792, term91792.getClass(), "threshold", 0);
        setIntField(term91792, term91792.getClass(), "modCount", 0);
        setField(term91792, term91792.getClass(), "entrySet", null);
        setField(term91792, term91792.getClass(), "keySet", null);
        setField(term91792, term91792.getClass(), "values", null);
        setField(term91792, term91792.getClass(), "keySet", null);
        setField(term91792, term91792.getClass(), "values", null);
        setField(term91791, term91791.getClass(), "value2", term91792);
        setField(term91791, term91791.getClass(), "value3", null);
        setField(term91791, term91791.getClass(), "delegateMap", null);
        term91793 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91794 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term91793, term91793.getClass(), "size", 3);
        setIntField(term91793, term91793.getClass(), "hash1", 0);
        setIntField(term91793, term91793.getClass(), "hash2", 0);
        setIntField(term91793, term91793.getClass(), "hash3", 0);
        setField(term91793, term91793.getClass(), "key1", null);
        setField(term91793, term91793.getClass(), "key2", null);
        setField(term91793, term91793.getClass(), "key3", term91793);
        setField(term91793, term91793.getClass(), "value1", null);
        setFloatField(term91794, term91794.getClass(), "loadFactor", 0.0F);
        setIntField(term91794, term91794.getClass(), "size", 0);
        setField(term91794, term91794.getClass(), "data", null);
        setIntField(term91794, term91794.getClass(), "threshold", 0);
        setIntField(term91794, term91794.getClass(), "modCount", 0);
        setField(term91794, term91794.getClass(), "entrySet", null);
        setField(term91794, term91794.getClass(), "keySet", null);
        setField(term91794, term91794.getClass(), "values", null);
        setField(term91794, term91794.getClass(), "keySet", null);
        setField(term91794, term91794.getClass(), "values", null);
        setField(term91793, term91793.getClass(), "value2", term91794);
        setField(term91793, term91793.getClass(), "value3", null);
        setField(term91793, term91793.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term91423;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term91423, args);
        assertTrue(recursiveEquals(term91423, term91791));
        assertTrue(recursiveEquals(term91423, term91793));
        assertTrue(recursiveEquals(retValue, null));
    }

};


