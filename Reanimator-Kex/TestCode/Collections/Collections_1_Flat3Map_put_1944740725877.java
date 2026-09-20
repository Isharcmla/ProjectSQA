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

public class Flat3Map_put_1944740725877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177033;
     Object term177140;
     Object term177142;

    public Flat3Map_put_1944740725877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177033 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177088 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term177033, term177033.getClass(), "delegateMap", null);
        setIntField(term177033, term177033.getClass(), "size", 1);
        setIntField(term177033, term177033.getClass(), "hash1", 0);
        setIntField(term177088, term177088.getClass(), "size", 0);
        setField(term177033, term177033.getClass(), "value1", term177088);
        term177140 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177141 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term177140, term177140.getClass(), "size", 2);
        setIntField(term177140, term177140.getClass(), "hash1", 0);
        setIntField(term177140, term177140.getClass(), "hash2", 0);
        setIntField(term177140, term177140.getClass(), "hash3", 0);
        setField(term177140, term177140.getClass(), "key1", null);
        setField(term177140, term177140.getClass(), "key2", term177140);
        setField(term177140, term177140.getClass(), "key3", null);
        setFloatField(term177141, term177141.getClass(), "loadFactor", 0.0F);
        setIntField(term177141, term177141.getClass(), "size", 0);
        setField(term177141, term177141.getClass(), "data", null);
        setIntField(term177141, term177141.getClass(), "threshold", 0);
        setIntField(term177141, term177141.getClass(), "modCount", 0);
        setField(term177141, term177141.getClass(), "entrySet", null);
        setField(term177141, term177141.getClass(), "keySet", null);
        setField(term177141, term177141.getClass(), "values", null);
        setField(term177141, term177141.getClass(), "keySet", null);
        setField(term177141, term177141.getClass(), "values", null);
        setField(term177140, term177140.getClass(), "value1", term177141);
        setField(term177140, term177140.getClass(), "value2", null);
        setField(term177140, term177140.getClass(), "value3", null);
        setField(term177140, term177140.getClass(), "delegateMap", null);
        term177142 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term177143 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term177142, term177142.getClass(), "size", 2);
        setIntField(term177142, term177142.getClass(), "hash1", 0);
        setIntField(term177142, term177142.getClass(), "hash2", 0);
        setIntField(term177142, term177142.getClass(), "hash3", 0);
        setField(term177142, term177142.getClass(), "key1", null);
        setField(term177142, term177142.getClass(), "key2", term177142);
        setField(term177142, term177142.getClass(), "key3", null);
        setFloatField(term177143, term177143.getClass(), "loadFactor", 0.0F);
        setIntField(term177143, term177143.getClass(), "size", 0);
        setField(term177143, term177143.getClass(), "data", null);
        setIntField(term177143, term177143.getClass(), "threshold", 0);
        setIntField(term177143, term177143.getClass(), "modCount", 0);
        setField(term177143, term177143.getClass(), "entrySet", null);
        setField(term177143, term177143.getClass(), "keySet", null);
        setField(term177143, term177143.getClass(), "values", null);
        setField(term177143, term177143.getClass(), "keySet", null);
        setField(term177143, term177143.getClass(), "values", null);
        setField(term177142, term177142.getClass(), "value1", term177143);
        setField(term177142, term177142.getClass(), "value2", null);
        setField(term177142, term177142.getClass(), "value3", null);
        setField(term177142, term177142.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term177033;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term177033, args);
        assertTrue(recursiveEquals(term177033, term177140));
        assertTrue(recursiveEquals(term177033, term177142));
        assertTrue(recursiveEquals(retValue, null));
    }

};
