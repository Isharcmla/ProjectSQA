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

public class Flat3Map_containsValue_2053071372223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38864;
     Object term39066;
     Object term39160;
     Object term39162;

    public Flat3Map_containsValue_2053071372223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term38974 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term38864, term38864.getClass(), "delegateMap", null);
        setIntField(term38864, term38864.getClass(), "size", 3);
        setField(term38864, term38864.getClass(), "value3", null);
        setField(term38864, term38864.getClass(), "value2", null);
        setField(term38864, term38864.getClass(), "value1", term38974);
        term39066 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term39066, term39066.getClass(), "delegateMap", null);
        term39160 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term39161 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term39160, term39160.getClass(), "size", 3);
        setIntField(term39160, term39160.getClass(), "hash1", 0);
        setIntField(term39160, term39160.getClass(), "hash2", 0);
        setIntField(term39160, term39160.getClass(), "hash3", 0);
        setField(term39160, term39160.getClass(), "key1", null);
        setField(term39160, term39160.getClass(), "key2", null);
        setField(term39160, term39160.getClass(), "key3", null);
        setFloatField(term39161, term39161.getClass(), "loadFactor", 0.0F);
        setIntField(term39161, term39161.getClass(), "size", 0);
        setField(term39161, term39161.getClass(), "data", null);
        setIntField(term39161, term39161.getClass(), "threshold", 0);
        setIntField(term39161, term39161.getClass(), "modCount", 0);
        setField(term39161, term39161.getClass(), "entrySet", null);
        setField(term39161, term39161.getClass(), "keySet", null);
        setField(term39161, term39161.getClass(), "values", null);
        setField(term39161, term39161.getClass(), "keySet", null);
        setField(term39161, term39161.getClass(), "values", null);
        setField(term39160, term39160.getClass(), "value1", term39161);
        setField(term39160, term39160.getClass(), "value2", null);
        setField(term39160, term39160.getClass(), "value3", null);
        setField(term39160, term39160.getClass(), "delegateMap", null);
        term39162 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term39162, term39162.getClass(), "size", 0);
        setIntField(term39162, term39162.getClass(), "hash1", 0);
        setIntField(term39162, term39162.getClass(), "hash2", 0);
        setIntField(term39162, term39162.getClass(), "hash3", 0);
        setField(term39162, term39162.getClass(), "key1", null);
        setField(term39162, term39162.getClass(), "key2", null);
        setField(term39162, term39162.getClass(), "key3", null);
        setField(term39162, term39162.getClass(), "value1", null);
        setField(term39162, term39162.getClass(), "value2", null);
        setField(term39162, term39162.getClass(), "value3", null);
        setField(term39162, term39162.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39066;
        callMethod(klass, "containsValue", argTypes, term38864, args);
        assertTrue(recursiveEquals(term38864, term39160));
        assertTrue(recursiveEquals(term39066, term39162));
    }

};
