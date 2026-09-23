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

public class Flat3Map_put_1944740725398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69068;
     Object term69459;
     Object term69461;

    public Flat3Map_put_1944740725398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69068 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69123 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term69068, term69068.getClass(), "delegateMap", null);
        setIntField(term69068, term69068.getClass(), "size", 3);
        setIntField(term69068, term69068.getClass(), "hash3", 0);
        setField(term69068, term69068.getClass(), "value3", null);
        setIntField(term69068, term69068.getClass(), "hash2", 0);
        setField(term69068, term69068.getClass(), "value2", null);
        setIntField(term69068, term69068.getClass(), "hash1", 0);
        setIntField(term69123, term69123.getClass(), "size", 0);
        setField(term69068, term69068.getClass(), "value1", term69123);
        setField(term69068, term69068.getClass(), "key3", term69068);
        term69459 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69460 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term69459, term69459.getClass(), "size", 3);
        setIntField(term69459, term69459.getClass(), "hash1", 0);
        setIntField(term69459, term69459.getClass(), "hash2", 0);
        setIntField(term69459, term69459.getClass(), "hash3", 0);
        setField(term69459, term69459.getClass(), "key1", null);
        setField(term69459, term69459.getClass(), "key2", null);
        setField(term69459, term69459.getClass(), "key3", term69459);
        setFloatField(term69460, term69460.getClass(), "loadFactor", 0.0F);
        setIntField(term69460, term69460.getClass(), "size", 0);
        setField(term69460, term69460.getClass(), "data", null);
        setIntField(term69460, term69460.getClass(), "threshold", 0);
        setIntField(term69460, term69460.getClass(), "modCount", 0);
        setField(term69460, term69460.getClass(), "entrySet", null);
        setField(term69460, term69460.getClass(), "keySet", null);
        setField(term69460, term69460.getClass(), "values", null);
        setField(term69460, term69460.getClass(), "keySet", null);
        setField(term69460, term69460.getClass(), "values", null);
        setField(term69459, term69459.getClass(), "value1", term69460);
        setField(term69459, term69459.getClass(), "value2", null);
        setField(term69459, term69459.getClass(), "value3", null);
        setField(term69459, term69459.getClass(), "delegateMap", null);
        term69461 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term69462 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term69461, term69461.getClass(), "size", 3);
        setIntField(term69461, term69461.getClass(), "hash1", 0);
        setIntField(term69461, term69461.getClass(), "hash2", 0);
        setIntField(term69461, term69461.getClass(), "hash3", 0);
        setField(term69461, term69461.getClass(), "key1", null);
        setField(term69461, term69461.getClass(), "key2", null);
        setField(term69461, term69461.getClass(), "key3", term69461);
        setFloatField(term69462, term69462.getClass(), "loadFactor", 0.0F);
        setIntField(term69462, term69462.getClass(), "size", 0);
        setField(term69462, term69462.getClass(), "data", null);
        setIntField(term69462, term69462.getClass(), "threshold", 0);
        setIntField(term69462, term69462.getClass(), "modCount", 0);
        setField(term69462, term69462.getClass(), "entrySet", null);
        setField(term69462, term69462.getClass(), "keySet", null);
        setField(term69462, term69462.getClass(), "values", null);
        setField(term69462, term69462.getClass(), "keySet", null);
        setField(term69462, term69462.getClass(), "values", null);
        setField(term69461, term69461.getClass(), "value1", term69462);
        setField(term69461, term69461.getClass(), "value2", null);
        setField(term69461, term69461.getClass(), "value3", null);
        setField(term69461, term69461.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term69068;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term69068, args);
        assertTrue(recursiveEquals(term69068, term69459));
        assertTrue(recursiveEquals(term69068, term69461));
        assertTrue(recursiveEquals(retValue, null));
    }

};


