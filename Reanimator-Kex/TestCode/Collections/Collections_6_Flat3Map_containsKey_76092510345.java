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

public class Flat3Map_containsKey_76092510345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57500;
     Object term57642;
     Object term57644;

    public Flat3Map_containsKey_76092510345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57500 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57546 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term57500, term57500.getClass(), "delegateMap", null);
        setIntField(term57500, term57500.getClass(), "size", 0);
        setIntField(term57500, term57500.getClass(), "hash1", 0);
        setField(term57500, term57500.getClass(), "key1", term57546);
        term57642 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57643 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term57642, term57642.getClass(), "size", 0);
        setIntField(term57642, term57642.getClass(), "hash1", 0);
        setIntField(term57642, term57642.getClass(), "hash2", 0);
        setIntField(term57642, term57642.getClass(), "hash3", 0);
        setIntField(term57643, term57643.getClass(), "size", 0);
        setIntField(term57643, term57643.getClass(), "hash1", 0);
        setIntField(term57643, term57643.getClass(), "hash2", 0);
        setIntField(term57643, term57643.getClass(), "hash3", 0);
        setField(term57643, term57643.getClass(), "key1", null);
        setField(term57643, term57643.getClass(), "key2", null);
        setField(term57643, term57643.getClass(), "key3", null);
        setField(term57643, term57643.getClass(), "value1", null);
        setField(term57643, term57643.getClass(), "value2", null);
        setField(term57643, term57643.getClass(), "value3", null);
        setField(term57643, term57643.getClass(), "delegateMap", null);
        setField(term57642, term57642.getClass(), "key1", term57643);
        setField(term57642, term57642.getClass(), "key2", null);
        setField(term57642, term57642.getClass(), "key3", null);
        setField(term57642, term57642.getClass(), "value1", null);
        setField(term57642, term57642.getClass(), "value2", null);
        setField(term57642, term57642.getClass(), "value3", null);
        setField(term57642, term57642.getClass(), "delegateMap", null);
        term57644 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term57645 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term57644, term57644.getClass(), "size", 0);
        setIntField(term57644, term57644.getClass(), "hash1", 0);
        setIntField(term57644, term57644.getClass(), "hash2", 0);
        setIntField(term57644, term57644.getClass(), "hash3", 0);
        setIntField(term57645, term57645.getClass(), "size", 0);
        setIntField(term57645, term57645.getClass(), "hash1", 0);
        setIntField(term57645, term57645.getClass(), "hash2", 0);
        setIntField(term57645, term57645.getClass(), "hash3", 0);
        setField(term57645, term57645.getClass(), "key1", null);
        setField(term57645, term57645.getClass(), "key2", null);
        setField(term57645, term57645.getClass(), "key3", null);
        setField(term57645, term57645.getClass(), "value1", null);
        setField(term57645, term57645.getClass(), "value2", null);
        setField(term57645, term57645.getClass(), "value3", null);
        setField(term57645, term57645.getClass(), "delegateMap", null);
        setField(term57644, term57644.getClass(), "key1", term57645);
        setField(term57644, term57644.getClass(), "key2", null);
        setField(term57644, term57644.getClass(), "key3", null);
        setField(term57644, term57644.getClass(), "value1", null);
        setField(term57644, term57644.getClass(), "value2", null);
        setField(term57644, term57644.getClass(), "value3", null);
        setField(term57644, term57644.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57500;
        callMethod(klass, "containsKey", argTypes, term57500, args);
        assertTrue(recursiveEquals(term57500, term57642));
        assertTrue(recursiveEquals(term57500, term57644));
    }

};


