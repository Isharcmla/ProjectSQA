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

public class Flat3Map_remove_8406902791076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213451;
     Object term213543;
     Object term213907;
     Object term213908;

    public Flat3Map_remove_8406902791076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term213451 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term213451, term213451.getClass(), "delegateMap", null);
        setIntField(term213451, term213451.getClass(), "size", 3);
        setIntField(term213451, term213451.getClass(), "hash3", 0);
        setField(term213451, term213451.getClass(), "key3", null);
        setIntField(term213451, term213451.getClass(), "hash2", 0);
        setField(term213451, term213451.getClass(), "key2", term213451);
        term213543 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213653 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term213543, term213543.getClass(), "delegateMap", null);
        setIntField(term213543, term213543.getClass(), "size", 3);
        setIntField(term213543, term213543.getClass(), "hash3", 0);
        setIntField(term213653, term213653.getClass(), "size", 0);
        setField(term213543, term213543.getClass(), "value3", term213653);
        setIntField(term213543, term213543.getClass(), "hash2", 0);
        setField(term213543, term213543.getClass(), "value2", null);
        setIntField(term213543, term213543.getClass(), "hash1", 0);
        setField(term213543, term213543.getClass(), "value1", null);
        term213907 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term213907, term213907.getClass(), "size", 3);
        setIntField(term213907, term213907.getClass(), "hash1", 0);
        setIntField(term213907, term213907.getClass(), "hash2", 0);
        setIntField(term213907, term213907.getClass(), "hash3", 0);
        setField(term213907, term213907.getClass(), "key1", null);
        setField(term213907, term213907.getClass(), "key2", term213907);
        setField(term213907, term213907.getClass(), "key3", null);
        setField(term213907, term213907.getClass(), "value1", null);
        setField(term213907, term213907.getClass(), "value2", null);
        setField(term213907, term213907.getClass(), "value3", null);
        setField(term213907, term213907.getClass(), "delegateMap", null);
        term213908 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term213909 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term213908, term213908.getClass(), "size", 3);
        setIntField(term213908, term213908.getClass(), "hash1", 0);
        setIntField(term213908, term213908.getClass(), "hash2", 0);
        setIntField(term213908, term213908.getClass(), "hash3", 0);
        setField(term213908, term213908.getClass(), "key1", null);
        setField(term213908, term213908.getClass(), "key2", null);
        setField(term213908, term213908.getClass(), "key3", null);
        setField(term213908, term213908.getClass(), "value1", null);
        setField(term213908, term213908.getClass(), "value2", null);
        setFloatField(term213909, term213909.getClass(), "loadFactor", 0.0F);
        setIntField(term213909, term213909.getClass(), "size", 0);
        setField(term213909, term213909.getClass(), "data", null);
        setIntField(term213909, term213909.getClass(), "threshold", 0);
        setIntField(term213909, term213909.getClass(), "modCount", 0);
        setField(term213909, term213909.getClass(), "entrySet", null);
        setField(term213909, term213909.getClass(), "keySet", null);
        setField(term213909, term213909.getClass(), "values", null);
        setField(term213909, term213909.getClass(), "keySet", null);
        setField(term213909, term213909.getClass(), "values", null);
        setField(term213908, term213908.getClass(), "value3", term213909);
        setField(term213908, term213908.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term213543;
        Object retValue = callMethod(klass, "remove", argTypes, term213451, args);
        assertTrue(recursiveEquals(term213451, term213907));
        assertTrue(recursiveEquals(term213543, term213908));
        assertTrue(recursiveEquals(retValue, null));
    }

};
