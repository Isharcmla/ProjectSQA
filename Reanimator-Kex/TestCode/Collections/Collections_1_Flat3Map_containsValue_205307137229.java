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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_containsValue_205307137229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term108;

    public Flat3Map_containsValue_205307137229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97 = newInstance(Class.forName("java.lang.Object"));
        Object term98 = newInstance(Class.forName("java.lang.Object"));
        Object term99 = newInstance(Class.forName("java.lang.Object"));
        Object term100 = newInstance(Class.forName("java.lang.Object"));
        Object term101 = newInstance(Class.forName("java.lang.Object"));
        Object term102 = newInstance(Class.forName("java.lang.Object"));
        Object term103 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term92, term92.getClass(), "size", -461771056);
        setIntField(term92, term92.getClass(), "hash1", -243422082);
        setIntField(term92, term92.getClass(), "hash2", 1384592638);
        setIntField(term92, term92.getClass(), "hash3", -1002370457);
        setField(term92, term92.getClass(), "key1", term97);
        setField(term92, term92.getClass(), "key2", term98);
        setField(term92, term92.getClass(), "key3", term99);
        setField(term92, term92.getClass(), "value1", term100);
        setField(term92, term92.getClass(), "value2", term101);
        setField(term92, term92.getClass(), "value3", term102);
        setFloatField(term103, term103.getClass(), "loadFactor", 0.0F);
        setIntField(term103, term103.getClass(), "size", 0);
        setField(term103, term103.getClass(), "data", null);
        setIntField(term103, term103.getClass(), "threshold", 0);
        setIntField(term103, term103.getClass(), "modCount", 0);
        setField(term103, term103.getClass(), "entrySet", null);
        setField(term103, term103.getClass(), "keySet", null);
        setField(term103, term103.getClass(), "values", null);
        setField(term103, term103.getClass(), "keySet", null);
        setField(term103, term103.getClass(), "values", null);
        setField(term92, term92.getClass(), "delegateMap", term103);
        term108 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term108;
        try {
            callMethod(klass, "containsValue", argTypes, term92, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
