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

public class Flat3Map_equals_1826922527786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159652;
     Object term159896;
     Object term160473;
     Object term160475;

    public Flat3Map_equals_1826922527786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159652 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term159804 = newInstance(Class.forName("org.apache.commons.collections.list.PredicatedList$PredicatedListIterator"));
        setField(term159652, term159652.getClass(), "delegateMap", null);
        setIntField(term159652, term159652.getClass(), "size", 3);
        setField(term159652, term159652.getClass(), "key3", term159804);
        term159896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term159896, term159896.getClass(), "delegateMap", null);
        setIntField(term159896, term159896.getClass(), "size", 3);
        setIntField(term159896, term159896.getClass(), "hash3", 0);
        term160473 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term160474 = newInstance(Class.forName("org.apache.commons.collections.list.PredicatedList$PredicatedListIterator"));
        setIntField(term160473, term160473.getClass(), "size", 3);
        setIntField(term160473, term160473.getClass(), "hash1", 0);
        setIntField(term160473, term160473.getClass(), "hash2", 0);
        setIntField(term160473, term160473.getClass(), "hash3", 0);
        setField(term160473, term160473.getClass(), "key1", null);
        setField(term160473, term160473.getClass(), "key2", null);
        setField(term160474, term160474.getClass(), "this$0", null);
        setField(term160474, term160474.getClass(), "iterator", null);
        setField(term160473, term160473.getClass(), "key3", term160474);
        setField(term160473, term160473.getClass(), "value1", null);
        setField(term160473, term160473.getClass(), "value2", null);
        setField(term160473, term160473.getClass(), "value3", null);
        setField(term160473, term160473.getClass(), "delegateMap", null);
        term160475 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term160475, term160475.getClass(), "size", 3);
        setIntField(term160475, term160475.getClass(), "hash1", 0);
        setIntField(term160475, term160475.getClass(), "hash2", 0);
        setIntField(term160475, term160475.getClass(), "hash3", 0);
        setField(term160475, term160475.getClass(), "key1", null);
        setField(term160475, term160475.getClass(), "key2", null);
        setField(term160475, term160475.getClass(), "key3", null);
        setField(term160475, term160475.getClass(), "value1", null);
        setField(term160475, term160475.getClass(), "value2", null);
        setField(term160475, term160475.getClass(), "value3", null);
        setField(term160475, term160475.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term159896;
        Object retValue = callMethod(klass, "equals", argTypes, term159652, args);
        assertTrue(recursiveEquals(term159652, term160473));
        assertTrue(recursiveEquals(term159896, term160475));
        assertTrue(recursiveEquals(retValue, false));
    }

};
