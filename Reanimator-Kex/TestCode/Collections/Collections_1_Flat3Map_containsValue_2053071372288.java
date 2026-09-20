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

public class Flat3Map_containsValue_2053071372288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51136;
     Object term51284;
     Object term51684;
     Object term51686;

    public Flat3Map_containsValue_2053071372288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51136 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term51246 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term51136, term51136.getClass(), "delegateMap", null);
        setIntField(term51136, term51136.getClass(), "size", 3);
        setField(term51136, term51136.getClass(), "value3", term51246);
        term51284 = newInstance(Class.forName("java.lang.Object"));
        term51684 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term51685 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setIntField(term51684, term51684.getClass(), "size", 3);
        setIntField(term51684, term51684.getClass(), "hash1", 0);
        setIntField(term51684, term51684.getClass(), "hash2", 0);
        setIntField(term51684, term51684.getClass(), "hash3", 0);
        setField(term51684, term51684.getClass(), "key1", null);
        setField(term51684, term51684.getClass(), "key2", null);
        setField(term51684, term51684.getClass(), "key3", null);
        setField(term51684, term51684.getClass(), "value1", null);
        setField(term51684, term51684.getClass(), "value2", null);
        setField(term51685, term51685.getClass(), "header", null);
        setFloatField(term51685, term51685.getClass(), "loadFactor", 0.0F);
        setIntField(term51685, term51685.getClass(), "size", 0);
        setField(term51685, term51685.getClass(), "data", null);
        setIntField(term51685, term51685.getClass(), "threshold", 0);
        setIntField(term51685, term51685.getClass(), "modCount", 0);
        setField(term51685, term51685.getClass(), "entrySet", null);
        setField(term51685, term51685.getClass(), "keySet", null);
        setField(term51685, term51685.getClass(), "values", null);
        setField(term51685, term51685.getClass(), "keySet", null);
        setField(term51685, term51685.getClass(), "values", null);
        setField(term51684, term51684.getClass(), "value3", term51685);
        setField(term51684, term51684.getClass(), "delegateMap", null);
        term51686 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51284;
        callMethod(klass, "containsValue", argTypes, term51136, args);
        assertTrue(recursiveEquals(term51136, term51684));
        assertTrue(recursiveEquals(term51284, term51686));
    }

};
