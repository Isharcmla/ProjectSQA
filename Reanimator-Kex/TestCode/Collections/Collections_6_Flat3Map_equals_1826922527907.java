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

public class Flat3Map_equals_1826922527907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240330;
     Object term240520;
     Object term240730;

    public Flat3Map_equals_1826922527907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240330 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term240428 = newInstance(Class.forName("java.util.stream.SortedOps$SizedIntSortingSink"));
        setField(term240330, term240330.getClass(), "delegateMap", null);
        setIntField(term240330, term240330.getClass(), "size", 3);
        setField(term240330, term240330.getClass(), "key3", null);
        setField(term240330, term240330.getClass(), "value3", null);
        setField(term240330, term240330.getClass(), "key2", term240428);
        term240520 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term240618 = newInstance(Class.forName("java.util.stream.SortedOps$SizedIntSortingSink"));
        setField(term240520, term240520.getClass(), "delegateMap", null);
        setIntField(term240520, term240520.getClass(), "size", 3);
        setField(term240520, term240520.getClass(), "key3", term240618);
        setField(term240520, term240520.getClass(), "key2", null);
        setField(term240520, term240520.getClass(), "value2", null);
        setIntField(term240520, term240520.getClass(), "hash3", -1);
        setIntField(term240520, term240520.getClass(), "hash2", -1);
        setIntField(term240520, term240520.getClass(), "hash1", 0);
        term240730 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term240731 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term240730, term240730.getClass(), "size", 3);
        setIntField(term240730, term240730.getClass(), "hash1", 0);
        setIntField(term240730, term240730.getClass(), "hash2", 0);
        setIntField(term240730, term240730.getClass(), "hash3", 0);
        setField(term240730, term240730.getClass(), "key1", null);
        setIntField(term240731, term240731.getClass(), "size", 0);
        setIntField(term240731, term240731.getClass(), "hash1", 0);
        setIntField(term240731, term240731.getClass(), "hash2", 0);
        setIntField(term240731, term240731.getClass(), "hash3", 0);
        setField(term240731, term240731.getClass(), "key1", null);
        setField(term240731, term240731.getClass(), "key2", null);
        setField(term240731, term240731.getClass(), "key3", null);
        setField(term240731, term240731.getClass(), "value1", null);
        setField(term240731, term240731.getClass(), "value2", null);
        setField(term240731, term240731.getClass(), "value3", null);
        setField(term240731, term240731.getClass(), "delegateMap", null);
        setField(term240730, term240730.getClass(), "key2", term240731);
        setField(term240730, term240730.getClass(), "key3", null);
        setField(term240730, term240730.getClass(), "value1", null);
        setField(term240730, term240730.getClass(), "value2", null);
        setField(term240730, term240730.getClass(), "value3", null);
        setField(term240730, term240730.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term240520;
        Object retValue = callMethod(klass, "equals", argTypes, term240330, args);
        assertTrue(recursiveEquals(term240330, term240730));
        assertTrue(recursiveEquals(term240520, 0));
        assertTrue(recursiveEquals(retValue, true));
    }

};


