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

public class Flat3Map_equals_1826922527360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65290;
     Object term65510;
     Object term65900;
     Object term65902;

    public Flat3Map_equals_1826922527360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65290 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65400 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term65290, term65290.getClass(), "delegateMap", term65400);
        term65510 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        term65900 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term65901 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setIntField(term65900, term65900.getClass(), "size", 0);
        setIntField(term65900, term65900.getClass(), "hash1", 0);
        setIntField(term65900, term65900.getClass(), "hash2", 0);
        setIntField(term65900, term65900.getClass(), "hash3", 0);
        setField(term65900, term65900.getClass(), "key1", null);
        setField(term65900, term65900.getClass(), "key2", null);
        setField(term65900, term65900.getClass(), "key3", null);
        setField(term65900, term65900.getClass(), "value1", null);
        setField(term65900, term65900.getClass(), "value2", null);
        setField(term65900, term65900.getClass(), "value3", null);
        setField(term65901, term65901.getClass(), "header", null);
        setFloatField(term65901, term65901.getClass(), "loadFactor", 0.0F);
        setIntField(term65901, term65901.getClass(), "size", 0);
        setField(term65901, term65901.getClass(), "data", null);
        setIntField(term65901, term65901.getClass(), "threshold", 0);
        setIntField(term65901, term65901.getClass(), "modCount", 0);
        setField(term65901, term65901.getClass(), "entrySet", null);
        setField(term65901, term65901.getClass(), "keySet", null);
        setField(term65901, term65901.getClass(), "values", null);
        setField(term65901, term65901.getClass(), "keySet", null);
        setField(term65901, term65901.getClass(), "values", null);
        setField(term65900, term65900.getClass(), "delegateMap", term65901);
        term65902 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term65902, term65902.getClass(), "header", null);
        setFloatField(term65902, term65902.getClass(), "loadFactor", 0.0F);
        setIntField(term65902, term65902.getClass(), "size", 0);
        setField(term65902, term65902.getClass(), "data", null);
        setIntField(term65902, term65902.getClass(), "threshold", 0);
        setIntField(term65902, term65902.getClass(), "modCount", 0);
        setField(term65902, term65902.getClass(), "entrySet", null);
        setField(term65902, term65902.getClass(), "keySet", null);
        setField(term65902, term65902.getClass(), "values", null);
        setField(term65902, term65902.getClass(), "keySet", null);
        setField(term65902, term65902.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term65510;
        Object retValue = callMethod(klass, "equals", argTypes, term65290, args);
        assertTrue(recursiveEquals(term65290, term65900));
        assertTrue(recursiveEquals(term65510, term65902));
        assertTrue(recursiveEquals(retValue, true));
    }

};
