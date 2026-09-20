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

public class Flat3Map_containsValue_2053071372359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64962;
     Object term65164;
     Object term65857;
     Object term65859;

    public Flat3Map_containsValue_2053071372359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64962 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65072 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term64962, term64962.getClass(), "delegateMap", null);
        setIntField(term64962, term64962.getClass(), "size", 3);
        setField(term64962, term64962.getClass(), "value3", null);
        setField(term64962, term64962.getClass(), "value2", null);
        setIntField(term65072, term65072.getClass(), "size", 0);
        setField(term64962, term64962.getClass(), "value1", term65072);
        term65164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term65164, term65164.getClass(), "delegateMap", null);
        setIntField(term65164, term65164.getClass(), "size", -1);
        term65857 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65858 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term65857, term65857.getClass(), "size", 3);
        setIntField(term65857, term65857.getClass(), "hash1", 0);
        setIntField(term65857, term65857.getClass(), "hash2", 0);
        setIntField(term65857, term65857.getClass(), "hash3", 0);
        setField(term65857, term65857.getClass(), "key1", null);
        setField(term65857, term65857.getClass(), "key2", null);
        setField(term65857, term65857.getClass(), "key3", null);
        setFloatField(term65858, term65858.getClass(), "loadFactor", 0.0F);
        setIntField(term65858, term65858.getClass(), "size", 0);
        setField(term65858, term65858.getClass(), "data", null);
        setIntField(term65858, term65858.getClass(), "threshold", 0);
        setIntField(term65858, term65858.getClass(), "modCount", 0);
        setField(term65858, term65858.getClass(), "entrySet", null);
        setField(term65858, term65858.getClass(), "keySet", null);
        setField(term65858, term65858.getClass(), "values", null);
        setField(term65858, term65858.getClass(), "keySet", null);
        setField(term65858, term65858.getClass(), "values", null);
        setField(term65857, term65857.getClass(), "value1", term65858);
        setField(term65857, term65857.getClass(), "value2", null);
        setField(term65857, term65857.getClass(), "value3", null);
        setField(term65857, term65857.getClass(), "delegateMap", null);
        term65859 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term65859, term65859.getClass(), "size", -1);
        setIntField(term65859, term65859.getClass(), "hash1", 0);
        setIntField(term65859, term65859.getClass(), "hash2", 0);
        setIntField(term65859, term65859.getClass(), "hash3", 0);
        setField(term65859, term65859.getClass(), "key1", null);
        setField(term65859, term65859.getClass(), "key2", null);
        setField(term65859, term65859.getClass(), "key3", null);
        setField(term65859, term65859.getClass(), "value1", null);
        setField(term65859, term65859.getClass(), "value2", null);
        setField(term65859, term65859.getClass(), "value3", null);
        setField(term65859, term65859.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65164;
        callMethod(klass, "containsValue", argTypes, term64962, args);
        assertTrue(recursiveEquals(term64962, term65857));
        assertTrue(recursiveEquals(term65164, term65859));
    }

};
