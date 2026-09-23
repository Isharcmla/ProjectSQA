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

public class Flat3Map_put_1944740725471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86567;
     Object term86674;
     Object term86676;

    public Flat3Map_put_1944740725471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86567 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86622 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term86567, term86567.getClass(), "delegateMap", null);
        setIntField(term86567, term86567.getClass(), "size", 1);
        setIntField(term86567, term86567.getClass(), "hash1", -1);
        setIntField(term86622, term86622.getClass(), "size", 0);
        setField(term86567, term86567.getClass(), "value1", term86622);
        term86674 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86675 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term86674, term86674.getClass(), "size", 2);
        setIntField(term86674, term86674.getClass(), "hash1", -1);
        setIntField(term86674, term86674.getClass(), "hash2", -1);
        setIntField(term86674, term86674.getClass(), "hash3", 0);
        setField(term86674, term86674.getClass(), "key1", null);
        setField(term86674, term86674.getClass(), "key2", term86674);
        setField(term86674, term86674.getClass(), "key3", null);
        setFloatField(term86675, term86675.getClass(), "loadFactor", 0.0F);
        setIntField(term86675, term86675.getClass(), "size", 0);
        setField(term86675, term86675.getClass(), "data", null);
        setIntField(term86675, term86675.getClass(), "threshold", 0);
        setIntField(term86675, term86675.getClass(), "modCount", 0);
        setField(term86675, term86675.getClass(), "entrySet", null);
        setField(term86675, term86675.getClass(), "keySet", null);
        setField(term86675, term86675.getClass(), "values", null);
        setField(term86675, term86675.getClass(), "keySet", null);
        setField(term86675, term86675.getClass(), "values", null);
        setField(term86674, term86674.getClass(), "value1", term86675);
        setField(term86674, term86674.getClass(), "value2", null);
        setField(term86674, term86674.getClass(), "value3", null);
        setField(term86674, term86674.getClass(), "delegateMap", null);
        term86676 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term86677 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term86676, term86676.getClass(), "size", 2);
        setIntField(term86676, term86676.getClass(), "hash1", -1);
        setIntField(term86676, term86676.getClass(), "hash2", -1);
        setIntField(term86676, term86676.getClass(), "hash3", 0);
        setField(term86676, term86676.getClass(), "key1", null);
        setField(term86676, term86676.getClass(), "key2", term86676);
        setField(term86676, term86676.getClass(), "key3", null);
        setFloatField(term86677, term86677.getClass(), "loadFactor", 0.0F);
        setIntField(term86677, term86677.getClass(), "size", 0);
        setField(term86677, term86677.getClass(), "data", null);
        setIntField(term86677, term86677.getClass(), "threshold", 0);
        setIntField(term86677, term86677.getClass(), "modCount", 0);
        setField(term86677, term86677.getClass(), "entrySet", null);
        setField(term86677, term86677.getClass(), "keySet", null);
        setField(term86677, term86677.getClass(), "values", null);
        setField(term86677, term86677.getClass(), "keySet", null);
        setField(term86677, term86677.getClass(), "values", null);
        setField(term86676, term86676.getClass(), "value1", term86677);
        setField(term86676, term86676.getClass(), "value2", null);
        setField(term86676, term86676.getClass(), "value3", null);
        setField(term86676, term86676.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term86567;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term86567, args);
        assertTrue(recursiveEquals(term86567, term86674));
        assertTrue(recursiveEquals(term86567, term86676));
        assertTrue(recursiveEquals(retValue, null));
    }

};


