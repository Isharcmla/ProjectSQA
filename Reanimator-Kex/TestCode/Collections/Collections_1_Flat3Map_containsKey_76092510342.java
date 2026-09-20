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

public class Flat3Map_containsKey_76092510342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61591;
     Object term61683;
     Object term62045;
     Object term62046;

    public Flat3Map_containsKey_76092510342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61591 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term61591, term61591.getClass(), "delegateMap", null);
        setIntField(term61591, term61591.getClass(), "size", 1);
        term61683 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term62045 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62045, term62045.getClass(), "size", 1);
        setIntField(term62045, term62045.getClass(), "hash1", 0);
        setIntField(term62045, term62045.getClass(), "hash2", 0);
        setIntField(term62045, term62045.getClass(), "hash3", 0);
        setField(term62045, term62045.getClass(), "key1", null);
        setField(term62045, term62045.getClass(), "key2", null);
        setField(term62045, term62045.getClass(), "key3", null);
        setField(term62045, term62045.getClass(), "value1", null);
        setField(term62045, term62045.getClass(), "value2", null);
        setField(term62045, term62045.getClass(), "value3", null);
        setField(term62045, term62045.getClass(), "delegateMap", null);
        term62046 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term62046, term62046.getClass(), "size", 0);
        setIntField(term62046, term62046.getClass(), "hash1", 0);
        setIntField(term62046, term62046.getClass(), "hash2", 0);
        setIntField(term62046, term62046.getClass(), "hash3", 0);
        setField(term62046, term62046.getClass(), "key1", null);
        setField(term62046, term62046.getClass(), "key2", null);
        setField(term62046, term62046.getClass(), "key3", null);
        setField(term62046, term62046.getClass(), "value1", null);
        setField(term62046, term62046.getClass(), "value2", null);
        setField(term62046, term62046.getClass(), "value3", null);
        setField(term62046, term62046.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61683;
        callMethod(klass, "containsKey", argTypes, term61591, args);
        assertTrue(recursiveEquals(term61591, term62045));
        assertTrue(recursiveEquals(term61683, term62046));
    }

};
